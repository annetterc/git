
public class App {

	public static void main(String[] args) {
		
		// instantiating an int and passing it to calculate()
		int value = 4;
		
		calculate(value);
		
		System.out.println(value); // this will always stay as the above one
		
		// I could pass in the value directly
		calculate(6);
		
		// In Mathematics:  5! = 5*4*3*2*1 (factorial of 4)
		System.out.println(factorial(5)); // returns 120

	}
	
	private static void calculate(int value) {
		System.out.println("Hello " + value);
		
		// if I would do the below it only applies to this method
		//value = value - 1;
		System.out.println(value);
		
		// I cannot call calculate(value) here - it would throw a stackOverFlowError, because it would call the method calculate recursively
		
		// but I could do it with the below
		if(value == 1) {
			return;
		}
		
		calculate(value - 1);
	
	}
	
	private static int factorial(int value) {
		if(value == 1) {
			return 1;
		}
		
		return factorial(value - 1) * value;
	}

}
