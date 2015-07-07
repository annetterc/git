import java.util.ArrayList;
import java.util.HashMap;

class Animal {
	
}


public class App {
	
	public static void main(String[] args) {
		
		//////// This is the old style -- before java5 ////////
		ArrayList list = new ArrayList();
		
		list.add("apple");
		list.add("banana");
		list.add("orange");
		
		String fruit = (String)list.get(1); // you would need to downcast to a String
		
		System.out.println(fruit);
		
		//////// End Old Style ////////
		
		////////// Modern Style /////////  -- Need to define Type for the Generic ArrayList, in this case it will be a String(s)
		ArrayList<String> strings = new ArrayList<String>(); // basically ArrayList just manages an array internally, so you don't have to worry about the size of an array, you can just add and remove
		
		strings.add("cat");
		strings.add("dog");
		strings.add("aligator");
		
		String animals = strings.get(1);
		
		System.out.println(animals);
		
			//// There can be more than ONE type argument -- if there is more than 1 type, use HashMap ////
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		
		///// Java 7+ Style /////
		ArrayList<Animal> someList = new ArrayList<>();
		
	}
	
}
