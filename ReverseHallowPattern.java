
public class ReverseHallowPattern {
	
	public static void main(String[] args) {
		
		// now we have to reverse the hallow triangle tell me logic  triangle
		int n = 5; 
		for(int i= n; i >=1; i--) {
			// above loop is for rows
			for(int j=i; j >i; j--) {
				System.out.print("  ");
			}
			for(int k = 1; k <= i; k++) {
				if( k == 1 || k==i || i==n) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
			
			
			
					
		}
		
		
		
		
	}

}
