/* Java program for ITC115 - Assignment 2 - Fibonacci
 * "Use a for loop to compute and print out the first 12 Fibonacci numbers."
 * After the first two, the next number in the sequence is the sum of the previous two.
 */ 

public class fib {

	public static void main(String[] args) {
		// initial declaration and assignment of starting variables
		
		int loop = 12; // we want the first 12 Fibonacci numbers, so the loop is set for 12
		int a = 0;	   // first number in the sequence	
		int b = 1;	   // second number in the sequence
		
		// for loop, setting how many times we go through
		for (int i = 1; i <= loop; i++) {
			
				/* print on one line, starting with initial value of "a"
				 * 	(Initially had print statement after the variables, but had to move it
				 * 	to the beginning to get the first couple placements).
				 * 
				 * Declare/assign "c" to be the sum of the previous two numbers,
				 * then shift "a" to be the "b" value, "b" to be the previous numbers sum
				 *  of the "c" value.
				 */
			System.out.print(a + " "); 
			int c = a + b;
			a = b;
			b = c;
			
			
	} //end for loop
	}  //end main method
} //end fib class
