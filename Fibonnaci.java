//Fibonnaci.java

class Fibonnaci{
	
	void fibonnaci(){
		
		FiboInput fibo = new FiboInput(); 
		
		int terms;
		terms = fibo.fiboInput();
		
        int first = 0;
		int second = 1;
		
		        
        for (int i = 1; i <= terms; i++) {
            System.out.print(first + " ");
            
            // Update the values for the next Fibonacci term
            int nextTerm = first + second;
            first = second;
            second = nextTerm;
		}
	}
	
}
