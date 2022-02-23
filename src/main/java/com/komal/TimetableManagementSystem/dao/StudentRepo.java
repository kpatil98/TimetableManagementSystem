package com.komal.TimetableManagementSystem.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.komal.TimetableManagementSystem.entity.Student;

public interface StudentRepo extends JpaRepository<Student, Integer>{

	
}
