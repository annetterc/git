
public class Lec17_MultiDimensionalArray {
	public static void main(String[] args) {
		
		// create an int array and assign [3] values to it
		int[] values = {1,2,2343};
		
		// the above is a single dimension array meaning I get it like values[2]
		System.out.println(values[2]);
		
		// multi dimensional array requires more than one array - the below is a 2-dimensional array(meaning there is an array that holds pointers to other arrays) but could also be more than 2
		int[][] grid = {
			{1,2,2343},
			{2,4},    // Note not all arrays have to be of the same length, since it is a multidimensional
			{41,5,678, 9}
		};
		
		//grid[1][1] - gets the object 1 out of the array at position 1
			System.out.println(grid[1][1]);
		//grid[0][2] - gets the value at "row" 0 and "column" 2 - 2343
			System.out.println(grid[0][2]);
			
		// create a 2-dimensional String array with 2 "rows" and 3 "columns"
		String[][] texts = new String[2][3];
		
		texts[0][1] = "Hello there";
		
		System.out.println(texts[0][1]);
		
		for(int row = 0; row < grid.length; row++) {
			for(int column = 0; column < grid[row].length; column++) {
				// \t inside quotes added, adds a tab
				System.out.print(grid[row][column] + "\t");
			}
			// to put each row into its own line
			System.out.println();
		}
		
		// I could also only assign the outter array size
		String[][] words = new String[2][];
		// I can then assign the size of each row
		words[0] = new String[3];
		words[0][1] = "Hi there";
		
		System.out.println(words[0][1]);
		
	}
	
}
