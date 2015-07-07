
public class App {
	
	public static void main(String[] args) {
		
		// the below is for switch statements
		Animal animal = Animal.CAT;  // this is using the enum class Animal
		
		switch(animal) {
		case CAT:
			System.out.println("cat");
			break;
		case DOG:
			break;
		case MOUSE:
			break;
		default:
			break;
		}
		
		System.out.println(Animal.DOG); // will just print out DOG as a String 
		
		System.out.println(Animal.DOG.getClass()); // This prints out the class name of it
		
		System.out.println(Animal.DOG instanceof Animal); // checks to see if DOG is an instance of class Animal and puts out true in this case
		// I could also say:
		System.out.println(Animal.DOG instanceof Enum);  // prints out true, since class Animal is an Enum Class
		
		System.out.println(Animal.MOUSE.getName());
		
		System.out.println(Animal.CAT.toString());
		
		// Enum Name as a String it will print out its Enum name
		System.out.println("Enum Name as a String: " + Animal.DOG.name());
		
		Animal animal2 = Animal.valueOf("CAT");
		System.out.println(animal2);
	}
}
