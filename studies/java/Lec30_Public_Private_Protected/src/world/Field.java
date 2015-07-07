package world;

public class Field {
	private Plant plant = new Plant();
	
	public Field() {
		
		// size is protected and 'Field' is in the same package as Plant - if all the plants are within a different package it won't work since it is set to: protected
		System.out.println(plant.size);
	}
	
}
