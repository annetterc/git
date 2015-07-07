// represtens the idea of a person
class Person {
	//Instance variables (data or "state")
	String name;
	int age;
	// Classes can contain
	
	// 1. Data
	
	// 2. Subroutines which you call *methods* like the public static void main
	
}

// the required public class
public class Lec18_ClassesAndObjects {

	public static void main(String[] args) {
		// refer to the above class here
		
		// Person is the above class also called Type
		Person person1 = new Person();
		person1.name = "Joe Blog ";
		person1.age = 34;
		
		Person person2 = new Person();
		person2.name = "Ann Smith ";
		person2.age = 18;
		
		System.out.println(person1.name +"\t"+person2.name);
	}
	
}
