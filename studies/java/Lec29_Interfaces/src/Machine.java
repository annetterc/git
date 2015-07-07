
public class Machine implements Info {  // if I use an interface I need to have a header defined in the Interface:  Info.java -> then go to Source > Override/Implement method to add an override for the method
	
	private int id = 7;
	
	public void start() {
		System.out.println("Machine started");
	}

	/* (non-Javadoc)
	 * @see Info#showInfo()
	 */
	@Override
	public void showInfo() {
		System.out.println("Machine ID is: " + id);
	}
}
