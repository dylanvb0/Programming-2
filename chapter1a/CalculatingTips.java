/*Dylan Vander Berg
 * Chapter 1a
 * Calculating Tips
 */
package chapter1a;

public class CalculatingTips {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final double SUBTOTAL = 10;
		final double GRATUITY = .15;
		System.out.println("Your subtotal is: " + SUBTOTAL);
		System.out.println("Your gratuity is: " + SUBTOTAL * GRATUITY);
		System.out.println("Your total is: " + SUBTOTAL * (1 + GRATUITY));
	}

}
