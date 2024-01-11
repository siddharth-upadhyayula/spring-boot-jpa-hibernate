package com.example.springbootjpahibernate.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import com.example.springbootjpahibernate.course.Course;
import com.example.springbootjpahibernate.course.jpa.CourseJpaRepository;
import com.example.springbootjpahibernate.course.springdatajpa.CourseSpringDataJpaRepository;

public class CourseCommandLineRunner implements CommandLineRunner{

//	@Autowired
//	private CourseJdbcRepository repository; 
	
//	@Autowired
//	private CourseJpaRepository repository;
	
	@Autowired
	private CourseSpringDataJpaRepository repository;
	
	@Override
	public void run(String... args) throws Exception {
		repository.save(new Course(1, "Learn AWS", "Sid"));	
		repository.save(new Course(2, "Learn GCP", "S"));
		repository.save(new Course(3, "Learn DevOps", "d"));
		
	
		
		System.out.println(repository.findById(2l));
		System.out.println(repository.findById(3l));
		
		System.out.println(repository.findAll());
		
	}

}
