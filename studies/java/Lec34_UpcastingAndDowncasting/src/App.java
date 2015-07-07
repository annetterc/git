class Machine {
	public void start() {
		System.out.println("Machine started");
	}
}

class Camera extends Machine {
	public void start() {
		System.out.println("Camera started");
	}
	public void snap() {
		System.out.println("Photo taken");
	}
}

public class App {

	public static void main(String[] args) {

		Machine machine1 = new Machine();
		Camera camera1 = new Camera();
		
		machine1.start();
		camera1.start();
		camera1.snap();
		
		// Upcasting -- is safe, guaranteed by polymorphism
		Machine machine2 = new Camera();  // this is polymorphism -- Camera is a child class that extends Machine
			// or do the below
		Machine machine3 = camera1;  // I made machine3 refer to camera1 -- I upcasted camera1 to machine3, since I'm going up in the class hierachy to the parent
		
		machine3.start();
		// error: machine3.snap();  -- since there is no snap method in the parent class Machine
		
		// Downcasting -- 
		Machine machine4 = new Camera();
		// machine4.snap();  would not work because
		Camera camera2 = (Camera) machine4;  // you need to cast here so java gets confirmation 
		// java does want to have confirmation in the above, because downcasting isn't inhertiavely safe
		camera2.snap();
		
		// The below doesn't work -- runtime error
//		Machine machine5 = new Machine();
//		Camera camera4 = (Camera)machine5;  //  Exception in thread "main" java.lang.ClassCastException: Machine cannot be cast to Camera at App.main(App.java:43)
//		camera4.start(); // this will not work since machine5 is actually a machine object, so I would get a Cast Exception error
//		camera4.snap();  // this will not work since machine5 is actually a machine object, so I would get a Cast Exception error
		
		
		
	}

}
