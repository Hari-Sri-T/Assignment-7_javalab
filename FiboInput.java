//FiboInput.java

import java.util.*;

class FiboInput{ 
	int fiboInput(){ //method for taking fibonnaci no of terms input	
	
		Scanner scan = new Scanner(System.in); //Scanner object to read input from the user
		int terms;
		
		System.out.println("Enter the number of terms: "); //taking input from user
		terms = scan.nextInt();
		
        return terms; // returns the values taken
		
	}	
}