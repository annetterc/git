
class Thing {
	public String name;  // Instance object - because every instance gets it's own copy as in the bleow thing1 and thing2	
	public static String description;
	public static final int LUCKY_NUMBER = 13;  // this is a constant - 'final' is the java's constant, meaning a constant can not be changed, also it will always require an assignment as in '= 13' since constant/final can not be changed by anyone
	
	public static int count = 0; // static, since it should be accessible within the class, but not outside of it
	
	public int id;
	
	public Thing() {  // which will run every time 'new Thing()' is called in the main method
		
		count++;
		id = count;
	}
	
	public void showName() {
		System.out.println("The Object ID is: " + id + ", " + name + description); // but I can access the static String description in here
	}
	
	public static void showInfo() {  //  static methods can only access static data as in:  public static String description;
		System.out.println("hello" + description);
		
		
		// won't work -- System.out.println(name); since it is not a static Instance
	}

}

public class Lec24_StaticAndFinal {
	public static void main(String[] args) {
		
		// to acces description in the class thing I will need to call the classname because it's static
		Thing.description = " - I am a thing";
		
		//System.out.println(Thing.description);
		
		System.out.println("Before creating objects, count is: " + Thing.count);
		
		Thing thing1 = new Thing();
		Thing thing2 = new Thing();
		
		thing1.name = "Bob";
		thing2.name = "Sue";
		
		Thing.showInfo();
		
		thing1.showName();
		thing2.showName();
		
//		System.out.println(thing1.name);
//		System.out.println(thing2.name);
		
		System.out.println(Math.PI);
		
		System.out.println(Thing.LUCKY_NUMBER);
		
		System.out.println("After creating objects, count is: " + Thing.count);
		
	}
}
