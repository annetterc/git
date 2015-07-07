
public class Person implements Info {
	
	private String name;
	
	public Person(String name) {
		//super();  - not needed because Person is a child of object
		this.name = name;
	}



	public void greet() {
		System.out.println("Hello there " + name);
	}

	@Override
	public void showInfo() {
		System.out.println("Person's name is:  " + name);
		
	}
}
