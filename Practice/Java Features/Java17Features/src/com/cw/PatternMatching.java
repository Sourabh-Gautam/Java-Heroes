package com.cw;

public class PatternMatching {

	public static void main(String[] args) {

		System.out.println(getSeason(1));

	}

	public static String getSeason(int month) {

		return switch (month) {
		case 11, 12, 1, 2:
			yield "Winter";
		case 3, 4, 5, 6:
			yield "Summer";
		case 7, 8, 9, 10:
			yield "Rainy";
		default:
			yield "Invalid Input";
		};

	}

	public static String getDayArrow(int month) {

		return switch (month) {
		case 11, 12, 1, 2 -> {
			yield "Winter";
		}
		case 3, 4, 5, 6 -> "Summer";
		case 7, 8, 9, 10 -> "Rainy";
		default -> "Invalid Input";
		};

	}

}
