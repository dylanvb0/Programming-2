/*
 * Dylan Vander Berg
 * Lab Exercise 3
 * 2: Lottery
 */
package lab3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class Lottery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Guess 3 numbers from 0 to 9 >> ");
		LinkedHashMap<Integer, Boolean> nums = new LinkedHashMap<Integer, Boolean>();
		for(int i = 0; i < 3; i++){
			nums.put(keyboard.nextInt(), false);
			if((int)nums.keySet().toArray()[i] > 9 || (int)nums.keySet().toArray()[i] < 0){
				System.out.println("You entered an invalid number!");
				System.exit(0);
			}
		}
		ArrayList<Integer> randoms = new ArrayList<Integer>();
		System.out.print("The lottery numbers are:");
		for(int i = 0; i < 3; i++){
			randoms.add((int)(Math.random() * 10));
			if(i < 2){
				System.out.print(" " + randoms.get(i));
			}else{
				System.out.println(" " + randoms.get(i));
			}
		}
		for(int i = 0; i < nums.size(); i++){
			for(int ii = 0; ii < randoms.size(); ii++){
				if(nums.keySet().toArray()[i] == randoms.get(ii)){
					nums.replace((Integer) nums.keySet().toArray()[i], true);
				}
			}
		}
		int numCorrect = 0;
		for(int i = 0; i < nums.size(); i++){
			if((boolean) nums.values().toArray()[i])
				numCorrect++;
		}
		if(numCorrect == 0){
			System.out.println("You had no numbers correct. You get $0");
		}else if(numCorrect == 1){
			System.out.println("You had one number correct. You get $10");
		}else if(numCorrect == 2){
			System.out.println("You had two numbers correct. You get $100");
		}else if(numCorrect == 3){
			boolean correctOrder = true;
			for(int i = 0; i < nums.size(); i++){
				if(nums.keySet().toArray()[i] != randoms.get(i)){
					correctOrder = false;
				}
			}
			if(correctOrder){
				System.out.println("You had all three numbers correct and in the right order. You get $1,000,000");
			}else{
				System.out.println("You had all three numbers correct. You get $1,000");
			}
		}
		
	}

}
