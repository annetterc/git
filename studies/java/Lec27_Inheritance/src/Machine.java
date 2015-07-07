
public class Machine {
	
	protected String name = "Machine Type 1";// protected means it can be accessed from anywhere in the package of course child classes as well
	
	public void start() {
		System.out.println("Machine started");
	}
	
	public void stop() {
		System.out.println("Machine stopped");
	}
}
