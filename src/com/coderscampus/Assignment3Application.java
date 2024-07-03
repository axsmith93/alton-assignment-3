package com.coderscampus;

import java.io.BufferedReader;
//import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Assignment3Application {

	public static void main(String[] args) {
		
		BufferedReader fileReader = null;
		try {
			 fileReader = new BufferedReader(new FileReader("data.txt"));
			 
			 String line = "";
			 while ((line = fileReader.readLine()) != null) {
				 System.out.println(line);
			 }
		System.out.println(fileReader.readLine());
		}catch(IOException e) {
			System.out.println("oops, there was an exception");
		e.printStackTrace();
		} finally {
			try {
				System.out.println ("Closing file reader");
				fileReader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
}
}
}