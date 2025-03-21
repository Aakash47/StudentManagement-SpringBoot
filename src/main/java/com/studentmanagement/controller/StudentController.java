package com.studentmanagement.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.studentmanagement.entity.Student;
import com.studentmanagement.service.StudentService;

import jakarta.validation.Valid;

@Controller
public class StudentController {

	private StudentService studentService;

	public StudentController(StudentService studentService) {
		this.studentService = studentService;
	}

	@GetMapping("/")
	public String viewHomePage(Model model) {
		model.addAttribute("listStudents", studentService.listAll());
		return "list";
	}

	@GetMapping("/add")
	public String showForm(Model model) {
		model.addAttribute("student", new Student());
		return "form";
	}

	@PostMapping("/save")
	public String saveStudent(@ModelAttribute("student") @Valid Student student, BindingResult result) {
		if (result.hasErrors()) {
			return "form";
		}
		studentService.save(student);
		return "redirect:/";
	}

	@GetMapping("/edit/{id}")
	public String showEditForm(@PathVariable("id") Long id, Model model) {
		model.addAttribute("student", studentService.get(id));
		return "form";
	}



	@GetMapping("/delete/{id}")
	public String deleteStudent(@PathVariable("id") Long id) {
		studentService.delete(id);
		return "redirect:/";
	}
}
