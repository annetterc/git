import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class App {

	public static void main(String[] args) {
		
		File file = new File("test.txt");
		
		BufferedReader br = null;
		
		try {
			FileReader fr = new FileReader(file);
			// to read in the file line by line we use BufferedReader
			br = new BufferedReader(fr);
			
			String line; // this is to reference each line in the file
			
			while( (line = br.readLine()) != null ) {
			//line = br.readLine(); -- does only read the first line
			
				System.out.println(line);
			
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("File not found: " + file.toString());
		} catch (IOException e) {
			System.out.println("Unable to read file: " + file.toString());
		} finally { // finally will always run even if exceptions are thrown
			try {
				br.close();
			} catch (IOException e) {
				System.out.println("Unable to close file: " + file.toString());
			} catch (NullPointerException ex) {
				// if it gets into here, then the File was probably never opened!
				System.out.println("");
			}
		}


	}

}
