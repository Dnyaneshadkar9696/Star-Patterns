
public class NormalTriangle {
	
	public static void main(String[] args) {
//		*
//		* *
//		* * *
//		* * * *
//		* * * * *
		
		
		for(int i = 1; i<= 5; i++) {
			// the 5 rows will be printed
			for(int j= 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		
		//Question 2 
//		* * * * *
//		* * * *
//		* * *
//		* *
//		*
		System.out.println();
		System.out.println("The 2nd question solution");
		for(int i= 1; i <= 5; i++) {
			// the row till 5 will print 
			for(int j= 5; j>=i; j--) {
				// as the value of j decreases means the value of column decreases
				System.out.print("* ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		//Question 3
//		* * * * *
//		* * * * *
//		* * * * *
//		* * * * *
//		* * * * *
		System.out.println("The 3rd question solution");
		for(int i = 1; i<= 5; i++){
			for (int j= 1 ; j <= 5; j++) {
				// meaning 1 bar execute ho and assigning the value to j is 5.
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println();
		
		// Question 4.
//	     *
//	    * *
//	   * * *
//	  * * * *
//	 * * * * *
		System.out.println("The 4th question solution");
		
		for(int i= 1; i <= 5; i++) {
			// for loop for rows 
			// now for loop for space
			// i will be used in space and * for loop
			for(int j= 5; j > i; j--) {
				// 
				System.out.print(" ");
			}
			// now for loop for star
			for(int k =1; k <=i; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		//Question 5
//		    *
//		   * *
//		  * * *
//		   * *
//		    *
		
		System.out.println("Question no 5 solution");
	
			// first half
		
		
		for(int i=1; i <= 3; i++) {
	
			for(int j=3; j > i;j--) {
				System.out.print(" ");
			}
			for(int k= 1; k <= i; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		
		// second half
		for(int i = 2; i >= 1; i--) { // row is decreasing Staring from 2 avoids duplicate row

		    for(int j = 3; j > i; j--) { // Column is decreasing 3 > 2 true print space
		        System.out.print(" ");   // 2 > 2 false no space
		    }                            // the loop will run until the condition is false.

		    for(int k = 1; k <= i; k++) {
		        System.out.print("* ");
		    }

		    System.out.println();
		}

		
	
			
			
	

		 
		}
	
		
		
		
		
		
}


