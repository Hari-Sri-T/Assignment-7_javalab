//Main.java
// Name: Tanniru Hari Sri Shanmukha Sai
// PRN: 23070126135
// Batch: B3
import java.util.Scanner;

class Main{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("Select what to do \n1)Calculator \n2)Fibonnaci");
		int option = scan.nextInt();
		
		switch(option){
		
			case 1:
			
				Calculator cal = new Calculator(); 
				Scanner scann = new Scanner(System.in);
				System.out.println("Select what to do \na)Addition \nb)Substraction \nc)Multiplication \nd)Division");
				String method = scann.nextLine();
				System.out.println("You Selected: "+method);
				
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
				break;
			
			case 2:
				Fibonnaci fib = new Fibonnaci();
				fib.fibonnaci();
				break;
				
			default:
				System.out.println("Please Enter a Valid Option");
        }
    }
}
	