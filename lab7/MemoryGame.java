/*
 * Dylan Vander Berg
 * Lab Exercise 7
 * 2 - Memory Game
 */
package lab7;

import java.util.Scanner;

public class MemoryGame {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		MemoryBoard board = new MemoryBoard();
		while(!board.checkWin()){
			System.out.print("Please enter your guess as two integers (row col) >> ");
			int row = keyboard.nextInt();
			int col = keyboard.nextInt();
			if(row <= 4 && row >= 1 && col <=4 && col >= 0 && !board.flipped[row - 1][col - 1]){
				board.makeGuess(row, col);
			}else{
				System.out.println("Please enter the row and col of an open spot between 1 and 4");
			}
		}
		System.out.println("You win!");
	}

}
