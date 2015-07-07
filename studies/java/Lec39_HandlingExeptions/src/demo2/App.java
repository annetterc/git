package demo2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class App {

	public static void main(String[] args) {
		File file = new File("test1.txt");
		
		// if I wanted to read the file, I can use FileReader instead of FileScanner
		try {
			FileReader fr = new FileReader(file);
			System.out.println("Continuing...");  // this will not run if an exception is thrown
		} catch (FileNotFoundException e) {
			//e.printStackTrace();   -- instead of this I can do sysout as in the below
			System.out.println("File not found: " + file);
			
		} 
		
	}
	
}
