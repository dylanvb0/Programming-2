/*
 * Dylan Vander Berg
 * Lab Exercise 13
 * 1: Driver Class
 */
package lab13;

public class DemoTurners {

	public static void main(String[] args) {
		Leaf leaf = new Leaf();
		leaf.turn();
		Page page = new Page();
		page.turn();
		Pancake pancake = new Pancake();
		pancake.turn();
		LightSwitch light = new LightSwitch();
		light.turn();
		Profit profit = new Profit();
		profit.turn();
	}

}
