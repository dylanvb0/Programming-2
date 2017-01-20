/*
 * Dylan Vander Berg
 * Lab Exercise 3
 * 4: Count 21
 */
package lab3;

import java.util.Scanner;

public class Count21 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int runningTotal = 0;
		boolean playerTurn = false;
		while(runningTotal <= 21){//check to see if game is over if total is over 21
			if(playerTurn){
				System.out.println("Current value is: " + runningTotal);
				boolean invalid = true;
				int playerNumber = 0;
				while(invalid){//keep trying until input is valid
					System.out.print("Please enter 1, 2, or 3 >> ");
					try{
						playerNumber = scanner.nextInt();//this will throw exception if player doesn't enter an int
					}catch(Exception e){
						System.out.println("Invalid input");//catch exception for invalid input
					}
					if(playerNumber > 0 && playerNumber <= 3){//if player number is 1, 2, or 3, validate number
						invalid = false;
					}else{
						System.out.println("Invalid input");
					}
				}
				runningTotal += playerNumber;//add number to running total
				playerTurn = false;
			}else{
				int computerNumber = 1;
				//algorithm for computer to alway win, if multiple of 4 + 1 is within reach, choose whichever number will get you there
				for(int i = 5; i > 0; i--){
					int targetNumber = i * 4 + 1;
					if(targetNumber - runningTotal <= 3 && targetNumber - runningTotal > 0){
						computerNumber = targetNumber - runningTotal;
					}
				}
				//add number to total and print choice
				runningTotal += computerNumber;
				System.out.println("Computer chose: " + computerNumber);
				playerTurn = true;
			}
		}
		//display result of game (Hint: You always lose)
		if(playerTurn){
			System.out.println("You win!");
		}else{
			System.out.println("You lose!");
		}
	}

}
