
public class Lec16_ArraysOfStrings {
	
	public static void main(String[] args) {
		// allocate enough memory for 3 strings
		String[] words = new String[3];
		
		words[0] = "Hello ";
		words[1] = "to ";
		words[2] = "you";
		
		System.out.println(words[2]);
		
		// allocate it all in 1 line
		String[] fruits = {"banana","apple","pear","kiwi"};
		
		// different way to loop over array
		for(String fruit : fruits) {
			System.out.println(fruit);
		}
		
		// and with ints
		int value = 123;
		
		// String is a nonPrimitive, meaning it just points to an object that holds the string - hence default value would be null
		String text = null;
		
		System.out.println(text);
		
		// assign 2 references to an array/allocate enough memory to hold 2 pointers
		String[] texts = new String[2];
		
		// allocate enough memory at that holds the string
		texts[0] = "one";
	}
	
}
