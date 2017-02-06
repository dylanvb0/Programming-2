/*
 * Dylan Vander Berg
 * Lab Exercise 6
 * 2 - Chapter 7 #1: Diving Score
 */
package lab6;

import java.util.Scanner;

public class DivingScore {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		double[] scores = new double[7];
		for(int i = 0; i < 7; i++){//loop through and get all 7 judges' scores
			boolean invalid = true;
			while(invalid){
				System.out.print("Judge " + (i + 1) + " score(0-10): ");
				double score = -1;
				try{
					score = keyboard.nextDouble();
					if(score >= 0 && score <= 10){
						scores[i] = score;
						invalid = false;
					}else{
						System.out.println("Invalid input. Please enter a decimal between 0 and 10.");//catches double inputed outside range
					}
				}catch(Exception e){
					System.out.println("Invalid input. Please enter a decimal between 0 and 10.");//catches case where double isn't input
					keyboard.nextLine();
				}
				
			}
		}
		boolean invalid = true;
		double difficulty = 0;
		while(invalid){
			System.out.print("Degree of difficulty(1.2-3.8): ");
			try{
				difficulty = keyboard.nextDouble();
				if(difficulty >= 1.2 && difficulty <= 3.8){
					invalid = false;
				}else{
					System.out.println("Invalid input. Please enter a decimal between 1.2 and 3.8.");//catches double inputed outside range
				}
			}catch(Exception e){
				System.out.println("Invalid input. Please enter a decimal between 1.2 and 3.8.");//catches case where double isn't input
				keyboard.nextLine();
			}
		}
		double min = Double.MAX_VALUE;//set min to maximum integer value to make sure that min is set by a lower number
		double max = 0;//set max to 0 to make sure that max is set by a higher number
		int totalScore = 0;
		for(int i = 0; i < scores.length; i++){//add all scores
			totalScore += scores[i];
			if(scores[i] < min){
				min = scores[i];
			}
			if(scores[i] > max){
				max = scores[i];
			}
		}
		System.out.println("Your score is: " + ((totalScore - max - min) * difficulty * .06));//subtract by max and min, then multiply by difficulty and .6

	}

}
