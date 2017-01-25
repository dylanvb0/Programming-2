/*
 * Dylan Vander Berg
 * Lab Exercise 4
 * 2: Die class for Pig game
 */
package lab4;

public class Die {
	int value;

	/**
	 * Precondition: None
	 * Postcondition: Die object with random value
	 */
	public Die() {
		this.value = (int)(Math.random() * 6) + 1;
	}

	/**
	 * Precondition: Properly initialized Die object
	 * @return the value
	 */
	public int getValue() {
		return value;
	}
	
}
