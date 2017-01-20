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
		LinkedHashMap<Integer, Boolean> nums = new LinkedHashMap<Integer, Boolean>();//initialize hashmap, key is number that was input, boolean value is whether that number was matched
		//fill nums with numbers that were input
		for(int i = 0; i < 3; i++){
			nums.put(keyboard.nextInt(), false);
			if((int)nums.keySet().toArray()[i] > 9 || (int)nums.keySet().toArray()[i] < 0){//make sure number is between 0 and 9
				System.out.println("You entered an invalid number!");
				System.exit(0);
			}
		}
		ArrayList<Integer> randoms = new ArrayList<Integer>();//initialize arraylist for random lottery numbers
		System.out.print("The lottery numbers are:");
		//populate randoms and display lottery numbers
		for(int i = 0; i < 3; i++){
			randoms.add((int)(Math.random() * 10));
			if(i < 2){
				System.out.print(" " + randoms.get(i));
			}else{
				System.out.println(" " + randoms.get(i));
			}
		}
		//mark value of all matching numbers as true
		for(int i = 0; i < nums.size(); i++){
			for(int ii = 0; ii < randoms.size(); ii++){
				if(nums.keySet().toArray()[i] == randoms.get(ii)){
					nums.replace((Integer) nums.keySet().toArray()[i], true);
				}
			}
		}
		//count how many numbers were correct by iterating through nums and counting how many had a value of true
		int numCorrect = 0;
		for(int i = 0; i < nums.size(); i++){
			if((boolean) nums.values().toArray()[i])
				numCorrect++;
		}
		//award money based on number correct
		if(numCorrect == 0){
			System.out.println("You had no numbers correct. You get $0");
		}else if(numCorrect == 1){
			System.out.println("You had one number correct. You get $10");
		}else if(numCorrect == 2){
			System.out.println("You had two numbers correct. You get $100");
		}else if(numCorrect == 3){
			//check to see if the numbers were in the correct order
			boolean correctOrder = true;
			for(int i = 0; i < nums.size(); i++){
				if(nums.keySet().toArray()[i] != randoms.get(i)){
					correctOrder = false;
				}
			}
			//display award based on if numbers were in correct order
			if(correctOrder){
				System.out.println("You had all three numbers correct and in the right order. You get $1,000,000");
			}else{
				System.out.println("You had all three numbers correct. You get $1,000");
			}
		}
		
	}

}
