package com.sb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseCmdRunner implements CommandLineRunner{

	@Autowired
	private CourseDataJpaRepo repo;
	
	@Override
	public void run(String... args) throws Exception {
		
		System.out.println("hello from cmd runner");
		repo.save(new Course(102, "sourabh", "rohit"));
		repo.save(new Course(103, "me", "he"));
		repo.save(new Course(104, "you", "she"));
		repo.save(new Course(105, "me", "she"));
		
		repo.deleteById(105);
		
		System.out.println(repo.findById(103));
		System.out.println(repo.findByName("me"));
		System.out.println(repo.findByNameAndAuthor("sourabh", "rohit"));
		System.out.println(repo.findThroughAuthor("rohit"));
		System.out.println(repo.findThroughNameAndAuthor("sourabh", "rohit"));
	
	}

}
