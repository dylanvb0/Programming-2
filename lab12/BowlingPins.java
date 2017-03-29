/*
 * Dylan Vander Berg
 * Lab Exercise 12
 * 2: Bowling Pins
 */
package lab12;

import java.util.Scanner;

public class BowlingPins {
	static int pins = 0;
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of rows >> ");//prompt number of pins
		addRow(input.nextInt());
		System.out.println("Pins: " + pins);//print resut
	}
	
	static void addRow(int n){
		if(n != 0){
			pins += n;//add iteration to pins
			addRow(--n);//call method again as long as n is not 0
		}
		
	}

}
