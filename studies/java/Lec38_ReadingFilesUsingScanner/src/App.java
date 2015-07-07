import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;





public class App {

	public static void main(String[] args) throws FileNotFoundException {
		//String fileName = "/Users/annette/Documents/java/workspace/Lec38_ReadingFilesUsingScanner/example.txt";
		String fileName = "example.txt"; // if the file is in the same project I can read it like here
		File textFile = new File(fileName);
		
		// Scanner is used to read in the content of the file
		Scanner in = new Scanner(textFile);  // I could surround it with a try/catch -- to keep this file cleaner I will add a declaration and throw an exception instead
		
		// Example of reading the int value of 3 in example.txt, to only iterate over 3 lines in this case
		int value = in.nextInt();
		System.out.println("Read value: " + value);
		in.nextLine();  // there will be a blank line, since there is an invisible character in the TXT file that nextInt doesn't read, but nextLine will -- so to remove that I will have to do: in.nextLine() right after in.nextInt
		// End Example reading int value 
		// there will be a blank line, since there is an invisible character in the TXT file that nextInt doesn't read, but nextLine will -- so to remove that I will have to do: in.nextLine() right after in.nextInt
		while(in.hasNextLine()) {
			String line = in.nextLine();
			
			System.out.println(line);
		}
		
		in.close();

		
	}
	
}
