package com.sc.annotation.primary;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class BluePen implements Pen {

	@Override
	public String writing() {
		return "writing with Blue Pen";
	}
	
}
