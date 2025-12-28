
public class NumberChangePryamid {
	
     public static void main(String[] args) {
    	 
    	 // here we have to print the number changing pryamid
    	 //    1
    	 //    2 3
    	 //    4 5 6
    	 //    7 8 9 10   and so on
    	 
    	 // first required the for loop for the numbers to print the rows
    	  int num = 1;
    	  // its not compulsory to take the i and j in syso in loops 
    	  // you can use the variable and perform operation on the variable
    	  
    	 for(int i =1; i <= 10; i++) {
    		 
    		 // now just like star we have to print the numbers
    		 
    		 for( int j = 1; j <= i; j++) {
    			 
    			 // here this condition j <= i means suppose i=2; so the number will print till 2 in this loop
    			 // This means row number = count of numbers printed
    			 
    			 // This loop repeatedly starts from 1 each time and checks the condition and executes the body.
    			
    			 System.out.print(num+ " ");
    			 num++;
    			 // earlier the sequence started from one and now it is starting continuous.
    		
    		 }
    		 System.out.println();
    	 }
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
     }
}
