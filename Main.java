//Main.java
// Name: Tanniru Hari Sri Shanmukha Sai
// PRN: 23070126135
// Batch: B3

import java.util.Scanner;

class Main{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in); //Scanner object to read option from the user
		Calculator cal = new Calculator(); //object to call methods from Calculator class
				
		while (true){//infinite loop unit exit is selected			
			System.out.println("\nSelect what to do \n1)Calculator \n2)Fibonnaci \n3)Array (sum and average) \n4)exit");
			int option = scan.nextInt(); //taking user input , 1,2 or 3 is expected
			
			switch (option){	
				case 1: //Calculator				
					Scanner scann = new Scanner(System.in);//Scanner object to read method from the user				
					System.out.println("\nSelect what to do \na)Addition \nb)Substraction \nc)Multiplication \nd)Division \ne)Go Back\n");
					String method = scann.nextLine(); //method taken from user's input				
					switch (method){
						case "a": //Addition
							System.out.println("\nSum is: "+cal.addition());
							break;
				
						case "b": //Substraction
							System.out.println("\nDifference is: "+cal.substraction());
							break;
				
						case "c": //Multiplication
							System.out.println("\nMultiplication is: "+cal.multiplication());
							break;
				
						case "d": //Division
							System.out.println("\nDivision is: "+cal.division());
							break;
							
						case "e": //Does nothing
							break;
				
						default: 
							System.out.println("\nInvalid Input"); 
							break;
					}
					break;
			
				case 2: //fibonnaci
					
					cal.fibonnaci(); //calling the method fibonnaci() 
					break;
				
				case 3: // Array sum and average
					System.out.println("Enter the numer of elements of array: "); //taking size of array
					
					int n;
					n = scan.nextInt();
		
					cal.sumAverageArr(n);
					break;
					
				case 4:

					System.out.println("Exiting the code!"); //to end the code
					return;
			
				default:
					System.out.println("\nPlease Enter a Valid Option");
					break;
				}
		}
	}
}
	