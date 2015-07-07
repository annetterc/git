package demo1;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;





public class App {

	public static void main(String[] args) throws FileNotFoundException {
		
		File file = new File("test1.txt");
		
		// if I wanted to read the file, I can use FileReader instead of FileScanner
		FileReader fr = new FileReader(file); // usually it is bad practice to use variables with only 1 or 2 letters, but in certain circumstances it is acceptable
		
	}
	
}
