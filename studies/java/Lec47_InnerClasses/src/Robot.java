
public class Robot {

	private int id;
	
	//// This is a nested/inner Classes
	class Brain {
		void think() {
			System.out.println("Robot " + id + " is thinking");
		}
	}
	
	// static inner classes are very common
	static class Battery {  // because this class is static, I can't use id within this class
		public void charge() {
			System.out.println("Battery is charging...");
		}
	}
	////End nested/inner Class

	public Robot(int id) {
		this.id = id;
	}
	
	public void start() {
		System.out.println("Starting Robot "+ id);
		
		Brain brain = new Brain();
		brain.think();
		
		String name = "Robert";
		
		// I can create an inner class here which also has access to id
		class Temp {  // this could only be used within this method and cannot be referenced outside of it and cannot be private or static etc
			public void doSomething() {
				System.out.println("My ID is: " + id);
				System.out.println(" and my name is: " + name);
			}
		}
		Temp temp = new Temp();
		temp.doSomething();
	}
	
}
