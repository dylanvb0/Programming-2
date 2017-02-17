/*
 * Dylan Vander Berg
 * Lab Exercise 9
 * 2-3: DivideByZeroException
 */
package lab9;


public class DivByZeroException extends Exception {
	
	/**
	 * Default constructor with message for dividing by zero
	 */
	public DivByZeroException(){
		super("You can not divide by zero");
	}
}
