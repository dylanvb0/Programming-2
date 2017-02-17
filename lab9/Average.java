/*
 * Dylan Vander Berg
 * Lab Exercise 9
 * 1: Average
 */
package lab9;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		System.out.print("How many numbers would you like to insert? >> ");//prompt n
		int n = 0;
		try{
		n = keyboard.nextInt();
			if(n < 0){
				throw new RuntimeException("N must not be negative");//throw exception if n is negative
			}
		}catch(RuntimeException e){
			System.out.println(e.toString());//print other exception, namely if they input text
		}
		//loop through and add n numbers
		int sum = 0;
		for(int i = 0; i < n; i++){
			System.out.print("Please input a number >> ");
			try{
				sum += keyboard.nextInt();
			}catch(Exception e){
				System.out.println("Invalid number");//catch exception in case they don't insert an integer
				i--;//cancel increment to be sure the invalid int doesn't count as one of the n integers
				keyboard.nextLine();//clear out whatever was typed
			}
		}
		System.out.println("The average is: " + sum/n);//print average
	}
	

}
