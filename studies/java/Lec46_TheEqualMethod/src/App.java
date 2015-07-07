class Person {
	private int id;
	private String name;
	
	public Person(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + "]";
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	
	
}


public class App {

	public static void main(String[] args) {
		
		Person person1 = new Person(7, "Bob");
		Person person2 = new Person(5, "Sue");
		
		System.out.println(person1 == person2); // I can do this here instead of the below #2
		
		person1 = person2;
		
		System.out.println(person1 == person2); // this is the unsafer way
		
		// #2
		if(person1.equals(person2)) {
			System.out.println("person1 and person2 match");
		} else {
			System.out.println("person1 and person2 don't match");
		}
		
		Person person3 = new Person(5, "Bob");
		Person person4 = new Person(5, "Bob");
		
		System.out.println( person3.equals(person4) );
		
		// If I in turn would do the following the references would point to 2 different objects and return false, so always use .equals() to compare the content semantically
		String text1 = "Hello";
		String text2 = "Helloadfadf".substring(0, 5);
		System.out.println(text2);
		
		System.out.println(text1 == text2); // this returns false since they are pointing to 2 different objects
		System.out.println(text1.equals(text2));  //  returns true since the 'content/they are semantically the same'
		
		///////////
		
		Double value1 = 7.2;
		Double value2 = 7.2;
		
		System.out.println(value1 == value2); // This doesn't work for doubles, you will need to do the below
		System.out.println( value1.equals(value2) );
		
		int number1 = 9;  // You can use int or uppercase Integer as the type here
		int number2 = 9;
		
		System.out.println(number1 == number2); // It does work for integers
		// == does only check if 2 references point to the same object -- .equals checks to see if the value is the same within the object, hence it is the safer way
		
	}
	
}
