import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class App2 {

	public static void main(String[] args) {

		File file = new File("test.txt");

		// instead of doing this as in Lec43_ ......
		// FileReader fr = new FileReader(file);

		// You can do the below:
		try (BufferedReader br = new BufferedReader(new FileReader(file))) {
			String line; // this is to reference each line in the file

			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("Can't find file " + file.toString());
		} catch (IOException e) {
			System.out.println("Unable to read file " + file.toString());
		}

	}

}
