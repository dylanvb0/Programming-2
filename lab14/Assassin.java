//package lab14;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.LinkedList;
import java.util.Scanner;

public class Assassin {

	public static void main(String[] args) {
		//declare variables
		Scanner keyboard = new Scanner(System.in);
		Scanner assassin = null;
		Scanner graveyardText = null;
		LinkedList<String> players = new LinkedList<String>();
		LinkedList<String> graveyard = new LinkedList<String>();
		//set scanners
		try {
			assassin = new Scanner(new File("assassin.txt"));
			graveyardText = new Scanner(new File("graveyard.txt"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		//put all names in temp list
		LinkedList<String> temp = new LinkedList<String>();
		while(assassin.hasNextLine()){
			temp.add(assassin.nextLine().trim());
		}
		//randomize list
		while(temp.size() > 0){
			players.add(temp.remove((int)(Math.random() * temp.size())));
		}
		printKillRing(players);
		while(players.size() > 1){
			System.out.print("Who died? ");//prompt input
			String response = keyboard.nextLine().trim();
			for(int i = 0; i < players.size(); i++){//loop through and find player
				if(response.equalsIgnoreCase(players.get(i))){
					graveyard.add(players.remove(i));//transfer player from players to graveyard
					printKillRing(players);//print players
					printGraveyard(graveyard);//print graveyard
				}
			}
		}
		System.out.println(players.get(0) + " wins!");
		//append graveyard to file
		//get game number
		int gameNumber = 1;
		while(graveyardText.hasNext()){
			graveyardText.next();
			gameNumber = Integer.parseInt(graveyardText.next().substring(0,1)) + 1;//add 1 to previous game number
			graveyardText.nextLine();
		}
		String outputString = "Game " + gameNumber + ": ";//init string for file
		//loop through and add to string all dead players
		for(int i = 0; i < graveyard.size(); i++){
			outputString += graveyard.get(i);
			if(i != graveyard.size() - 1){
				outputString += ", ";
			}
		}
		outputString += "\r\n";
		try{
			//append string to graveyard file
			BufferedWriter bw = new BufferedWriter(new FileWriter("graveyard.txt", true));
			bw.write(outputString);
			bw.close();
		}catch(Exception e){
			e.printStackTrace();
		}

	}
	
	private static void printKillRing(LinkedList<String> list){
		//loop through and print all living players
		System.out.println("Kill Ring: ");
		for(int i = 0; i < list.size(); i++){
			System.out.print(list.get(i));
			if(i != list.size() - 1){
				System.out.print(", ");
			}
		}
		System.out.println();
	}
	
	private static void printGraveyard(LinkedList<String> list){
		//loop through and print all dead players
		System.out.println("Graveyard: ");
		for(int i = 0; i < list.size(); i++){
			System.out.print(list.get(i));
			if(i != list.size() - 1){
				System.out.print(", ");
			}
		}
		System.out.println();
	}

}
