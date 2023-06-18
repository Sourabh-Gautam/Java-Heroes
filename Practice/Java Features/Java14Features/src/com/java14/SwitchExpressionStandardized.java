package com.java14;

import java.time.LocalDate;

public class SwitchExpressionStandardized {
	public static void main(String[] args) {

		String month = LocalDate.now().getMonth().plus(1).toString();

		switch (month) {

		case "JANUARY", "FEBRUARY", "NOVEMBER", "DECEMBER" -> System.out.println("Winter");
		case "MARCH", "APRIL", "MAY", "JUNE" -> System.out.println("Summer");
		case "JULY", "AUGUST", "SEPTEMBER", "OCTOBER" -> System.out.println("Rainy");
		default -> System.out.println("Wrong Input");

		}
	}

}