/*
 * Dylan Vander Berg
 * Lab Exercise 11
 * 2: Programming Advice
 */
package lab11;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ProgrammingAdvice {

	public static void main(String[] args) {
		try {
			//print advice from file
			Scanner advice = new Scanner(new File("advice.txt"));
			while(advice.hasNextLine()){
				System.out.println(advice.nextLine());
			}
			//prompt for more advice
			System.out.println("Enter Some advice:");
			Scanner input = new Scanner(System.in);
			//create string from input
			String message = "";
			boolean first = true;
			while(true){
				String in = input.nextLine();
				if(in.trim().equals("") && !first){//end on 2 consecutive newlines
					break;
				}
				message += in + "\r\n";
				first = false;
			}
			//Write String to file
			FileWriter fw = new FileWriter("advice.txt", true);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(message);
			bw.close();
			System.out.println("Message Written");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException ex){
			ex.printStackTrace();
		}
	}

}
