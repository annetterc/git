class Person2 {
	// the below gets the info from here: person1.name = "Annette"  &  person1.age = 46;
	String name;
	int age;
	
	void speak() {
		System.out.println("My name is: " + name);
	}
	
	int calculateYearsToRetirement() {
		int yearsLeft = 65 - age;
		
		//System.out.println("My years left to retirement are: " + yearsLeft);
		
		return yearsLeft;
	}
	
	// the 2 get methods get it directly from the very top name and age, which get the info from the MAIN method
	int getAge() {
		return age;
	}
	
	String getName() {
		return name;
	}
}


public class Lec20_GettersAndReturnValues {

	public static void main(String[] args) {
		Person2 person1 = new Person2();
		person1.name = "Annette";
		person1.age = 46;
		
		//person1.speak();
		int years = person1.calculateYearsToRetirement();
		
		int age1 = person1.getAge();
		String name1 = person1.getName();
		
		System.out.println(years);
		System.out.println(age1);
		System.out.println(name1);
	}
	
}
