package com.java14;

public class SwitchExpressionDeepDive {

	public static void main(String[] args) {
		
		int n = 7;
		
		System.out.println(switchTesting(n));
		
	}

	private static String switchTesting(int n) {
		
		String result = "Odd";
		
		String str = switch(n) {
		case 1, 3, 5 -> result;
		case 2, 4, 6 -> {
			yield result.replace("Odd", "Even");
		}
		case 7, 8, 9 -> result.concat("Even");
		default -> "Wrong Input";
		};
		
		return str;
	}
	
}
