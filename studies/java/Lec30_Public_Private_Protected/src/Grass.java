import world.Plant;

public class Grass extends Plant {
	public Grass() {
	// This won't work, because Grass is not in the same package as Plant, even though it's a subclass of Plant
		//System.out.println(this.height);
	}
}
