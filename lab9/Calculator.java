/*
 * Dylan Vander Berg
 * Lab Exercise 9
 * 3: Calculator
 */
package lab9;

import java.util.Scanner;

public class Calculator {
	static double result;
	static Scanner keyboard = new Scanner(System.in);
	static boolean caughtException = false;//boolean that is set depending as to whether the the previous equation ended by exception or normally
	
	public static void main(String[] args) {
		System.out.println("Calculator is on.");
		
		//infinite loop, runs until broken
		while(true){
			if(!caughtException){
				result = 0;//only set result to zero if last statementLoop() call did not end in exception
			}
			try{
				statementLoop();
			}catch(UnknownOperatorException e){
				System.out.println(e);//catch exception where they don't use +,-,*, or /
				caughtException = true;
			}catch(DivByZeroException f){
				System.out.println(f);//catch exception where they try to divide by 0
				caughtException = true;
			}catch(NumberFormatException g){
				System.out.println("You must insert a number");//catch exception where they don't insert a number
				caughtException = true;
			}catch(Exception h){
				System.out.println(h);//catch any other exception
				caughtException = true;
			}
			boolean invalid = true;
			//loop until valid input
			if(!caughtException){//if exception, bring straight back to statementLoop() without prompt
				while(invalid){
					System.out.print("Again (y/n)?");//prompt for another equation
					String response = keyboard.nextLine();
					if(response.trim().equals("n")){
						System.out.println("End of program");//input n, end program
						System.exit(0);
					}else if(response.trim().equals("y")){
						invalid = false;//input y, break input loop to go back to main program loop
					}else{
						System.out.println("Invalid input");//neither y nor n input, prompt again
					}
				}
			}
		}
	}
	
	/**
	 * Handles any operations for a single result variable
	 * @throws UnknownOperatorException
	 * @throws DivByZeroException
	 */
	private static void statementLoop() throws UnknownOperatorException, DivByZeroException{
		int index = 0;
		if(caughtException){
			System.out.println("reenter your last line:");//prompt to reenter last line if previous call ended in exception
		}
		caughtException = false;
		//infinite loop, runs until broken
		while(true){
			//output result, prefix based on how many times through loop
			if(index == 0){
				System.out.println("result = " + result);
				index++;
			}else if(index == 1){
				System.out.println("new result = " + result);
				index++;
			}else{
				System.out.println("updated result = " + result);
			}
			String command = keyboard.nextLine();
			if(command.trim().equalsIgnoreCase("r")){
				System.out.println("Final Result: " + result);//if r input, print result and break loop to end method
				break;
			}else if(command.substring(0, 1).equals("+")){//plus operator
				double n = Double.parseDouble(command.substring(1));
				result += n;
				System.out.println("result + " + n + " = " + result);//output result
			}else if(command.substring(0, 1).equals("-")){//minus operator
				double n = Double.parseDouble(command.substring(1));
				result -= n;
				System.out.println("result - " + n + " = " + result);//output result
			}else if(command.substring(0, 1).equals("*")){//multiply operator
				double n = Double.parseDouble(command.substring(1));
				result *= n;
				System.out.println("result * " + n + " = " + result);//output result
			}else if(command.substring(0, 1).equals("/")){//division operator
				double n = Double.parseDouble(command.substring(1));
				if(n == 0){
					throw new DivByZeroException();//throw exception if trying to divide b zero
				}
				result /= n;
				System.out.println("result / " + n + " = " + result);//output result
			}else{
				System.out.println(command.substring(0, 1) + " is an unknown operator");
				throw new UnknownOperatorException();				
			}
		}
	}

}
