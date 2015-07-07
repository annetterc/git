import world.Plant;

/*
 * private -- only within same class
 * public -- from anywhere
 * protected -- same class, subclass(child class) and same package
 * no modifier -- same package only
 */


public class App {

	public static void main(String[] args) {
		
		Plant plant = new Plant();
		
		System.out.println(plant.name);

		System.out.println(plant.ID);
		
		// Won't work 'type' is private
			//System.out.println(plant.type);
			//System.out.println(plant.size);
		// Won't work because App and Plant are in different packages
			//System.out.println(plant.height);
	}

}
