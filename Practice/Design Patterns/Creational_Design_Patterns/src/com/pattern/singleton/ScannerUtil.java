package com.pattern.singleton;

import java.util.Scanner;

public class ScannerUtil {
	
	private static ScannerUtil scannerUtil;
	
	private Scanner scanner;

	private ScannerUtil() {
		
	}
	
	public Scanner openScanner() {
		if(scanner==null) {
			System.out.println("Scanner created");
			scanner = new Scanner(System.in);
		}
		return scanner;
	}
	
	public void closeScanner() {
		System.out.println("Scanner closed");
		scanner.close();
	}
	
	public static ScannerUtil getInstance() {
		if(scannerUtil==null) {
			System.out.println("ScannerUtil created");
			scannerUtil = new ScannerUtil();
		}
		return scannerUtil;
	}
	
}
