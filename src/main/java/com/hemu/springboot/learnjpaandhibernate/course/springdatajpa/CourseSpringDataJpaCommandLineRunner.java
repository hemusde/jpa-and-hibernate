package com.hemu.springboot.learnjpaandhibernate.course.springdatajpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.hemu.springboot.learnjpaandhibernate.course.Course;

import jakarta.transaction.Transactional;

@Component
@Transactional
public class CourseSpringDataJpaCommandLineRunner implements CommandLineRunner {

	@Autowired
	private CourseSpringDataJpaRepository repository;

	@Override
	public void run(String... args) throws Exception {
		repository.save(new Course(1, "Learn AWS jpa!", "hemu"));
		repository.save(new Course(2, "Learn Azure jpa!", "hemu"));
		repository.save(new Course(3, "Learn Devops jpa!", "hemu"));

		repository.deleteById(1l);

		System.out.println(repository.findById(2l));
		System.out.println(repository.findById(3l));
	}

}
