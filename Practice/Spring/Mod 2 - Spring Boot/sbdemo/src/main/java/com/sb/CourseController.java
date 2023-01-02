package com.sb;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {

	@GetMapping("/courses")
	public Course[] getAllCourse(){
		return new Course[] { 
				new Course(105, "Aws", "Author"),
				new Course(102, "Azure", "me"),
				new Course(103, "cloud", "you")// adding devtools
		};
	}
	@GetMapping("/course")
	public Course getCourse(){
		return new Course(101, "Aws", "Author");
	}
	
}
//localhost:8080/course