package com.sc.annotation.primary;

import org.springframework.stereotype.Component;

@Component
public class BlackPen implements Pen {

	@Override
	public String writing() {
		return "writing with Black Pen";
	}
	
}
