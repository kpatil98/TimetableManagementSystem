package com.komal.TimetableManagementSystem.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.komal.TimetableManagementSystem.entity.Course;

public interface CourseRepo extends JpaRepository<Course, Integer>{

}
