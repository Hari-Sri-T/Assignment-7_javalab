//Fibonnaci.java

class Fibonnaci{
	
	void fibonnaci(){ //new method for fibonnaci code
		
		FiboInput fibo = new FiboInput();  //object to call methods from FiboInput class
		
		int terms; //to store no of terms
		
		terms = fibo.fiboInput(); //calling fiboInput() method on fibo object
		
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
	
}
