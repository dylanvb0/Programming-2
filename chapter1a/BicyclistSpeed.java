/*Dylan Vander Berg
 * Chapter 1a
 * Bicyclist Speed
 */
package chapter1a;

public class BicyclistSpeed {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final double PI = 3.14;
		final int CANDENCE = 90;
		final int GEARSIZE = 100;
		double speed = GEARSIZE * PI / 12 / 5280 * CANDENCE * 60;
		System.out.println("Your speed is: " + speed);
	}

}
