package com.sc.annotation.beanwithdependency;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {

	@Bean(name = { "rohit", "sourabh", "sumit" })
	public Student getStudent() {
		Attendance markAttendance = this.markAttendance();
		Student student = new Student();
		student.setAttendance(markAttendance);
		return student;
	}

	@Bean(name="attendance")
	public Attendance markAttendance() {
		return new Attendance();
	}
	
}
