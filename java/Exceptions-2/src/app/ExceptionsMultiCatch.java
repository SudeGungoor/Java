package app;

//ExceptionsMultiCatch.java
//Multi-catch usage example
//Handling ArithmeticExceptions and InputMismatchExceptions.

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionsMultiCatch {

	// demonstrates throwing an exception when a divide-by-zero occurs
	public static int quotient(int numerator, int denominator) throws ArithmeticException {
		return numerator / denominator; // possible division by zero
	} 

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in); 
		boolean continueLoop = true; // determines if more input is needed

		do {                                                                

			try { // read two numbers and calculate quotient                 
				System.out.print("Please enter an integer numerator: ");    
				int numerator = scanner.nextInt();                            

				System.out.print("Please enter an integer denominator: ");  
				int denominator = scanner.nextInt();                          

				int result = quotient(numerator, denominator);              
				System.out.printf("%nResult: %d / %d = %d%n", numerator, denominator, result);    

				continueLoop = false; // input successful; end looping        
			}    
			// multi-catch example
			catch (InputMismatchException | ArithmeticException e) {        
				 
				System.out.printf("%nException: %s%n", e);
				scanner.nextLine(); // discard input so user can try again    
				System.out.printf("You must enter nonzero integers. Please try again.%n%n");          
			}                                                              
     

		} while (continueLoop);                                           

		System.out.println("\nThe end. Bye!");
	} 

}
