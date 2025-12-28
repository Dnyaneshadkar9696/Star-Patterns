
public class NumIncreasReversePryamid {
	
	public static void main(String[] args) {
		
		// 1 2 3 4 5
	   //  1 2 3 4
	   //  1 2 3
	  //   1 2
	  //   1
		//    Its a reverse increasing pyramid
		
		// // now we want the 5 rows so add loop for rows
		int rows = 6;
		 for(int i = 1; i <= rows; i++) {
			 for(int j = 1; j <= rows-i; j++) {
				 System.out.print(j);
			 }
			 System.out.println();
			 
		 }
		
		
		
	}

}
