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
		while(runningTotal <= 21){
			if(playerTurn){
				System.out.println("Current value is: " + runningTotal);
				boolean invalid = true;
				int playerNumber = 0;
				while(invalid){
					System.out.print("Please enter 1, 2, or 3 >> ");
					try{
						playerNumber = scanner.nextInt();
					}catch(Exception e){
						System.out.println("Invalid input");
					}
					if(playerNumber >= 0 && playerNumber <= 3){
						invalid = false;
					}else{
						System.out.println("Invalid input");
					}
				}
				runningTotal += playerNumber;
				playerTurn = false;
			}else{
				int computerNumber = 1;
				for(int i = 5; i > 0; i--){
					int targetNumber = i * 4 + 1;
					if(targetNumber - runningTotal <= 3 && targetNumber - runningTotal > 0){
						computerNumber = targetNumber - runningTotal;
					}
				}
				
				runningTotal += computerNumber;
				System.out.println("Computer chose: " + computerNumber);
				playerTurn = true;
			}
		}
		if(playerTurn){
			System.out.println("You win!");
		}else{
			System.out.println("You lose!");
		}
	}

}
