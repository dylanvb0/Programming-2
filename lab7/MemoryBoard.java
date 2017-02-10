/*
 * Dylan Vander Berg
 * Lab Exercise 7
 * 2 - Memory Board Class
 */
package lab7;

import java.util.ArrayList;

public class MemoryBoard {
	int[][] board;
	boolean[][] flipped;
	int guess1Row;
	int guess1Col;
	
	/**
	 * Generate board randomly
	 */
	public MemoryBoard() {
		//create mutable array list to hold remaining numbers that need to be put on the board
		ArrayList<Integer> remainingNums = new ArrayList<Integer>();
		for(int i = 1; i <= 8; i++){
			remainingNums.add(i);
			remainingNums.add(i);
		}
		//init fields
		this.board = new int[4][4];
		this.flipped = new boolean[4][4];
		this.guess1Row = 0;
		this.guess1Col = 0;
		//generate board
		for(int i = 0; i < board.length; i++){
			for(int ii = 0; ii < board[i].length; ii++){
				int randIndex = (int)(Math.random() * remainingNums.size());
				board[i][ii] = remainingNums.get(randIndex);//set cell value
				remainingNums.remove(randIndex);
				flipped[i][ii] = false;
			}
		}
		displayBoard();
	}
	
	/**
	 * 
	 * @return boolean as to whether all spots are flipped
	 */
	public boolean checkWin(){
		for(int i = 0; i < flipped.length; i++){
			for(int ii = 0; ii < flipped[i].length; ii++){
				if(!flipped[i][ii]){
					return false;
				}
			}
		}
		return true;
	}
	
	//loop through and arrays and display the board
	public void displayBoard(){
		System.out.println("  1234");
		for(int i = 0; i < board.length; i++){
			System.out.print((i + 1) + " ");
			for(int ii = 0; ii < board[i].length; ii++){
				if(flipped[i][ii]){
					System.out.print(board[i][ii]);
				}else{
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
	
	public void makeGuess(int row, int col){
		//display board plus guess plus first guess if applicable
		System.out.println("  1234");
		for(int i = 0; i < board.length; i++){
			System.out.print((i + 1) + " ");
			for(int ii = 0; ii < board[i].length; ii++){
				if(flipped[i][ii] || (i == row - 1 && ii == col - 1) || (guess1Row != 0 && guess1Row - 1 == i && guess1Col - 1 == ii)){
					System.out.print(board[i][ii]);
				}else{
					System.out.print("*");
				}
			}
			System.out.println();
		}
		if(guess1Row != 0){
			//check if they are a match if it's the second guess
			if(board[guess1Row - 1][guess1Col - 1] == board[row - 1][col - 1]){
				flipped[guess1Row - 1][guess1Col - 1] = true;
				flipped[row - 1][col - 1] = true;
			}
			guess1Row = 0;
			guess1Col = 0;
			displayBoard();
		}else{
			guess1Row = row;
			guess1Col = col;
		}
		
	}
	
}
