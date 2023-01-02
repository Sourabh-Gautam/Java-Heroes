package com.sb.springjdbcdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseCmdRunner implements CommandLineRunner{

	@Autowired
	private CourseJdbcRepo courseJdbcRepo;
	
	@Override
	public void run(String... args) throws Exception {
		System.out.println("hello from cmd runner");
		courseJdbcRepo.insert(new Course(102, "sourabh", "rohit"));
		courseJdbcRepo.insert(new Course(103, "me", "he"));
		courseJdbcRepo.insert(new Course(104, "you", "she"));
		courseJdbcRepo.insert(new Course(105, "you", "she"));
		
		courseJdbcRepo.delete(102);
		
		System.out.println(courseJdbcRepo.findById(103));
	
	}

}
