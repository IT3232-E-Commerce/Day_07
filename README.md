# Employee Management System

A Spring Boot application for managing employees, departments and projects with JPA/Hibernate entity relationships.

## 🔍 Overview

This Employee Management System is built with Spring Boot and provides a RESTful API for managing organizational data including employees, departments and projects. The system demonstrates various JPA entity relationships and follows best practices for enterprise application development.

## ✨ Features

- **Employee Management**: Create, read, update and delete employee records
- **Department Management**: Organize employees by departments
- **Project Management**: Assign employees to multiple projects
- **Relationship Mapping**: Demonstrates One-to-Many and Many-to-Many JPA relationships
- **Database Integration**: MySQL database with Hibernate ORM
- **RESTful API**: Clean REST endpoints for all operations
- **Inheritance Mapping**: Uses JPA inheritance with `@MappedSuperclass`

## 🛠 Tech Stack

- **Backend Framework**: Spring Boot 3.5.0
- **Database**: MySQL
- **ORM**: Hibernate/JPA
- **Build Tool**: Maven
- **Java Version**: 17
- **Dependencies**:
  - Spring Boot Starter Web
  - Spring Boot Starter Data JPA
  - MySQL Connector/J
  - Spring Boot Starter Test

## 🗄 Database Schema

The system includes the following entities:

### Core Entities
- **Person** (Abstract base class)
- **Employee** (Extends Person)
- **Department**
- **Project**

### Relationships
- **Department ↔ Employee**: One-to-Many
- **Employee ↔ Project**: Many-to-Many (via project_assignments table)

## 🚀 Getting Started

### Prerequisites

Before running this application, make sure you have:

- Java 17 or higher installed
- MySQL Server running
- Maven 3.6+ (or use the included Maven wrapper)
- Git (for cloning the repository)

### Installation

1. **Clone the repository**
   ```bash
   git clone https://github.com/yourusername/employee-management-system.git
   cd employee-management-system
   ```

2. **Create MySQL Database**
   ```sql
   CREATE DATABASE systemdb;
   ```

3. **Configure Database Connection**
   
   Update `src/main/resources/application.properties` with your MySQL credentials:
   ```properties
   spring.datasource.url=jdbc:mysql://localhost:3306/systemdb
   spring.datasource.username=your_username
   spring.datasource.password=your_password
   ```

4. **Build and Run**
   
   Using Maven wrapper (recommended):
   ```bash
   ./mvnw spring-boot:run
   ```
   
   Or using installed Maven:
   ```bash
   mvn spring-boot:run
   ```

5. **Access the Application**
   
   The application will start on `http://localhost:8080`

## 🔄 Entity Relationships

### Employee → Department (Many-to-One)
```java
@ManyToOne
@JoinColumn(name = "dept_id")
private Department department;
```

### Employee ↔ Project (Many-to-Many)
```java
@ManyToMany
@JoinTable(name = "project_assignments", 
           joinColumns = @JoinColumn(name = "emp_id"), 
           inverseJoinColumns = @JoinColumn(name = "pro_id"))
private List<Project> project;
```

### Department → Employee (One-to-Many)
```java
@OneToMany(mappedBy = "department")
private List<Employee> employee;
```

## 📸 Screenshots

![Screenshot 2025-06-08 164416](https://github.com/user-attachments/assets/267332f1-412f-4ba2-9180-40c7c7080048)
