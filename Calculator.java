// Calculator.java

class Calculator{	
	int addition(){ //method for addition
		int[] numbers;
		UserInput input = new UserInput(); //calls UserInput method
		numbers = input.calcInput();
		int sum = numbers[0] + numbers[1];
		
		return sum; //Returns the Sum of 2 numbers
	}
	
	int substraction(){ //method for substraction
		int[] numbers;
	    UserInput input = new UserInput(); //calls UserInput method
		numbers = input.calcInput();
		int sub = numbers[0] - numbers[1];
		
		return sub; //Returns the substraction of 2 numbers
	}
	
	int multiplication(){ //method for multiplication
		int[] numbers;
		UserInput input = new UserInput(); //calls UserInput method
		numbers = input.calcInput();
		int mul = numbers[0] * numbers[1];
		
		return mul; //Returns the multiplication of 2 numbers
	}
	
	double division(){ //method for division
		int[] numbers;
		UserInput input = new UserInput(); //calls UserInput method
		numbers = input.calcInput();		
		if (numbers[1] == 0 ){
			System.out.println("Division by 0 not allowed!!");		
		}
		else {
			double div = (double)numbers[0] / numbers[1];
			return div; //Returns the division of 2 numbers
		}
		
		return 0; 
	}
	
	void fibonnaci(){ //new method for fibonnaci code			
		UserInput input = new UserInput(); //calls UserInput method
		int terms; //to store no of terms
		
		terms = input.fiboInput(); //calling fiboInput() method from UserInput class
		
		// terms to store 1st and 2nd terms
        int first = 0; 
		int second = 1;
			        
        for (int i = 1; i <= terms; i++) { //for loop runs no.of.terms times
            System.out.print(first + " ");
            
            // Update the values for the next Fibonacci term
            int nextTerm = first + second;
            first = second;
            second = nextTerm;
		}
	}
	
	void sumAverageArr(int size){	
		UserInput input = new UserInput(); //calls UserInput method

		int[] arrays;
		arrays = input.arrInput(size);
		int total = 0 ;
		
		for (int i = 0; i < size; i++){ //checks total by adding all num in array
			total += arrays[i];
		}
		double average;
		average = (double) total/size; //typecasted into double to get decimal values

		System.out.println("The Sum of Elements of Array's is: " + total);	
		System.out.println("The Average of Elements in Array is: " + average );
	}	
}