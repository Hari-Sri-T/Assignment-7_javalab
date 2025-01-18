// Calculator.java

class Calculator{
	
	
	int addition(){ //method for addition
		int[] numbers;
		UserInput input = new UserInput();  //calls UserInput method
		numbers = input.userInput();
		int sum = numbers[0] + numbers[1];
		
		return sum; //Returns the Sum of 2 numbers
	}
	
	int substraction(){ //method for substraction
		int[] numbers;
		UserInput input = new UserInput();  //calls UserInput method
		numbers = input.userInput();
		int sub = numbers[0] - numbers[1];
		
		return sub; //Returns the substraction of 2 numbers
	}
	
	int multiplication(){ //method for multiplication
		int[] numbers;
		UserInput input = new UserInput();  //calls UserInput method
		numbers = input.userInput();
		int mul = numbers[0] * numbers[1];
		
		return mul; //Returns the multiplication of 2 numbers
	}
	
	double division(){ //method for division
		int[] numbers;
		UserInput input = new UserInput(); //calls UserInput method
		numbers = input.userInput();
		
		if(numbers[1] == 0 ){
			System.out.println("Division by 0 not allowed!!");
			
		}
		else{
			double div = (double)numbers[0] / numbers[1];
			return div;
		}
		
		return 0; //Returns the division of 2 numbers
	}
	
	
}