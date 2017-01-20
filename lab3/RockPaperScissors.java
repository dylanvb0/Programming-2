/*
 * Dylan Vander Berg
 * Lab Exercise 3
 * 3: Rock, Paper, Scissors
 */
package lab3;

import java.util.Scanner;

public class RockPaperScissors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int gamesWon = 0;
		int gamesLost = 0;
		Choice humanChoice = Choice.ROCK;
		Choice computerChoice = Choice.ROCK;
		while(gamesWon + gamesLost < 5){//keep playing as long as there haven't been 5 games that have been played that aren't ties
			System.out.print("Please select rock, paper, or scissors: (r/p/s) >> " );
			switch(scanner.nextLine().trim()){//assign and print choice based on input
				case "r":
					humanChoice = Choice.ROCK;
					System.out.println("You selected Rock");
					break;
				case "p":
					humanChoice = Choice.PAPER;
					System.out.println("You selected Paper");
					break;
				case "s":
					humanChoice = Choice.SCISSORS;
					System.out.println("You selected Scissors");
					break;
				default:
					System.out.println("Invalid Option");
					System.exit(0);
			}
			switch((int)(Math.random() * 3)){//randomly select a choice for the computer
				case 0:
					computerChoice = Choice.ROCK;
					System.out.println("Computer selected Rock");
					break;
				case 1:
					computerChoice = Choice.PAPER;
					System.out.println("Computer selected Paper");
					break;
				case 2:
					computerChoice = Choice.SCISSORS;
					System.out.println("Computer selected Scissors");
					break;
				default:
					System.out.println("Impossible to get here");
					System.exit(0);
			}
			//if statements for all possible outcomes to determine winner
			if(humanChoice == Choice.ROCK){
				if(computerChoice == Choice.PAPER){
					gamesLost++;
					System.out.println("You lost");
				}else if(computerChoice == Choice.SCISSORS){
					gamesWon++;
					System.out.println("You won!");
				}else if(computerChoice == Choice.ROCK){
					System.out.println("It's a tie");
				}
			}else if(humanChoice == Choice.PAPER){
				if(computerChoice == Choice.SCISSORS){
					gamesLost++;
					System.out.println("You lost");
				}else if(computerChoice == Choice.ROCK){
					gamesWon++;
					System.out.println("You won!");
				}else if(computerChoice == Choice.PAPER){
					System.out.println("It's a tie");
				}
			}else if(humanChoice == Choice.SCISSORS){
				if(computerChoice == Choice.ROCK){
					gamesLost++;
					System.out.println("You lost");
				}else if(computerChoice == Choice.PAPER){
					gamesWon++;
					System.out.println("You won!");
				}else if(computerChoice == Choice.SCISSORS){
					System.out.println("It's a tie");
				}
			}
		}
		System.out.println("You won " + gamesWon + " games and lost " + gamesLost + " games.");//display results
	}
	
	//define enum for 3 choices in rock, paper, scissors
	private enum Choice{
		ROCK, PAPER, SCISSORS
	}

}
