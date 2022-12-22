package com.pattern.singleton;

import java.util.Scanner;

public class RegisterPage {

	public void register() {
		
		ScannerUtil scannerUtil = ScannerUtil.getInstance();
		Scanner scanner = scannerUtil.openScanner();
		
		System.out.println("Welcome to register page !");
		System.out.println("Enter your username : ");
		String username = scanner.next();
		System.out.println("Create your password : ");
		String password = scanner.next();
		
		System.out.println("Congrats ! You have registered as "+username);
		System.out.println("Your password is "+password);
		
	}
}
