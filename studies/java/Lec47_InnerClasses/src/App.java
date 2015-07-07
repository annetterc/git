
public class App {
	
	public static void main(String[] args) {
		
		Robot robot = new Robot(7);
		robot.start();
		
		//   The below would only work if the nested Class Brain is declared public or has neither private nor public
		//Robot.Brain brain = robot.new Brain();
		//brain.think();
		
		// unlike the above I can do this below, since it's a static class
		Robot.Battery battery = new Robot.Battery();
		battery.charge();
		
	}

}
