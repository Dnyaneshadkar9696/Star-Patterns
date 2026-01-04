
public class HallowHourglassPattern {
	
	public static void main(String[] args) {
		//      *  *  *  *
		//       *      *
		//         *   *
		//           *
		//         *   *
		//       *       *
		//     *   *   *   *      
	
		
		int n= 4; 
		
		for(int i =n; i>=1; i--) {
			for(int j=i; j <=n ; j++) {
				System.out.print(" ");
			}
			for(int k=1; k<=i; k++) {
				// as we want in first line to print the star pattern 4 times so we done 1 to 4 it repeats
				if(i==n || k==1 || k==i) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		
		int g = 3;
		for(int l = 1; l <=g; l++) {
			// it will print 3 row doesnt matter increasing of decreasing
			for(int m=g+1; m >=l; m--) {
				System.out.print(" ");
			}
			for(int x =1; x<=g; x++) {
				if(x==1 || x==l || l==g) {
					// the logic is same i==n and k==1 right border and k==i left border
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		
		
		
		
		
		
	}

}
