
public class Car extends Machine {  // car is a child of Machine class, or inherits from machine

//	public void start() {
//		System.out.println("Car started");
//	}
	
	// Below is a better way of overwriting a method instead of doing the above
	/* (non-Javadoc)
	 * @see Machine#start()
	 */
	@Override
	public void start() {
		System.out.println("Car started");
	}

	public void wipeWindShield() {
		System.out.println("Wiping Windshield");
	}
	
	public void showInfo() {
		System.out.println("Machine name: " + name);
	}
	
}
