/*
 * Dylan Vander Berg
 * Lab Exercise 11
 * 1: Popular Names
 */
package lab11;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class PopularNames {

	public static void main(String[] args) {
		try {
			//create scanner objects for input files and System.in
			Scanner boyNames = new Scanner(new File("boynames.txt"));
			Scanner girlNames = new Scanner(new File("girlnames.txt"));
			Scanner keyboard = new Scanner(System.in);
			//Create HashMaps to store the data
			HashMap<String, Integer> boysList = new LinkedHashMap<>();
			HashMap<String, Integer> girlsList = new LinkedHashMap<>();
			//insert boys names into list
			while(boyNames.hasNextLine()){
				boysList.put(boyNames.next(), boyNames.nextInt());
				boyNames.nextLine();
			}
			//insert girls names into list
			while(girlNames.hasNextLine()){
				girlsList.put(girlNames.next(), girlNames.nextInt());
				girlNames.nextLine();
			}
			System.out.print("Enter a name to search >> ");//prompt search
			String name = keyboard.nextLine();
			boolean foundGirl = false;
			int rank = 0;
			//loop through girls
			for(Entry<String, Integer> entry : girlsList.entrySet()){
				rank++;
				if(name.trim().equalsIgnoreCase(entry.getKey())){//output rank and popularity if it's found
					System.out.println(name + " is ranked " + rank + " in popularity among girls with " + entry.getValue() + " namings.");
					foundGirl = true;
				}
			}
			//display not found message if not found
			if(!foundGirl){
				System.out.println(name + " is not ranked among the top 1000 girl names");
			}
			boolean foundBoy = false;
			rank = 0;
			//loop through boys
			for(Entry<String, Integer> entry : boysList.entrySet()){
				rank++;
				
				if(name.trim().equalsIgnoreCase(entry.getKey())){//output rank and popularity if it's found
					System.out.println(name + " is ranked " + rank + " in popularity among boys with " + entry.getValue() + " namings.");
					foundBoy = true;
				}
			}
			//display not found message if not found
			if(!foundBoy){
				System.out.println(name + " is not ranked among the top 1000 boy names");
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

}
