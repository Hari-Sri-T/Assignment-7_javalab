//Main.java
// Name: Tanniru Hari Sri Shanmukha Sai
// PRN: 23070126135
// Batch: B3
import java.util.Scanner;

class Main{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Select what to do \na)Addition \nb)Substraction \nc)Multiplication \nd)Division");
		String method = scan.nextLine();
		System.out.println("You Selected: "+method);
		
		Calculator cal = new Calculator();
		
		switch(method){
			
			case "a":
				System.out.println("Sum is: "+cal.addition());
				break;
				
			case "b":
				System.out.println("Difference is: "+cal.substraction());
				break;
				
			case "c":
				System.out.println("Multiplication is: "+cal.multiplication());
				break;
				
			case "d":
				System.out.println("Division is: "+cal.division());
				break;
				
			default:
				System.out.println("Invalid Input");
				break;
	    }
    }
}
	