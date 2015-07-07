
// not all classes can be extended like Car.java/Machine.java, for example 'String' class can not be extended because it's a 'final' class and of course any other 'final' class can not be extended

public class Lec27_Inheritance {
	public static void main(String[] args) {
		
		Machine mach1 = new Machine();
		
		mach1.start();
		mach1.stop();
		
		Car car1 = new Car();
		
		car1.start();
		car1.wipeWindShield();
		car1.showInfo();
		car1.stop();
		
	}
}
