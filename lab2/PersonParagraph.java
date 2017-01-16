/*
 * Dylan Vander Berg
 * Lab Exercise 2
 * 3: Person Paragraph
 */
package lab2;

import java.util.Scanner;

public class PersonParagraph {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter your name >> ");
		String name = scanner.nextLine();
		System.out.print("Please enter your age >> ");
		String age = scanner.nextLine();
		System.out.print("Please enter your college >> ");
		String college = scanner.nextLine();
		System.out.print("Please enter your pet's name >> ");
		String pet = scanner.nextLine();
		System.out.print("Please enter your favorite quote >> ");
		String quote = scanner.nextLine();
		System.out.printf("Hello, my name is %s and I am %s years old.\nI'm enjoying my time at %s, though\nI miss my pet %s very much!\nMy favorite quote is \"%s\".", name, age, college, pet, quote);
	}
}
