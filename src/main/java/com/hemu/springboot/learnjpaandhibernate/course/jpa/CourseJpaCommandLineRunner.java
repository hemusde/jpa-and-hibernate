package com.hemu.springboot.learnjpaandhibernate.course.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.hemu.springboot.learnjpaandhibernate.course.Course;

import jakarta.transaction.Transactional;

@Component
@Transactional
public class CourseJpaCommandLineRunner implements CommandLineRunner {

	@Autowired
	private CourseJpaRepository repository;

	@Override
	public void run(String... args) throws Exception {
		repository.insert(new Course(1, "Learn AWS jpa!", "hemu"));
		repository.insert(new Course(2, "Learn Azure jpa!", "hemu"));
		repository.insert(new Course(3, "Learn Devops jpa!", "hemu"));

		repository.deleteById(1);

		System.out.println(repository.findById(2));
		System.out.println(repository.findById(3));
	}

}
