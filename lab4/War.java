/*
 * Dylan Vander Berg
 * Lab Exercise 4
 * 1: War game with card class
 */
package lab4;

import java.util.Scanner;

public class War {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(true){
			System.out.print("Press enter to lay your next card or q to quit >> ");
			if(scanner.nextLine().contains("q")){
				System.out.println("You quit");
				System.exit(0);
			}
			Card playerCard = new Card();
			Card computerCard = new Card();
			if(playerCard.getValue() > computerCard.getValue()){//player has greater value so they win
				System.out.println("Your card: " + playerCard.getValue() + " of " + playerCard.getSuit());
				System.out.println("Computer's card: " + computerCard.getValue() + " of " + computerCard.getSuit());
				System.out.println("You win!");
			}else if(playerCard.getValue() < computerCard.getValue()){//computer has greater value so it wins
				System.out.println("Your card: " + playerCard.getValue() + " of " + playerCard.getSuit());
				System.out.println("Computer's card: " + computerCard.getValue() + " of " + computerCard.getSuit());
				System.out.println("You lose.");
			}else{//player and computer have same value of card
				if(playerCard.getSuit() == computerCard.getSuit()){//check if same card was dealt to both people
					computerCard = new Card(computerCard.getValue(), computerCard.getSuit());//deal a new card of the same value to the computer
				}
				System.out.println("Your card: " + playerCard.getValue() + " of " + playerCard.getSuit());
				System.out.println("Computer's card: " + computerCard.getValue() + " of " + computerCard.getSuit());
				System.out.println("It's a tie.");
			}
		}
	}

}
