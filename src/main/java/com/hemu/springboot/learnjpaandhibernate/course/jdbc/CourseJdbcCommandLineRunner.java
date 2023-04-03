package com.hemu.springboot.learnjpaandhibernate.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.hemu.springboot.learnjpaandhibernate.course.Course;

@Component
public class CourseJdbcCommandLineRunner implements CommandLineRunner {

	@Autowired
	private CourseJdbcRepository repository;

	@Override
	public void run(String... args) throws Exception {
		repository.insert(new Course(1, "Learn AWS Now!", "hemu"));
		repository.insert(new Course(2, "Learn Azure Now!", "hemu"));
		repository.insert(new Course(3, "Learn Devops Now!", "hemu"));

		repository.deleteById(1);
	}

}
