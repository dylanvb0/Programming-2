/*
 * Dylan Vander Berg
 * Lab Exercise 5a
 * 8: Pizza Order
 */
package lab5a;

public class PizzaOrder {
	
	private Pizza pizza1;
	private Pizza pizza2;
	private Pizza pizza3;
	private int numPizzas;
	
	/**
	 * 
	 * @param order
	 * Postcondition: PizzaOrder Object with same values of passed object
	 */
	public PizzaOrder(PizzaOrder order){
		//check numPizzas to make sure we don't try to copy a null object
		if(order.numPizzas >= 1){
			this.pizza1 = new Pizza(order.pizza1);
		}
		if(order.numPizzas >= 2){
			this.pizza2 = new Pizza(order.pizza2);
		}
		if(order.numPizzas >= 3){
			this.pizza3 = new Pizza(order.pizza3);
		}
		this.numPizzas = order.numPizzas;
	}

	/**
	 * Postcondition: Blank PizzaOrder Object
	 */
	public PizzaOrder() {
	}

	/**
	 * @param numPizzas the numPizzas to set
	 */
	public void setNumPizzas(int numPizzas) {
		if(numPizzas > 0 && numPizzas <= 3){
			this.numPizzas = numPizzas;
		}
	}

	/**
	 * @param pizza1 the pizza1 to set
	 */
	public void setPizza1(Pizza pizza1) {
		this.pizza1 = pizza1;
	}

	/**
	 * @param pizza2 the pizza2 to set
	 */
	public void setPizza2(Pizza pizza2) {
		this.pizza2 = pizza2;
	}

	/**
	 * @param pizza3 the pizza3 to set
	 */
	public void setPizza3(Pizza pizza3) {
		this.pizza3 = pizza3;
	}
	
	
	
	/**
	 * @return the pizza1
	 */
	public Pizza getPizza1() {
		return pizza1;
	}

	/**
	 * @return the pizza2
	 */
	public Pizza getPizza2() {
		return pizza2;
	}

	/**
	 * @return the pizza3
	 */
	public Pizza getPizza3() {
		return pizza3;
	}

	/**
	 * @return the numPizzas
	 */
	public int getNumPizzas() {
		return numPizzas;
	}

	/**
	 * Precondition: same number of pizza objects as numPizzas
	 * @return calculates the total cost of all pizzas in order
	 */
	public double calcTotal(){
		if(this.numPizzas == 1){
			return this.pizza1.calcCost();
		}else if(this.numPizzas == 2){
			return this.pizza1.calcCost() + this.pizza2.calcCost();
		}else{
			return this.pizza1.calcCost() + this.pizza2.calcCost() + this.pizza3.calcCost();
		}
	}

	public static void main(String[] args) {
		Pizza pizza1 = new Pizza("large", 1, 0, 1);
		Pizza pizza2 = new Pizza("medium", 2, 2, 0);
		PizzaOrder order1 = new PizzaOrder();
		order1.setNumPizzas(2);
		order1.setPizza1(pizza1);
		order1.setPizza2(pizza2);
		double total = order1.calcTotal();
		PizzaOrder order2 = new PizzaOrder(order1);
		order2.getPizza1().setCheeseTopping(3);
		total = order2.calcTotal();
		double origTotal = order1.calcTotal();
		System.out.println("order1 costs $" + origTotal);
		System.out.println("order2 costs $" + total);
	}

}
