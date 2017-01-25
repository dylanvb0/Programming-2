/*
 * Dylan Vander Berg
 * Lab Exercise 4
 * 3: Pizza Order
 */
package lab4;

public class PizzaOrder {
	
	private Pizza pizza1;
	private Pizza pizza2;
	private Pizza pizza3;
	private int numPizzas;

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
	 * Precondition: same number of pizza objects as numPizzas
	 * @return calculates the total of all pizzas in order
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
		PizzaOrder order = new PizzaOrder();
		order.setNumPizzas(2);
		order.setPizza1(pizza1);
		order.setPizza2(pizza2);
		double total = order.calcTotal();
		System.out.println("Your order is costs $" + total);
	}

}
