class Machine {
	private String name;
	private int code;
	
	public Machine() {  // this is the constructor and must have the same name as the class
		this("Arnie ", 0);  /// calling the third constructor here, so in the output the text from the third character will show up first
		
		System.out.println("Contructor started!");
		
		//name = "Arnie";
		
	}
	
	// to call the first constructor in 2 or 3 would be this:  this();
	
	public Machine(String name) {
		this(name, 0);  /// calling the third constructor here
		
		System.out.println("Second Contructor started!\n\n");
		this.name = name;
	}
	
	public Machine(String name, int code) {
		/// calling the third constructor here would result in an infinite loop
		
		System.out.println("Third Contructor started!\n\n");
		
		this.name = name;
		this.code = code;
	}
	
}

public class Lec23_Constructors {

	public static void main(String[] args) {
		
		Machine machine1 = new Machine(); // creates a new instance of:  class Machine
		
		new Machine();
		
		Machine machine2 = new Machine("test");
		
		Machine machine3 = new Machine("Bertie ",1234);

	}
	
}
