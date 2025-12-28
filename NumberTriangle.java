public class NumberTriangle {
	
	public static void main(String[] args) {
		
	//     1
    //    2 2
    //   3 3 3
    //  4 4 4 4
    // 5 5 5 5 5  Its a number triangle
	
	// first loop for the rows
	// loop for the spaces 
	// loop for the stars or the numbers
	int row = 5;
	for(int i=1; i <= row; i++) {
		
		// now the loop for space
		// CHANGE: use (row - i) so the number of leading spaces decreases each row.
		// Previously this used `row - 1` which printed the same spaces every row.
		for(int j=1; j <= row - i; j++) {
			System.out.print(" ");
		}
		//now the loop for number
		// CHANGE: print a space after each number so numbers are separated (e.g., "2 2").
		// Previously numbers were printed without spaces (e.g., "333").
		for(int k = 1; k <= i; k++) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
  }
}