/*
 * Dylan Vander Berg
 * Lab Exercise 8
 * 1: String Selection Sort
 */
package lab8;

import java.util.ArrayList;

public class StringSelectionSort {
	static ArrayList<String> words = new ArrayList<>();
	public static void main(String[] args) {
		words.add("fun");
		words.add("funky");
		words.add("apple");
		words.add("zoology");
		words.add("qualm");
		words.add("gunk");
		words.add("gooey");
		words.add("force");
		words.add("gravity");
		words.add("brevity");
		
		//sort words
		for(int i = 0; i < words.size(); i++){
			interchange(getNextSmallest(i), i);
		}
		//display list of words after sort
		for(String word : words){
			System.out.println(word);
		}

	}
	
	/**
	 * 
	 * @param index - starting point for comparison so that we don't mess with words already sorted
	 * @return index of smallest value starting at given index
	 */
	private static int getNextSmallest(int index){
		int min = index;
		for(int i = index + 1; i < words.size(); i++){
			if(words.get(i).compareTo(words.get(min)) < 0){
				min = i;
			}
		}
		return min;
	}
	
	/**
	 * Description - Switch values at provided indices
	 * @param index1
	 * @param index2
	 */
	private static void interchange(int index1, int index2){
		String val1 = words.get(index1);
		words.set(index1, words.get(index2));
		words.set(index2, val1);
	}

}
