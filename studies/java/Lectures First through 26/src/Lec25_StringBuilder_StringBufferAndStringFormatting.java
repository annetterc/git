
public class Lec25_StringBuilder_StringBufferAndStringFormatting {

	public static void main(String[] args) {
		// The below is quite common in Java but very inefficient since Strings are incomputable, meaning once set, it can never be changed
		String info = "";
		
		info += "My name is Bob."; // with these '+=' we are creating a new string to be added on to the previous info(s) and assign it to:  info
		info += " ";
		info += "I am a builder";
		
		System.out.println(info);
		//End of inefficient code
		
		// Below is the way it should be done - which is more memory efficient
		StringBuilder sb = new StringBuilder(); // can have 2 quotes in there or nothing at all to initialize it
		
		// StringBuffer and StringBuilder are essentially the same, StringBuilder is newer and not thread safe
		
		sb.append("This is an sb string and my name is Sue");  // using this will just modify the original String sb
		sb.append(" ");
		sb.append("and I am the bulder using StringBuilder");
		
		System.out.println(sb);
		
StringBuilder s = new StringBuilder(); // can have 2 quotes in there or nothing at all to initialize it
		
		s.append("My name is Roger");  // using this will just modify the original String sb
		s.append(" ");
		s.append("and I am a skydiver and a bulder using StringBuilder\n\n");
		// or I can call it like this:
		s.append("My name is Roger 1").append(" ").append("and I am a skydiver and a bulder using StringBuilder");
		
		System.out.println(s);
		
		////////// Formatting /////////////////////
		System.out.println("Here is some text.\tThis was a tab.\nThat was a new line");
		// Formatting Integers
		System.out.printf("Total cost $%d: quantity is %d\n", 50, 13);  // string formatter - it takes the argument '5' and put it in %d
		// Formatting Integer and a string
		for(int i = 0; i < 20; i++) {
			System.out.printf("%2d: %s",i,"Some text here again\n");  // having the number 2 in the middle of %d, like %2d, means make the digits 2 decimals wide - %d is used for decimals  %s is used for strings
		}
		// Formatting a floating point
		System.out.printf("Total value: %.3f\n", 55.44455); // %f is used for floating point - for 3 numbers after the comma use:  %.3f, will round up with 5 and down with 0-4
		System.out.printf("Total value: %6.1f\n", 55.44455); // the %6.1 means:  6 spaces padding on the left and 1 number after the .
		
	}

}
