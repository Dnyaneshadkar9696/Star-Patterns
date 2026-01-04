
public class HallowDiamond {
	
	public static void main(String[] ars) {
		
		// we want to print the hallow diamond
		int n = 4;
		for(int i = 1; i <= n; i++) {
			// number of the rows for the first diamond
			for(int j = n; j >=i;j-- ) {
				System.out.print(" ");
			}
			for(int k=1; k <=i; k++) {
				
				if(k==1 || k==i) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
				
			}
			System.out.println();
		}
		
		// now second for loop for the downside triangle
		for(int l = n-1; l >=1; l--) {
			
			for(int m=n; m >= l; m--) {
				System.out.print(" ");
			}
			for(int t = 1; t<=l; t++) {
				if(t==1 || t==l) {
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
