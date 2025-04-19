//Main.java
// Name: Tanniru Hari Sri Shanmukha Sai
// PRN: 23070126135
// Batch: B3


import java.util.*;

class Main {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in); // Scanner object to read option from the user
        Calculator cal = new Calculator(); // Object to call methods from Calculator class

        while (true) { // Infinite loop until exit is selected
            try {
                System.out.println("\nSelect what to do \n1)Calculator \n2)Fibonnaci \n3)Array (sum and average) \n4)exit");
                int option = scan.nextInt(); // Taking user input for option

                switch (option) {
                    case 1: // Calculator
                        Scanner scann = new Scanner(System.in); // Scanner object for method selection
                        System.out.println("\nSelect what to do \na)Addition \nb)Substraction \nc)Multiplication \nd)Division \ne)Go Back\n");
                        String method = scann.nextLine(); // Method input from user
                        switch (method) {
                            case "a": // Addition
                                System.out.println("\nSum is: " + cal.addition());
                                break;

                            case "b": // Substraction
                                System.out.println("\nDifference is: " + cal.substraction());
                                break;

                            case "c": // Multiplication
                                System.out.println("\nMultiplication is: " + cal.multiplication());
                                break;

                            case "d": // Division
                                System.out.println("\nDivision is: " + cal.division());
                                break;

                            case "e": // Does nothing
                                break;

                            default:
                                System.out.println("\nInvalid Input");
                                break;
                        }
                        break;

                    case 2: // Fibonacci
                        cal.fibonnaci(); // Calling the method for Fibonacci sequence
                        break;

                    case 3: // Array sum and average

						try {
							System.out.println("Enter the number of elements of the array: ");
                            int n = scan.nextInt(); // Taking size of array
                            cal.sumAverageArr(n); // Calling the method to sum and average the array
						} catch (NegativeArraySizeException e) {
							System.out.println("Error: " + e.getMessage()); // handle negative array size
						}
						break;
                        

                    case 4: // Exit the program
                        System.out.println("Exiting the code!");
                        return;

                    default:
                        System.out.println("\nPlease Enter a Valid Option");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid option input! Please enter a number (1 to 4).");
                scan.nextLine(); // Clear the scanner buffer
            }
        }
    }
}
