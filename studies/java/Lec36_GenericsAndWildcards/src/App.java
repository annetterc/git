import java.util.ArrayList;

class Machine {

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "I am a Machine";
	}

	public void start() {
		System.out.println("Machine started");
	}

}

class Camera extends Machine {

	@Override
	public String toString() {
		return "I am a Camera";
	}

	public void snap() {
		System.out.println("snap!");
	}

}

public class App {

	public static void main(String[] args) {

		ArrayList<Machine> list1 = new ArrayList<Machine>();
		list1.add(new Machine());
		list1.add(new Machine());

		ArrayList<Camera> list2 = new ArrayList<Camera>(); // ArrayList Camera
															// is not a subClass
															// of ArrayList
															// Machine
		list2.add(new Camera());
		list2.add(new Camera());

		showList(list1, list2); // This passes the values to the method showlist
		showList2(list1);
		showList3(list2);
	}

	// public static void showList(ArrayList<Machine> list, ArrayList<Camera>
	// listA) { // the var "list" does not have to match the above var, only the
	// var within this method
	public static void showList(ArrayList<? extends Machine> list,
			ArrayList<?> listA) { // instead of declaring the class Machine and
									// Camera, you can use the wildcard '?' here
									// -- you read the '?' as unknown type
		// because you were using a wildcard above, you will have to declare the
		// Type of 'value' as 'Object' instead of Machine and Camera
		// could also be any subtype of Machine with a ?
		for (Object value : list) {
			System.out.println(value);
		}
		for (Object value : listA) {
			System.out.println(value);
		}

		// because of the '?' I can also do:
		for (Machine value : list) { // this is pretty much the same as
										// list.get();
			System.out.println(value);
			value.start();
		}

	}

	// The below can call any method in a super class like Object, this is also
	// why it needs the Type defined as Object
	public static void showList2(ArrayList<? super Camera> list) { // instead of
																	// declaring
																	// the class
																	// Machine
																	// and
																	// Camera,
																	// you can
																	// use the
																	// wildcard
																	// '?' here
																	// -- you
																	// read the
																	// '?' as
																	// unknown
																	// type
		for (Object value : list) {
			System.out.println(value);
			// value.toString(); super class like toString, since this is a
			// method of Object
		}
	}

	// This is pretty
	public static void showList3(ArrayList<?> list) {
		for (Object value : list) {
			System.out.println(value);
		}
	}
}
