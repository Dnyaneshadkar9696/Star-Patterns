
public class PascalsTriangle {
	
	public static void main(String[] args) {
		int n = 5; 
//		int a = 0;
		int b = 1; 
		for(int i=1; i <=n; i++) {
			for(int j=n ; j >=i; j--) {
				System.out.print(" ");
			}
			for(int k =1; k <=i ; k++) {
				
				// i should be used in most of the each condition
				if(k==1 || k==i) {
					 
					System.out.print(b+" ");
					
				}
				else {
					System.out.print(i-1+" ");
				}
			}
			System.out.println();
		}
	}

}
