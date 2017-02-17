/*
 * Dylan Vander Berg
 * Lab Exercise 9
 * 2: Catch Division Exceptions
 */
package lab9;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CatchDivisionExceptions {

	public static void main(String[] args) {
		boolean invalid = true;
		//loop through until returnRatio() throws no exceptions
		while(invalid){
			try{
				returnRatio();
				invalid = false;
			}catch(DivByZeroException e){
				System.out.println(e.toString());//catch exception where they divide by zero
			}catch(InputMismatchException e){
				System.out.println("You must insert a number");//catch exception where they didn't input an int
			}catch(Exception e){
				System.out.println("Some other error occurred");//catch any other error
			}
		}

	}

	/**
	 * divides two numbers
	 * @throws DivByZeroException - if n2 is 0
	 */
	public static void returnRatio() throws DivByZeroException {
		Scanner scan = new Scanner(System.in);
		int n1, n2;
		double r;
		System.out.print("Enter the dividend >> ");
		n1 = scan.nextInt();
		System.out.print("Enter the divisor >> ");
		n2 = scan.nextInt();
		if(n2 == 0){
			throw new DivByZeroException();//throw exception if they are trying to divide by zero
		}
		//divide numbers and output result
		r = (double) n1 / n2;
		System.out.println(n1 + "/" + n2 + "=" + r);
	}
}
