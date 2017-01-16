/*
 * Dylan Vander Berg
 * Lab Exercise 2
 * 1: Math operations
 */
package lab2;

import java.util.Scanner;

public class MathOperations {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter two integers >> ");
		int firstInt = scanner.nextInt();
		int secondInt = scanner.nextInt();
		System.out.println("First integer is: " + firstInt);
		System.out.println("Second integer is: " + secondInt);
		System.out.printf("%d + %d = %d\n", firstInt, secondInt, firstInt + secondInt);
		System.out.printf("%d - %d = %d\n", firstInt, secondInt, firstInt - secondInt);
		System.out.printf("%d * %d = %d\n", firstInt, secondInt, firstInt * secondInt);
		System.out.printf("%d / %d = %f\n", firstInt, secondInt, ((double)firstInt / (double)secondInt));
		
		System.out.print("Enter two doubles >> ");
		double firstDouble = scanner.nextDouble();
		double secondDouble = scanner.nextDouble();
		System.out.println("First double is: " + firstDouble);
		System.out.println("Second double is: " + secondDouble);
		System.out.printf("%f + %f = %f\n", firstDouble, secondDouble, firstDouble + secondDouble);
		System.out.printf("%f - %f = %f\n", firstDouble, secondDouble, firstDouble - secondDouble);
		System.out.printf("%f * %f = %f\n", firstDouble, secondDouble, firstDouble * secondDouble);
		System.out.printf("%f / %f = %f\n", firstDouble, secondDouble, ((double)firstDouble / (double)secondDouble));
	
		System.out.print("Enter a double followed by an integer >> ");
		double first = scanner.nextDouble();
		int second = scanner.nextInt();
		System.out.println("First  is: " + first);
		System.out.println("Second integer is: " + second);
		System.out.printf("%f + %d = %f\n", first, second, first + second);
		System.out.printf("%f - %d = %f\n", first, second, first - second);
		System.out.printf("%f * %d = %f\n", first, second, first * second);
		System.out.printf("%f / %d = %f\n", first, second, ((double)first / (double)second));
	}

}
