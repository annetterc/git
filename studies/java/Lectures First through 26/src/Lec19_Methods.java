// represtens the idea of a person
class Persons {
	//Instance variables (data or "state")
	String name;
	int age;
	// Classes can contain
	
	// 1. Data
	
	// 2. Subroutines which you call *methods* like the public static void main - also called behviour
	void speak() {
		for(int i = 0; i < 2; i++) {
		System.out.println("My name is " + name + "and my age is " + age);
		}
	}
	
	void sayHello() {
		System.out.println("Hello there!");
	}
	
}

// the required public class
public class Lec19_Methods {

	public static void main(String[] args) {
		// refer to the above class here
		
		// Person is the above class also called Type
		Persons person1 = new Persons();
		person1.name = "Joe Blog ";
		person1.age = 34;
		person1.speak();
		person1.sayHello();
		
		Persons person2 = new Persons();
		person2.name = "Ann Smith ";
		person2.age = 18;
		person2.speak();
		person2.sayHello();
		
		//System.out.println(person1.name +"\t"+person2.name);
	}
	
}
