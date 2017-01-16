/*
 * Dylan Vander Berg
 * Lab Exercise 2
 * 2: Mad Lib
 */
package lab2;

import java.util.Scanner;

public class MadLib {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter an adjective >> ");
		String adj = scanner.nextLine();
		System.out.print("Please enter a noun >> ");
		String noun = scanner.nextLine();
		System.out.print("Please enter an adverb >> ");
		String adv = scanner.nextLine();
		System.out.print("Please enter a past tense verb >> ");
		String verb = scanner.nextLine();
		System.out.printf("The %s father ran across the yard to see that his child was hurt. The child was crying %s. The dad just %s. The dad told his child that he would get him a %s.", adj, adv, verb, noun);
	}

}
