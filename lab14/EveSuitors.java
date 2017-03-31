/*
 * Dylan Vander Berg
 * Lab Exercise 14
 * 1: Princess Eve's Suitors
 */
package lab14;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class EveSuitors {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter the number of suitors >> ");//prompt number of suitors
		int n = keyboard.nextInt();
		LinkedList<Integer> suitors = new LinkedList<Integer>();
		//loop through and add suitors to list
		for(int i = 1; i <= n; i++){
			suitors.add(i);
		}
		int i = 0;
		while(suitors.size() > 1){
			if(i == suitors.size())//check if they deleted last element, then go to first
				i = 0;
			if(i < suitors.size() - 1)//if there is another element
				i++;//increment index
			else
				i = 0;//else go to beginning
			if(i < suitors.size() - 1)//if there is another element
				i++;//increment index
			else
				i = 0;//else go to beginning
			suitors.remove(i);//remove element
			printList(suitors);//print remaining suitors
		}
		System.out.println(suitors.get(0) + " wins");

	}
	
	private static void printList(LinkedList<Integer> list){
		//loop though and print suitors
		for(int i = 0; i < list.size(); i++){
			System.out.print(list.get(i));
		}
		System.out.println();
	}

}
