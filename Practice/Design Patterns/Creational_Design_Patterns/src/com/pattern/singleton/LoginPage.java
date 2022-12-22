package com.pattern.singleton;

import java.util.Scanner;

public class LoginPage {

	public void login() {
		
		ScannerUtil scannerUtil = ScannerUtil.getInstance();
		Scanner scanner = scannerUtil.openScanner();
		
		System.out.println("Welcome to login page !");
		System.out.println("Enter your username : ");
		String username = scanner.next();
		System.out.println("Enter your password : ");
		String password = scanner.next();
		
		System.out.println("Congrats ! You have logged as "+username);
		System.out.println("Your password is "+password);
		
	}
	
}
