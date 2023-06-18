package com.java12;

import java.time.LocalDate;

public class SwitchExpression {

	public static void main(String[] args) {
		
		// Print the Season name a month belong to using switch.
		// Before Java 12 :-
		
//		String month = LocalDate.now().getMonth().plus(1).toString();
//		
//		switch(month) {
//		
//		case "JANUARY" : case "FEBRUARY" : case "NOVEMBER" : case "DECEMBER" :
//			System.out.println("Winter"); break;
//		case "MARCH" : case "APRIL" : case "MAY" : case "JUNE" :
//			System.out.println("Summer"); break;
//		case "JULY" : case "AUGUST" : case "SEPTEMBER" : case "OCTOBER" :
//			System.out.println("Rainy"); break;
//		default :  System.out.println("Wrong Input");
//		
//		}
		
		// In Java 12 :-
		// Print the Season name a month belong to using switch.
		
//		String month = LocalDate.now().getMonth().plus(1).toString();
//		
//		switch(month) {
//		
//		case "JANUARY", "FEBRUARY", "NOVEMBER", "DECEMBER" -> System.out.println("Winter");
//		case "MARCH", "APRIL", "MAY", "JUNE" -> System.out.println("Summer");
//		case "JULY", "AUGUST", "SEPTEMBER", "OCTOBER" -> System.out.println("Rainy");
//		default ->  System.out.println("Wrong Input");
		
	}
	
}
