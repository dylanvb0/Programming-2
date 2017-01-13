/*Dylan Vander Berg
 * Chapter 1a
 * Metabolic Equivalents
 */
package chapter1a;

public class MetabolicEquivalents {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int RUNNING = 10;
		final int BASKETBALL = 8;
		final int SLEEPING = 1;
		final int RUNNINGMINS = 30;
		final int BASKETBALLMINS = 30;
		final int SLEEPINGMINS = 6 * 60;
		final double KILOGRAM = 2.2;
		final double WEIGHTLB = 150;
		double weightKG = WEIGHTLB/KILOGRAM;
		double runningCals = .0175 * RUNNING * weightKG * RUNNINGMINS;
		double basketballCals = .0175 * BASKETBALL * weightKG * BASKETBALLMINS;
		double sleepingCals = .0175 * SLEEPING * weightKG * SLEEPINGMINS;
		double totalCals = runningCals + basketballCals + sleepingCals;
		System.out.println("You burn " + totalCals);
	}

}
