
public class ButterflyPattern {
	
	public static void main(String[] args) {
		
//		butterfly pattern
		
//	--1	*       * --3
//		**     **
//		***   ***
//		**** ****
//		*********
//	--2	**** **** -- 4 triangle
//		***   ***
//		**     **
//		*       *
		
		// first for loop for first triangle , as here we have to print 4 for loops for each triangle
		
		// the butter fly logic is based of star-space-star
		int n = 5;
		for(int i=1; i <=n; i++) {
			// now loop for the spaces
			for( int u=1; u<=i; u++) {
				System.out.print("*"); // upper triangle 
			}
			for( int j = 1; j <= 2 * (n - i); j++) {  // this 2 * (n -1) will remove space for the both two stars present 
				System.out.print(" ");  // upper space
			}
			for(int k=1; k <= i;k++ ) {  // triangle  
				System.out.print("*");
				
			}
			System.out.println();
		}
		
		// we will print first here is **** **** its a goal 
		for(int x= n-1; x>=1; x--) {
			// only one row will print
			for(int y = 1; y<=x; y++) {
				System.out.print("*");
				// this loop triangle is good and set not next loop is for space
				}
			for(int z=1; z <= 2*(n-x);z++ ) {
				System.out.print(" ");
			}
			for(int w = 1; w<=x;w++) {
				System.out.print("*");
			}
			System.out.println();
			// loop for next triangle 
//			for(int p = 1; p <=4; )
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		}
		
	}

}
