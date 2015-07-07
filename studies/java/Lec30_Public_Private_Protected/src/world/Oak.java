package world;

public class Oak extends Plant {
	public Oak() {
		// Won't work variable 'typeOfPlant' is private
			//typeOfPlant = "Tree";
		
		// this works because 'size' is 'protected' and Oak is a child class of Plant
		this.size = "large";
		
		// no access specifier; so works for Plant and Oak since they are in the same package
		this.height = 14;
	}
}
