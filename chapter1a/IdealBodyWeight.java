/*Dylan Vander Berg
 * Chapter 1a
 * Ideal Body Weight
 */
package chapter1a;

public class IdealBodyWeight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int FEET = 6;
		final int INCHES = 3;
		int feetToCalculate = FEET - 5;
		double idealHeight = (12 * feetToCalculate + INCHES) * 5 + 110;
		System.out.println("The ideal height for someone who is " + FEET + " feet and " + INCHES + " inches is: " + idealHeight);
	}

}
