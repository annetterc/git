
public class Car extends Machine {

	@Override
	public void start() {
		
		System.out.println("Car started...");
		
	}

	@Override
	public void doStuff() {

		System.out.println("Car is doing stuff...");
		
	}

	@Override
	public void shutDown() {

		System.out.println("Car is shutting down...");
		
	}

}
