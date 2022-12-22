package com.pattern.singleton;

import java.util.Scanner;

public class MyApp {

	public static void main(String[] args) {
		
		ScannerUtil scannerUtil = ScannerUtil.getInstance();
		Scanner scanner = scannerUtil.openScanner();
		
		System.out.println("Enter your choice : ");
		System.out.println("Press 1 : Login");
		System.out.println("Press 2 : Register");
		
		int choice = scanner.nextInt();
		
		if(choice == 1) {
			LoginPage loginPage = new LoginPage();
			loginPage.login();
		}
		else if (choice == 2) {
			RegisterPage registerPage = new RegisterPage();
			registerPage.register();
		}
		else {
			System.out.println("Wrong choice !");
		}
		
		scannerUtil.closeScanner();
		
	}
	
}
