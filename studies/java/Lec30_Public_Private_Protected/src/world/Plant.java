package world;

public class Plant {
// Bad practice to use public for String name, since usually you want to hide it from the rest of the world and have them access it through the method
	public String name;
	
// This is acceptable practice
	// if you do want it public make it a constant, meaning it needs to be accessed through the class with 'static'
	public static int ID = 8; // uppercase ID to show it is a constant and add 'final' - meaning it can not be changed/overridden
	
	private String typeOfPlant;  // private means it can only be accessed from within this class
	
	// if you want it to be able to be accessible in the child class use 'protected'
	protected String size;
	
	int height; // without specifying public, private or protected, it is now package wide accessible
	
	public Plant() {
		this.name = "Dragonfruit ";
		this.typeOfPlant = "Plant";
		
		this.size = "medium";
		
		this.height = 12;
		
	}
}
