package farkle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;

/*Scoring Guidelines:
 * 1 - 100 points
 * 5 - 50 points
 * 3 ones - 1000 points
 * 3 twos-sixes - 100*number on dice
 * 1 through 6 straight - 3000 points
 * 3 pairs - 1500 points (including 4-of-a-kind and a pair)
 * 4 of a kind - 1000 points
 * 5 of a kind - 2000 points
 * 6 of a kind - 3000 points
 */

public class CurrentTurn {
	private int[] dice;//int array for value of dice
	private ArrayList<Integer> holdDice;
	private int turnScore;
	
	//constructor - roll dice
	public CurrentTurn(){
		dice = new int[6];
		holdDice = new ArrayList<Integer>();
		holdDice.add(2);
		rollDice();
	}
	
	public void rollDice(){
		System.out.print("Dice are: ");
		for(int i = 0; i < 6; i++){
			boolean diceExcluded = false;
			for(int ii = 0; ii < holdDice.size(); ii++){
				if(i == holdDice.get(ii)){
					diceExcluded = true;
				}
			}
			if(!diceExcluded){
				dice[i] = (int)(Math.random() * 6) + 1;
			}
			System.out.print(dice[i] + ", ");
		}
		checkFarkle();
	}
	
	//check farkle
	private void checkFarkle(){
		boolean farkle = true;
		farkle = (checkThreeOfAKind()) ? false : farkle;
		farkle = (checkOnes()) ? false : farkle;
		farkle = (checkFives()) ? false : farkle;
		farkle = (checkStraight()) ? false : farkle;
		farkle = (checkThreePairs()) ? false : farkle;
		farkle = (checkFourOfAKind()) ? false : farkle;
		farkle = (checkFiveOfAKind()) ? false : farkle;
		farkle = (checkSixOfAKind()) ? false : farkle;
		
		if(farkle){
			System.out.println("Farkle");
		}
	}

	private boolean checkSixOfAKind() {
		int[] numOfNums = getNumOfNums();
		for(int i = 0; i < 6; i++){
			if(numOfNums[i] == 6){
				return true;
			}
		}
		return false;
	}

	private boolean checkFiveOfAKind() {
		int[] numOfNums = getNumOfNums();
		for(int i = 0; i < 6; i++){
			if(numOfNums[i] >= 5){
				return true;
			}
		}
		return false;
	}

	private boolean checkThreePairs() {
		int[] numOfNums = getNumOfNums();
		int numPairs = 0;
		for(int i = 0; i < 6; i++){
			if(numOfNums[i] >= 2){
				numPairs++;
			}
		}
		return numPairs == 3;
	}

	private boolean checkStraight() {
		int[] numOfNums = getNumOfNums();
		for(int i = 0; i < 6; i++){
			if(numOfNums[i] != 1){
				return false;
			}
		}
		return true;
	}

	private boolean checkFourOfAKind() {
		int[] numOfNums = getNumOfNums();
		for(int i = 0; i < 6; i++){
			if(numOfNums[i] >= 4){
				return true;
			}
		}
		return false;
	}

	private boolean checkFives() {
		int[] numOfNums = getNumOfNums();
		return numOfNums[4] >= 1;//check if any 5s (index 4 is 5s)
	}

	private boolean checkOnes() {
		int[] numOfNums = getNumOfNums();
		return numOfNums[0] >= 1;//check if any 1s (index 0 is 1s)
	}

	private boolean checkThreeOfAKind() {
		int[] numOfNums = getNumOfNums();
		for(int i = 0; i < 6; i++){
			if(numOfNums[i] >= 3){
				return true;
			}
		}
		return false;
	}
	
	private ArrayList<Integer> findAllIndices(int num){
		ArrayList<Integer> returnArray = new ArrayList<Integer>();
		for(int i = 0; i < 6; i++){
			if(dice[i] == num){
				returnArray.add(i);
			}
		}
		return returnArray;
	}
	
	private int[] getNumOfNums(){
		int[] numOfNums = new int[6];//array to count the amount of each number(i.e. index 0 is num of 1s)
		for(int i = 0; i < 6; i++){
			numOfNums[dice[i] - 1]++;
		}
		return numOfNums;
	}
	
	//method check 3 of a kind - return HashMap<Integer, ArrayList<Integer>>//key, num of points earned, ArrayList<Integer>, indices of dice needed for points, return null for none
	//method check ones - return HashMap<Integer, ArrayList<Integer>>//key, num of points earned, ArrayList<Integer>, indices of dice needed for points, return null for none
	//method check fives - return HashMap<Integer, ArrayList<Integer>>//key, num of points earned, ArrayList<Integer>, indices of dice needed for points, return null for none
	//method check straight - return HashMap<Integer, ArrayList<Integer>>//key, num of points earned, ArrayList<Integer>, indices of dice needed for points, return null for none
	//method check 3 pairs - return HashMap<Integer, ArrayList<Integer>>//key, num of points earned, ArrayList<Integer>, indices of dice needed for points, return null for none
	//method check 4 of a kind - return HashMap<Integer, ArrayList<Integer>>//key, num of points earned, ArrayList<Integer>, indices of dice needed for points, return null for none
	//method check 5 of a kind - return HashMap<Integer, ArrayList<Integer>>//key, num of points earned, ArrayList<Integer>, indices of dice needed for points, return null for none
	//method check 6 of a kind - return HashMap<Integer, ArrayList<Integer>>//key, num of points earned, ArrayList<Integer>, indices of dice needed for points, return null for none
	
	//score roll based on user selection
	
	
}
