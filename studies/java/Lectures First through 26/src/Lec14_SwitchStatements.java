import java.util.Scanner;

public class Lec14_SwitchStatements {
	public static void main(String[] args) {
		
		Scanner switchInput = new Scanner(System.in);
		
		System.out.println("Please enter a command: ");
		// switch can only be used with certain inputs, most commonly: String or int)
		String text = switchInput.nextLine();
		
		switch (text) {
		case "start":
			System.out.println("Machine started!");
			break;
		case "stop":
			System.out.println("Machine stopped!");
			break;

		default:
			System.out.println("Command not recognized!");
			break;
		}
		
	}
}
