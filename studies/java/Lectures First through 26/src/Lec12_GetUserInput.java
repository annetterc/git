import java.util.Scanner;

public class Lec12_GetUserInput {

	public static void main(String[] args) {
		
		// Create Scanner Object
		Scanner input = new Scanner(System.in);
		
		// Output prompt
		System.out.println("Enter a line of text: ");
		
		// Wait for the user to enter a line of text
		String line = input.nextLine();
		
		// Tell them what they entered
		System.out.println("You entered: " + line);
		
		// Output prompt
		System.out.println("Enter an integer: ");
		
		// Wait for the user to enter a value
		int value = input.nextInt();
		// Output prompt
				System.out.println("Enter a double: ");
		double value1 = input.nextDouble();
				
		// Tell them what they entered(includes the previously entered text from above)
		System.out.println("You entered: " + line + " of interger " + value + " and a double of " + value1);
	}

}
