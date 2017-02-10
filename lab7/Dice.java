/*
 * Dylan Vander Berg
 * Lab Exercise 7
 * 3 - Dice Simulation
 */
package lab7;

public class Dice {

	public static void main(String[] args) {
		int[][] dice = new int[1000][2];//dice array
		for(int i = 0; i < dice.length; i++){
			dice[i][0] = (int)(Math.random() * 6) + 1;
			dice[i][1] = (int)(Math.random() * 6) + 1;
			System.out.println("(" + dice[i][0] + ", " + dice[i][1] + ") - Sum: " + (dice[i][0] + dice[i][1]));
		}
		int[] sums = new int[11];//array for sums, subtract 2 so that 2s are at index 0, etc.
		for(int i = 0; i < dice.length; i++){
			sums[dice[i][0] + dice[i][1] - 2]++;
		}
		//find highest number of sums
		int max = 0;
		int maxIndex = 0;
		for(int i = 0; i < sums.length; i++){
			System.out.println("Number of " + (i + 2) + "s: " + sums[i]);
			if(sums[i] > max){
				max = sums[i];
				maxIndex = i;
			}
		}
		System.out.println("The highest number of sums is " + (maxIndex + 2) + "s: " + max);
	}

}
