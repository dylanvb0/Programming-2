/*
 * Dylan Vander Berg
 * Lab Exercise 7
 * 1 - Airplane Seats
 */
package lab7;

import java.util.Scanner;

public class AirplaneSeats {
	

	public static void main(String[] args) {
		String[][] seats = new String[7][5];
		Scanner keyboard = new Scanner(System.in);
		
		//Initialize array with seat data
		for(int i = 0; i < seats.length; i++){
			seats[i][0] = (i + 1) + "";
			seats[i][1] = "A";
			seats[i][2] = "B";
			seats[i][3] = "C";
			seats[i][4] = "D";
		}
		
		while(!seatsFull(seats)){
			displayCurrentSeats(seats);
			
			//prompt which seat they want to take
			System.out.print("Which seat would you like to take? (i.e. 2C) >>" );
			String input = keyboard.nextLine();
			//convert input into indexes for array
			int row = Integer.parseInt(input.trim().substring(0, 1)) - 1;
			String colString = input.trim().substring(1, 2);
			int col = 0;
			boolean invalid = false;//valid flag
			if(colString.equals("A")){
				col = 1;
			}else if(colString.equals("B")){
				col = 2;
			}else if(colString.equals("C")){
				col = 3;
			}else if(colString.equals("D")){
				col = 4;
			}else{
				invalid = true;
			}
			//validate row number
			if(row >= seats.length || row < 0){
				invalid = true;
			}
			
			if(!invalid){
				//check if seat is taken
				if(seats[row][col].equals("X")){
					System.out.println("This seat is occupied. Please choose another seat.");
				}
				seats[row][col] = "X";//set seat as taken
			}else{
				System.out.println("Please input a valid seat number.");//error message on invalid input
			}
		}
		
	}
	
	/**
	 * 
	 * @param seats - array of seats
	 * @return boolean as to whether seats are full
	 */
	static boolean seatsFull(String[][] seats){
		for(int i = 0; i < seats.length; i++){
			for(int ii = 1; ii < seats[i].length; ii++){
				if(!seats[i][ii].equals("X")){
					return false;
				}
			}
		}
		return true;
	}
	
	/**
	 * Postcondition: Printed array of seats
	 * @param seats - array of seats
	 */
	static void displayCurrentSeats(String[][] seats){
		//display current seats
		for(int i = 0; i < seats.length; i++){
			for(int ii = 0; ii < seats[i].length; ii++){
				System.out.print(seats[i][ii]);
			}
			System.out.println();
		}
	}

}
