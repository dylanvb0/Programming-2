/*
 * Dylan Vander Berg
 * Lab Exercise 2
 * 5: Vending Machine
 */
package lab2;

import java.util.Scanner;

public class VendingMachine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Price of item >> ");
		int price = 0;
		try{
			price = scanner.nextInt();
		}catch(Exception e){
			System.out.println("Invalid amount. Amount must be a multiple of 5 at least 25 and at most 100");
			return;
		}
		if(price > 25 || price > 100 || price % 5 != 0){
			System.out.println("Invalid amount. Amount must be a multiple of 5 at least 25 and at most 100");
		}else{
			int currentAmount = 100;
			int quarters = 0;
			int dimes = 0;
			int nickels = 0;
			while(currentAmount > price){
				if(currentAmount - price >= 25){
					quarters++;
					currentAmount -= 25;
				}else if(currentAmount - price >= 10){
					dimes++;
					currentAmount -= 10;
				}else if(currentAmount - price >= 5){
					nickels++;
					currentAmount -= 5;
				}
			}
			System.out.printf("Your item cost %d cents. Your change was %d qarter(s), %d dime(s), and %d nickel(s)", price, quarters, dimes, nickels);
		}
	}

}
