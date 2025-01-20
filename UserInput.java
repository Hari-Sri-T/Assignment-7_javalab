//UserInput.java
//input for Calculator

import java.util.Scanner;
import java.util.Arrays;

class UserInput{ 
	int[] calcInput(){ //method for taking User input	
		Scanner scan = new Scanner(System.in); //declaring a scanner object
		int[] numbers = new int[2];		
		System.out.println("Enter first number: "); //taking 1st value
		numbers[0] = scan.nextInt();		
		System.out.println("Enter second number: "); //taking 2nd value
		numbers[1] = scan.nextInt();		
        return numbers;  //returns the values taken	
	}	
	
	int fiboInput(){ //method for taking fibonnaci no of terms input	
		Scanner scan = new Scanner(System.in); //Scanner object to read input from the user
		int terms;	
		System.out.println("Enter the number of terms: "); //taking input from user
		terms = scan.nextInt();	
        return terms; // returns the value from user		
	}	
		
	int[] arrInput(int size){ //method for Array Input
		Scanner scan = new Scanner(System.in); //declaring a scanner object	
		System.out.print("\nEnter the numbers: "); 
		int[] array = new int[size];
		for (int i = 0; i < size; i++){ //to take each element entered by the user
			array[i] = scan.nextInt();
		}	
        return array; //Returns the Array		
	}
}
