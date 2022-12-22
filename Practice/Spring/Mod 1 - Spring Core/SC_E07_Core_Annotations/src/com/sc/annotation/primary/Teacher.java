package com.sc.annotation.primary;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Teacher {

	private Pen pen;
	
	public Pen getPen() {
		return pen;
	}

	@Autowired
	@Qualifier(value = "bluePen")
	public void setPen(Pen pen) {
		this.pen = pen;
	}

	public void teach() {
		System.out.println("Teacher is "+pen.writing());
	}

}