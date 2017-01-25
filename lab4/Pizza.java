/*
 * Dylan Vander Berg
 * Lab Exercise 4
 * 3: Pizza Class
 */
package lab4;

public class Pizza {
	private String size;
	private int cheeseTopping;
	private int pepperoniTopping;
	private int hamTopping;
	 
	/**
	 * @param size - must be "small", "medium", or "large"
	 * @param cheeseTopping - must be nonnegative
	 * @param pepperoniTopping - must be nonnegative
	 * @param hamTopping - must be nonnegative
	 */
	public Pizza(String size, int cheeseTopping, int pepperoniTopping, int hamTopping) {
		setSize(size);
		setCheeseTopping(cheeseTopping);
		setPepperoniTopping(pepperoniTopping);
		setHamTopping(hamTopping);
	}

	/**
	 * @return the size - must be "small", "medium", or "large"
	 */
	public String getSize() {
		return size;
	}

	/**
	 * @param size the size to set - must be "small", "medium", or "large"
	 */
	public void setSize(String size) {
		if(size == "small" || size == "medium" || size == "large"){
			this.size = size;
		}
	}

	/**
	 * @return the cheeseTopping
	 */
	public int getCheeseTopping() {
		return cheeseTopping;
	}

	/**
	 * @param cheeseTopping the cheeseTopping to set - must be nonnegative
	 */
	public void setCheeseTopping(int cheeseTopping) {
		if(cheeseTopping >= 0){
			this.cheeseTopping = cheeseTopping;
		}
	}

	/**
	 * @return the pepperoniTopping
	 */
	public int getPepperoniTopping() {
		return pepperoniTopping;
	}

	/**
	 * @param pepperoniTopping the pepperoniTopping to set - must be nonnegative
	 */
	public void setPepperoniTopping(int pepperoniTopping) {
		if(pepperoniTopping >= 0){
			this.pepperoniTopping = pepperoniTopping;
		}
	}

	/**
	 * @return the hamTopping
	 */
	public int getHamTopping() {
		return hamTopping;
	}

	/**
	 * @param hamTopping the hamTopping to set - must be nonnegative
	 */
	public void setHamTopping(int hamTopping) {
		if(hamTopping >= 0){
			this.hamTopping = hamTopping;
		}
	}
	
	/**
	 * Precondition: properly initialized Pizza object with fields set
	 * @return cost of the pizza object
	 */
	public double calcCost(){
		double currentCost = 0;
		if(this.size.equals("small")){
			currentCost += 10;
		}else if(this.size.equals("medium")){
			currentCost += 12;
		}else if(this.size.equals("large")){
			currentCost += 14;
		}
		currentCost += 2 * this.cheeseTopping;
		currentCost += 2 * this.pepperoniTopping;
		currentCost += 2 * this.hamTopping;
		return currentCost;
		
	}
	
	/**
	 * Precondition: properly initialized pizza object with fields set
	 * @return description of Pizza
	 */
	public String getDescription(){
		return this.size + " pizza with " + this.cheeseTopping + " cheese toppings, " + 
				this.pepperoniTopping + " pepperoni toppings, " + this.hamTopping + 
				" ham toppings and costs $" + this.calcCost();
	}
	
	
}
