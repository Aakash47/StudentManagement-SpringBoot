# Student Management with Springboot and hibernate

---

# Student Management System

This is a simple Student Management System web application built using:

- Spring Boot
- Spring MVC
- Hibernate
- Thymeleaf
- MySQL

## Features

- Add a new student
- List all students
- Form validation (e.g., name required, age ≥ 18)
- Stores data in MySQL database

## Requirements

- Java 8 or higher
- Maven
- MySQL

## Setup Instructions

1. **Clone the project**
   ```bash
   git clone https://github.com/your-username/student-management.git
   cd student-management
   ```

2. **Create a MySQL Database**
   ```sql
   CREATE DATABASE studentdb;
   ```

3. **Update `application.properties`**
   ```properties
   spring.datasource.url=jdbc:mysql://localhost:3306/studentdb
   spring.datasource.username=your_username
   spring.datasource.password=your_password
   ```

4. **Run the application**
   ```bash
   mvn spring-boot:run
   ```

5. **Access in browser**
   ```
   http://localhost:8080/
   ```

## Project Structure

- `controller` – Handles web requests
- `entity` – Student model with validation
- `repository` – Handles DB operations
- `templates` – HTML files (Thymeleaf)

## Technologies Used

- Spring Boot Starter Web
- Spring Boot Starter Data JPA
- Spring Boot Starter Thymeleaf
- Spring Boot Starter Validation
- MySQL Driver

## Author

This project is made for learning purposes.

---