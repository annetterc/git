class Frogger {
	
	private int id;
	private String name;
	
	public Frogger(int id1, String name1) {
		this.id = id1;
		this.name = name1;
	}
	
	public String toString() {
		return String.format("%d: %s", id, name);
//		StringBuilder sb = new StringBuilder();
//		sb.append(id).append(": ").append(name);
//		
//		return sb.toString();
//		
		// better than the below concatenating string, is the above append
		//return id + " : " + name;
	}
}

public class Lec26_ToStringMethod {
	public static void main(String[] args) {
		
		//Frogger frog1 = new Frogger();  // will get all the Object items like toString() etc, since the parent class always secretly creates an object class and with that frog1 will inherit all the object methods like toString()
		Frogger frog1 = new Frogger(7,"Freddy");
		Frogger frog2 = new Frogger(5,"Roger");
		//frog1.toString();
		
		System.out.println(frog1);
		System.out.println(frog2);
	}
}
