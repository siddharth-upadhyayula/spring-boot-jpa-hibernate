package com.example.springbootjpahibernate.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import com.example.springbootjpahibernate.course.Course;

public class CourseJdbcCommandLineRunner implements CommandLineRunner{

	@Autowired
	private CourseJdbcRepository repository; 
	
	@Override
	public void run(String... args) throws Exception {
		repository.insert(new Course(1, "Learn AWS", "Sid"));	
		repository.insert(new Course(2, "Learn GCP", "Sid"));
		repository.insert(new Course(3, "Learn DevOps", "Sid"));
		
	
		
		System.out.println(repository.findById(2));
		System.out.println(repository.findById(2));
		
	}

}
