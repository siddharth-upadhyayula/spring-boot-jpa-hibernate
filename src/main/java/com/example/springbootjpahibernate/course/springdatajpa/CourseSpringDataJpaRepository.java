package com.example.springbootjpahibernate.course.springdatajpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springbootjpahibernate.course.Course;

public interface CourseSpringDataJpaRepository extends JpaRepository<Course, Long>{

}
