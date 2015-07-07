class Robot {
	
	public void speak(String text) {  // here the param comes out of the "chute" - hence declare a String here
		System.out.println(text);
	}
	
	public void jump(int heigth) {
		System.out.println("Jumping "+ heigth + " feet");
	}
	
	public void move(String direction, double distance) {
		System.out.println("Moving " + distance + " meters in direction " + direction);
	}
	
}
public class Lec21_MethodParameters {

	public static void main(String[] args) {
		Robot sam = new Robot();
		
		// pass param into method speak
		sam.speak("Hi I'm Sam! ");
		sam.jump(12);
		sam.move("West", 12.23);
		
		String greeting = "Hello there";
		sam.speak(greeting);
	}
	
}
