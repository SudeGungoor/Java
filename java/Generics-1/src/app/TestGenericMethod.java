// Overloaded methods

// Generics: Generic method example

package app;

public class TestGenericMethod {

	public static void main(String[] args) {
		
	      // create arrays of Integer, Double and Character
	      Integer[] integerArray = { 1, 2, 3, 4, 5, 6 };
	      Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7 };
	      Character[] characterArray = { 'H', 'E', 'L', 'L', 'O' };
	      
	      System.out.println( "Array integerArray contains:" );
	      printArray( integerArray ); // pass an Integer array
	      
	      System.out.println( "\nArray doubleArray contains:" );
	      printArray( doubleArray ); // pass a Double array
	      
	      System.out.println( "\nArray characterArray contains:" );
	      printArray( characterArray ); // pass a Character array
	      
	      

	} // end of main
	
	// Generic method
	// (If the operations performed by several overloaded methods are identical 
	// for each argument type, the overloaded methods can be more compactly 
	// and conveniently coded using a generic method. 
	
	// You can write a single generic method declaration that can be 
	// called with arguments of different types. 
	// Based on the types of the arguments passed to the generic method, 
	// the compiler handles each method call appropriately.) 
	
	// type parameter part in angle brackets < > before the method's return type
	// type parameter: identifier for a generic type name
	// can have one or more type parameters
	// Generic method implementation: printArray
	
	// Example generic method
	public static < T > void printArray( T[] inputArray ) {
		 // display array elements
	      for ( T element : inputArray )
	         System.out.printf( "%s ", element );
	      // The use of %s will result in the toString() method 
	      // being called on the object, and thus will work for any type T.
	      
	      System.out.println();
	} // end method printArray
	
	
	
	
	// Overloaded methods: printArray
	//////////////////////////////////
    // method printArray to print Integer array
 /*   public static void printArray( Integer[] inputArray )
	 
	   {
	      // display array elements
	      for ( Integer element : inputArray )
	         System.out.printf( "%s ", element );

	      System.out.println();
	   } // end method printArray
    
    
	   // method printArray to print Double array
	   public static void printArray( Double[] inputArray )
	   {
	      // display array elements
	      for ( Double element : inputArray )
	         System.out.printf( "%s ", element );

	      System.out.println();
	   } // end method printArray
	   
	   // method printArray to print Character array
	   public static void printArray( Character[] inputArray )
	   {
	      // display array elements
	      for ( Character element : inputArray )
	         System.out.printf( "%s ", element );

	      System.out.println();
	   } // end method printArray
	   
*/	   
    
    

}
