package com.sb;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {

	@GetMapping("/course")
	public List<Course> getAllCourse(){
		return List.of(
				new Course(101, "Aws", "Author"),
				new Course(102, "Azure", "me"),
				new Course(103, "cloud", "you")// adding devtools
				);
	}
	
}
