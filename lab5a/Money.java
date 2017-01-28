/*
 * Dylan Vander Berg
 * Lab Exercise 5a
 * 5: Money
 */
package lab5a;

public class Money {
	int dollars;
	int cents;
	
	
	
	/**
	 * Postcondition: Money Object with 0 dollars and 0 cents
	 */
	public Money() {
		this.dollars = 0;
		this.cents = 0;
	}



	/**
	 * @param dollars
	 * @param cents
	 * Postcondition: Money Object with passed values
	 */
	public Money(int dollars, int cents) {
		this.dollars = dollars;
		this.cents = cents;
	}



	/**
	 * @param dollars
	 * Money Object with passed dollars and 0 cents
	 */
	public Money(int dollars) {
		this.dollars = dollars;
		this.cents = 0;
	}
	
	/**
	 * 
	 * @param m1
	 * @param m2
	 * @return Money object of the values of m1 + m2
	 */
	public static Money add(Money m1, Money m2){
		int totalCents = m1.cents + m2.cents;
		int totalDollars = m1.dollars + m2.dollars;
		if(totalCents > 100){
			totalCents -= 100;
			totalDollars++;
		}
		return new Money(totalDollars, totalCents);
	}
	
	/**
	 * 
	 * @param m2
	 * @return Money object of the values of this + m2
	 */
	public Money add(Money m2){
		int totalCents = this.cents + m2.cents;
		int totalDollars = this.dollars + m2.dollars;
		if(totalCents > 100){
			totalCents -= 100;
			totalDollars++;
		}
		return new Money(totalDollars, totalCents);
	}
	
	/**
	 * 
	 * @param m1
	 * @param m2
	 * @return Money object of the values of m1 - m2
	 */
	public static Money minus(Money m1, Money m2){
		int totalCents = m1.cents - m2.cents;
		int totalDollars = m1.dollars - m2.dollars;
		if(totalCents < 0){
			totalCents += 100;
			totalDollars--;
		}
		return new Money(totalDollars, totalCents);
	}
	
	/**
	 * 
	 * @param m2
	 * @return Money object of the values of this - m2
	 */
	public Money minus(Money m2){
		int totalCents = this.cents - m2.cents;
		int totalDollars = this.dollars - m2.dollars;
		if(totalCents < 0){
			totalCents += 100;
			totalDollars--;
		}
		return new Money(totalDollars, totalCents);
	}



	/**
	 * @return the dollars
	 */
	public int getDollars() {
		return dollars;
	}



	/**
	 * @param dollars the dollars to set
	 */
	public void setDollars(int dollars) {
		this.dollars = dollars;
	}



	/**
	 * @return the cents
	 */
	public int getCents() {
		return cents;
	}



	/**
	 * @param cents the cents to set
	 */
	public void setCents(int cents) {
		this.cents = cents;
	}
	
	/**
	 * @return dollars and cents of Money object in readable String format
	 */
	public String toString(){
		return "$" + this.dollars + "." + this.cents;
	}
	
	/**
	 * 
	 * @param m2
	 * @return boolean based on if dollars and cents are equal in both objects
	 */
	public boolean equals(Money m2){
		return (this.dollars == m2.dollars && this.cents == m2.cents);
	}
	
	
	public static void main(String[] args){
		Money m1 = new Money(5);
		Money m2 = new Money(3, 22);
		Money m3 = new Money();
		m3.setDollars(3);
		m3.setCents(22);
		System.out.println("m2.equals(m3): " + m2.equals(m3));
		System.out.println("m1.equals(m3): " + m1.equals(m3));
		System.out.println("m3.toString(): " + m3.toString());
		System.out.println("m1.minus(m2).toString(): " + m1.minus(m2).toString());
		System.out.println("Money.minus(m1, m2).toString(): " + Money.minus(m1, m2).toString());
		System.out.println("m1.add(m2).toString(): " + m1.add(m2).toString());
		System.out.println("Money.add(m1, m2).toString(): " + Money.add(m1, m2).toString());
		
	}
	
}
