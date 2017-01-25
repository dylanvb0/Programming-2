/*
 * Dylan Vander Berg
 * Lab Exercise 4
 * 1: Card class for War
 */
package lab4;

public class Card {
	private char suit;
	private int value;
	
	/**
	 * Precondition: None
	 * Postcondition: Returns a Card object with a random value and suit
	 */
	public Card() {
		this.value = (int)(Math.random() * 13) + 1;
		int suitValue = (int)(Math.random() * 4) + 1;
		if(suitValue == 1){
			this.suit = 's';
		} else if(suitValue == 2){
			this.suit = 'h';
		} else if(suitValue == 3){
			this.suit = 'd';
		} else {
			this.suit = 'c';
		}
	}
	
	/**
	 * @param value - value in Card object
	 * @param suit - value that suit cannot be
	 * Precondition: None
	 * Postcondition: Returns a Card object with a given value and random suit
	 * Description: Invoked if random cards are the same, changes suit and keeps value the same
	 * loops setting the suit until suit is not equal to the suit passed in
	 */
	public Card(int value, char suit) {
		this.value = value;
		this.suit = suit;
		while(this.suit == suit){
			int suitValue = (int)(Math.random() * 4) + 1;
			if(suitValue == 1){
				this.suit = 's';
			} else if(suitValue == 2){
				this.suit = 'h';
			} else if(suitValue == 3){
				this.suit = 'd';
			} else {
				this.suit = 'c';
			}
		}
	}
	
	/**
	 * Precondition: Properly initialized Die object
	 * @return the value
	 */
	public char getSuit() {
		return suit;
	}
	
	/**
	 * Precondition: Properly initialized Die object
	 * Description: Sets suit of card object
	 */
	public void setSuit(char suit) {
		this.suit = suit;
	}
	
	/**
	 * Precondition: Properly initialized Die object
	 * @return the value
	 */
	public int getValue() {
		return value;
	}
	
	/**
	 * Precondition: Properly initialized Die object
	 * Description: Sets value of card object
	 */
	public void setValue(int value) {
		if(value >= 1 && value <= 13){
			this.value = value;
		}else{
			this.value = 1; 
		}
	}
	
	
}
