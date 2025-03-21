package com.studentmanagement.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.studentmanagement.entity.Student;
import com.studentmanagement.repository.StudentRepository;

@Service
public class StudentService {

	private StudentRepository studentRepository;

	public StudentService(StudentRepository studentRepository) {
		this.studentRepository = studentRepository;
	}
	
	public List<Student> listAll(){
		return studentRepository.findAll();
	}
	
	public void save(Student student) {
		studentRepository.save(student);
	}
	
	public Student get(Long id) {
		return studentRepository.findById(id).orElse(null);
	}
	
	public void delete(Long id) {
		studentRepository.deleteById(id);
	}
	
}
