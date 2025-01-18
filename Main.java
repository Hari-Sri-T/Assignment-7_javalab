//Main.java
// Name: Tanniru Hari Sri Shanmukha Sai
// PRN: 23070126135
// Batch: B3

import java.util.Scanner;

class Main{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in); //Scanner object to read option from the user
		
		
		System.out.println("\nSelect what to do \n1)Calculator \n2)Fibonnaci");
		int option = scan.nextInt(); //taking user input , either 1 or 2 is expected
		
		//based on option chosen either Calculator or Fibonnaci is run using switch
		switch(option){ 
		
			case 1: //Calculator
			
				Calculator cal = new Calculator(); //object to call methods from Calculator class
				
				Scanner scann = new Scanner(System.in);//Scanner object to read method from the user
				
				
				System.out.println("\nSelect what to do \na)Addition \nb)Substraction \nc)Multiplication \nd)Division");
				String method = scann.nextLine(); //method taken from user's input
				System.out.println("\nYou Selected: "+method);
				
				switch(method){
			
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
				
					default: 
						System.out.println("\nInvalid Input"); 
						break;
				}
				break;
			
			case 2: //fibonnaci
				Fibonnaci fib = new Fibonnaci();  //object to call methods from Fibonnaci class
				fib.fibonnaci(); //calling the method fibonnaci() 
				break;
				
			default:
				System.out.println("\nPlease Enter a Valid Option");
        }
    }
}
	