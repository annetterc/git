
public class App {

	public static void main(String[] args) {
		
		byte byteValue = 20;
		short shortValue = 55;
		int intValue = 888;
		long longValue = 23355;
		
		float floatValue = 8834.3f;
		float floatValue2 = (float)99.3;// another way of assigning a float value
		double doubleValue = 82.34;
		
		System.out.println(Byte.MAX_VALUE);
		System.out.println(Short.MAX_VALUE);
		System.out.println(Integer.MAX_VALUE);
		//System.out.println(Integer.MIN_VALUE);
		System.out.println(Long.MAX_VALUE);
		
		System.out.println(Float.MAX_VALUE);
		System.out.println(Double.MAX_VALUE);
		
		// casting to a different type below
		intValue = (int) longValue;
		System.out.println(intValue);
		
		doubleValue = intValue;
		System.out.println(doubleValue);
		
		intValue = (int) floatValue;
		System.out.println(intValue);
		
		byteValue = (byte)128; // you can actually assign a value directly here, at which point you wouldn't have to declare it before, if you don't declare it earlier you'd write it like this:  byte byteValue = (byte)128;
		System.out.println(byteValue);  // since the max value for a byte is 127, it will just wrap around to the lowest minValue and output -128
	}

}
