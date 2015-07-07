
public class Lec15_Arrays {
	public static void main(String[] args) {
		// create an int that holds a 32 bit int sized object
		int value = 7;
		
		// create an array/list of ints to hold ints
		int[] values;
		// initialize size/length of array
		values = new int[3];
		
		System.out.println(values[0]);
		
		// setting values
		values[0] = 10;
		values[1] = 20;
		values[2] = 30;
		
		// getting values
		System.out.println(values[0]);
		System.out.println(values[1]);
		System.out.println(values[2]);
		
		for(int i = 0; i < values.length; i++) {
			System.out.println(values[i]);
		}
		
		// assign values
		int[] numbers = {5,6,7};
		
		for(int a = 0; a < numbers.length; a++) {
			System.out.println(numbers[a]);
		}
	}
}
