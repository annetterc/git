// Machine.java and Person.java have nothing in common
	// but if I wanted to use the same method for showInfo in both see: Info.java

// 'extends' can only extend to 1 parent classes, but using 'implements' it can implement anything defined in the interface - multiple implements are separated by comma 'implements Info, Test1, Test2'

public class App {

	public static void main(String[] args) {
		
		Machine mach1 = new Machine();
		mach1.start();
		
		Person person1 = new Person("Reggie");
		person1.greet();
		
		// using an interface name - using the class Machine, due to that I can use type Info and only can use what is defined for Machine in Interface Info
		Info info1 = new Machine();
		info1.showInfo();// defined in Info.java Interface
		Info info2 = person1;  // person1 here is a reference to the object on line 14
		info2.showInfo();
		System.out.println("\nspacer for to see the below calls\n");
		outputInfo(mach1);
		outputInfo(person1);
	}
	
	// making the below static since it doesn't have an app object within the App.java
	private static void outputInfo(Info info) {  // this is taking a parameter of type Info (the class name of the class Info.java)
		info.showInfo();
	}

}
