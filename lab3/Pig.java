/*
 * Dylan Vander Berg
 * Lab Exercise 3
 * 1: Pig
 */
package lab3;

import java.util.Scanner;

public class Pig {

	public static void main(String[] args) {
		int humanScore = 0;
		int computerScore = 0;
		int tempScore = 0;//value for score on current turn
		boolean humanTurn = true;
		boolean firstRoll = true;
		Scanner scanner = new Scanner(System.in);
		while(humanScore < 100 && computerScore < 100){
			if(humanTurn){//if player's turn
				System.out.print("Would You like to ROLL AGAIN or HOLD? (r/h) >> ");
				String response = "";
				if(!firstRoll){//if it's the first roll of their turn, we don't need input on if they want to roll
					response = scanner.nextLine();
				}
				if(firstRoll || response.equals("r")){//if roll
					firstRoll = false;
					int roll = (int)(Math.random() * 6) + 1;
					if(roll == 1){
						System.out.println("You rolled a 1");
						humanTurn = false;
						tempScore = 0;
						System.out.println("You have " + humanScore + " points");
						System.out.println("Computer has " + computerScore + " points");
					}else{
						System.out.println("You rolled a " + roll);
						tempScore += roll;
						
					}
				}else if(response.equals("h")){//if hold
					humanScore += tempScore;
					tempScore = 0;
					humanTurn = false;
					System.out.println("You have " + humanScore + " points");
					System.out.println("Computer has " + computerScore + " points");
				}
			}else{//if computer's turn
				if(tempScore < 20){//if turn score is less than 20
					int roll = (int)(Math.random() * 6) + 1;
					firstRoll = true;
					if(roll == 1){//computer got a 1
						System.out.println("Computer rolled a 1");
						humanTurn = true;
						tempScore = 0;
						System.out.println("You have " + humanScore + " points");
						System.out.println("Computer has " + computerScore + " points");
					}else{
						System.out.println("Computer rolled a " + roll);
						tempScore += roll;
					}
				}else{//if turn score is greater than 20, computer must hold
					computerScore += tempScore;
					tempScore = 0;
					humanTurn = true;
					firstRoll = true;
					System.out.println("You have " + humanScore + " points");
					System.out.println("Computer has " + computerScore + " points");
				}
			}
			
		}
		//find winner and display results
		if(humanScore > 100){
			System.out.println("You won!");
			System.out.println("Your points: " + humanScore);
			System.out.println("Computer's points: " + computerScore);
		}else{
			System.out.println("You lose!");
			System.out.println("Your points: " + humanScore);
			System.out.println("Computer's points: " + computerScore);
		}

	}
	


}
