class Frog {
	String name;  // instance variables
	int age;	// instance variables
	
	// if you set it to private, like:  private String name;  private int age; - if that is done you can no longer access it in the main method like::  frog1.name = "Bertie" 
	
	public void setName(String newName) {
		// name = name;  // means the declaration closest to it as in:  setName(String name)
		this.name = newName; // this.name is the instance variable   AND name here is the closest to it - so it assigns the passed Param to the Instance variable to be used in other methods
	}
	
	public void setAge(int newAge) {
		// age = newAge;
		this.age = newAge;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	// if I wanted to I could do the below
	public void info(String name, int age) {
		setName(name);
		setAge(age);
	}
	
}

public class Lec22_SettersAndThis {

	public static void main(String[] args) {
		
		Frog frog1 = new Frog();
		
//		frog1.setName("Bertie ");
//		frog1.setAge(2);

		frog1.info("Alpha", 5);
		
		System.out.println(frog1.getName() + frog1.getAge());
		
	}
	
}
