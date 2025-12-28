
public class RhombusPattern {
	
	public static void main(String[] args) {
		
		// printing the star pattern using rhombus
		int row = 5;
		for(int i = 1;i <= row; i++) {
			// the rows are printed
			
			for(int k=1;k <= row+i;k++) {
				// The space is added as shown in the console.
				System.out.print(" ");
			}
			
			
			
			for(int j =1 ;j <= 5;j++) {
				// basically it is printing the coloum
				// here the values are changing when the value of j is updating
				
				System.out.print("*");
				
			}
			System.out.println();
		}
	}

}
