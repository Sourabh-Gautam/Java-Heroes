package com.java11;

//This class demonstrate two static methods of Files class : readString() and writeString()

public class FilesNewMethod {

	public static void main(String[] args) throws Exception {
		
//		// Old Way 
		
//		File file = new File("D:\\Practice\\Java11Features\\src\\com\\java11\\sumit.txt");
//		FileReader fileReader = new FileReader(file);
//		BufferedReader bufferedReader = new BufferedReader(fileReader);
//		System.out.println(bufferedReader.readLine());
//		fileReader.close();
//		bufferedReader.close();
		
//		// New Way
//		
//		Path path = Path.of("D:\\Practice\\Java11Features\\src\\com\\java11\\sumit.txt");
//		String data = Files.readString(path);
//		System.out.println(data);
		
//		// Writing data in a file
//		
//		Path path = Path.of("D:\\Practice\\Java11Features\\src\\com\\java11\\sumit.txt");
//		Files.writeString(path, "Sumit");
	}
	
}
