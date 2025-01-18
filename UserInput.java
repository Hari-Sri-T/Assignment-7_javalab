//UserInput.java
//input for Calculator

import java.util.*;

class UserInput{ 
	int[] userInput(){ //method for taking User input	
	
		Scanner scan = new Scanner(System.in); //declaring a scanner object
		int[] numbers = new int[2];
		
		System.out.println("Enter first number: "); //taking 1st value
		numbers[0] = scan.nextInt();
		
		System.out.println("Enter second number: "); //taking 2nd value
		numbers[1] = scan.nextInt();	
		
        return numbers; // returns the values taken
		
	}	
}
