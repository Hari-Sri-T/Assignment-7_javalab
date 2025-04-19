// UserInput.java
// Handles input for Calculator

import java.util.*;


class UserInput {

	int[] calcInput() { //method for taking User input	
		Scanner scan = new Scanner(System.in);  //declaring a scanner object
		int[] numbers = new int[2];

		try {
			System.out.println("Enter first number: "); //taking 1st value
			numbers[0] = scan.nextInt();

			System.out.println("Enter second number: ");//taking 2nd value
		
			numbers[1] = scan.nextInt(); 

		} catch (InputMismatchException e) { //Exception Handling using try-catch
			throw new InputMismatchException("Invalid input for calculator numbers.");
		}
		return numbers; //returns the values taken	
	}


	int fiboInput() { //method for taking Fibonacci number of terms input
		Scanner scan = new Scanner(System.in); //Scanner object to read input from the user
		int terms;
	
		try {
			System.out.println("Enter the number of terms: "); //taking input from user
			terms = scan.nextInt();
			if (terms <= 0) {
				throw new IllegalArgumentException("Number of terms must be greater than 0.");
			}
		} catch (InputMismatchException e) {
			throw new InputMismatchException("Invalid input! Please enter an integer.");
		}
	
		return terms; // returns the value from user		
	}
	

	int[] arrInput(int size) { //method for Array Input
		Scanner scan = new Scanner(System.in); //declaring a scanner object	

		// Inside arrInput method
        if (size < 0) {
            throw new NegativeArraySizeException("Array size cannot be negative.");
        }

		int[] array = new int[size];

		try {
			System.out.print("\nEnter the numbers: ");
			for (int i = 0; i < size; i++) { //to take each element entered by the user
				array[i] = scan.nextInt();
			}
		} catch (InputMismatchException e) { //Exception Handling using try-catch
			throw new InputMismatchException("Invalid input for array elements.");
		}
		return array; //Returns the Array		
	}
}

