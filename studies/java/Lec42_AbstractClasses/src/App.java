
public class App {

	public static void main(String[] args) {
		
		Camera cam1 = new Camera();
		cam1.setId(5);
		
		Car car1 = new Car();
		car1.setId(3);
		
		// You wouldn't want to do the below, since Machine is just a common denominator for Camera and Car, with a method both of those could use
//		 Machine machine1 = new Machine();
//		 machine1.setId(2);
		// so to prevent a user to use the class Machine directly I can make the class Abstract...see Machine.java
		
//		cam1.start();
//		cam1.doStuff();
//		cam1.shutDown();
//		
//		car1.start();
//		car1.doStuff();
//		car1.shutDown();
		
		// the below does run the above 6 items, which is in Machine.java
		cam1.run();
		
		car1.run();
		
	}
	
}
