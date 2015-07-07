
public class App {

	public static void main(String[] args) {
		/*
		int value = 7;
		
		value = value/0;  // This will throw a 'java.lang.ArithmeticException' , but since it's a childclass of RuntimeException -- hence it is a 'RuntimeException'
		*/
		
		/*
		String text = null;
		
		System.out.println(text.length());  // this throws a NullPointerException, since the text is initialized to 'null'
		*/
		////////
		
		String[] texts = {"one", "two", "three"};
		
		try {
			System.out.println(texts[3]);  // this throws an 'ArrayIndexOutOfBoundsException', since there are only items 0, 1, 2 in the array
		} catch(Exception e) {
			System.out.println(e.toString());
		}
	}
	
}
