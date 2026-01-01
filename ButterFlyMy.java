// Online Java Compiler
// Use this editor to write, compile and run your Java code online

public class ButterFlyMy {
    public static void main(String[] args){
        
        // to print the star pattern
        // declare the rows to print in the upper half
        int n = 5;
        for(int i=1; i<= n ;i++){
            //above loop is for rows
            for(int j=1; j<= i; j++){
                System.out.print("*");
                //loop for printing the stars
            }
            // now loop for space
            for(int k=1 ; k<= 2*(n-i);k++){
                // the condition here when it becomes 2* 5-5 = 0 and k=5 the space will be zero and the loop ends
                System.out.print(" ");
                
                // initialy it will check i value like 12345678 and till 8 and print only one space if condition is true and eventutally when k=9 it will break
            }
            //now the third loop for star
            for(int l= 1; l<=i;l++){
                
                System.out.print("*");
                
                }
                System.out.println();
              
        }
        
        // now the Second half starts here 
        for(int m = n-1;m >= 1;m--){
            // not using the hard values.
            // above loop is for rows 
            for(int w = 1; w <= m; w++){
                System.out.print("*");
            }
            for(int e = 1; e <= 2*(n -m); e++){
                System.out.print(" ");
            }
            for(int b = 1; b <= m;b++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}