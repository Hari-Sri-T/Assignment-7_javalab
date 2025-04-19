import java.util.*;

class Calculator {

    // Method for addition operation
    int addition() {
        try {
            int[] numbers = new UserInput().calcInput(); // Call the method for input
            return numbers[0] + numbers[1]; // Return the sum of the numbers
        } catch (InputMismatchException e) {
            // Handle invalid input for addition
            System.out.println("Addition failed: Invalid number format.");
            return 0; // Return 0 in case of invalid input
        }
    }

    // Method for subtraction operation
    int substraction() {
        try {
            int[] numbers = new UserInput().calcInput(); // Call the method for input
            return numbers[0] - numbers[1]; // Return the difference of the numbers
        } catch (InputMismatchException e) {
            // Handle invalid input for subtraction
            System.out.println("Subtraction failed: Invalid number format.");
            return 0; // Return 0 in case of invalid input
        }
    }

    // Method for multiplication operation
    int multiplication() {
        try {
            int[] numbers = new UserInput().calcInput(); // Call the method for input
            return numbers[0] * numbers[1]; // Return the product of the numbers
        } catch (InputMismatchException e) {
            // Handle invalid input for multiplication
            System.out.println("Multiplication failed: Invalid number format.");
            return 0; // Return 0 in case of invalid input
        }
    }

    double division() {
        try {
            int[] numbers = new UserInput().calcInput(); // Call the method for input
            if (numbers[1] == 0) {
                // Handle division by zero
                System.out.println("Division by 0 not allowed!");
                return 0; // Return 0 if division by 0
            }
            return (double) numbers[0] / numbers[1]; // Return the result of division
        } catch (InputMismatchException e) {
            // Handle invalid input for division
            System.out.println("Division failed: Invalid number format.");
            return 0; // Return 0 in case of invalid input
        } catch (ArithmeticException e) {
            // Handle division by zero exception
            System.out.println("Arithmetic Error: Division by zero is not allowed.");
            return 0; // Return 0 in case of division by zero
        }
    }

    // Method to calculate Fibonacci series
    void fibonnaci() {
        try {
            int terms = new UserInput().fiboInput(); // Get the number of terms for Fibonacci
            int first = 0, second = 1;

            for (int i = 1; i <= terms; i++) {
                System.out.print(first + " "); // Print the current Fibonacci number
                int nextTerm = first + second;
                first = second;
                second = nextTerm;
            }
            System.out.println(); // Print a new line after printing Fibonacci series
        } catch (InputMismatchException e) {
            // Handle invalid input for Fibonacci terms
            System.out.println("Fibonacci failed: Invalid number format.");
        }
    }

    // Method to calculate the sum and average of an array
    void sumAverageArr(int size) {
        try {
            int[] array = new UserInput().arrInput(size); // Get the array input from the user
            int total = 0;
            for (int i = 0; i < size; i++) {
                total += array[i]; // Sum up all elements of the array
            }
            double average = (double) total / size; // Calculate the average
            System.out.println("The Sum of Elements of Array's is: " + total);
            System.out.println("The Average of Elements in Array is: " + average);
        } catch (InputMismatchException e) {
            // Handle invalid input for array elements
            System.out.println("Array input failed: Invalid number format.");
        }
    }
}
