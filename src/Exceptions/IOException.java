package Exceptions;

import java.io.File;

public class IOException {
	public static void main(String[] args) throws java.io.IOException {
		File f=new File("C:\\Users\\Rajir\\esktop\\New folder\\Don.java");
		f.createNewFile();
//		try {
//			f.createNewFile();
//		} catch (java.io.IOException e) {
//		
//		System.out.println("exception hanle");
//		}
		
	}

}
