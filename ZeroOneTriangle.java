
public class ZeroOneTriangle {
	
	public static void main(String[] args) {
		
		//     1
		//     0 1
		//     1 0 1
		//     0 1 0 1
		//     1 0 1 0 1
		//
		
		//lets print the  5 rows here 
		int w = 1;
		
		for(int i=1; i <= 5; i++) {
			// now we set the rows to 5
			for(int j=1; j <= i; j++) {
				// it seems like even odd
				
				if(w%2 == 0) {
					System.out.print(0+ " ");
				}else {
					System.out.print(1 + " ");
				}
				w = 1 - w;  // this like make it toggle between 0 and 1.
				// above line is changing the value of w from 0 to 1 again and again.
				
				
				// when w =1 then w = 0.
				// when w =0 then w = 1.
				
				
			}
			System.out.println();
		}
		
		
	}

}
