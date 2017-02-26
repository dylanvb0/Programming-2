/*
 * Dylan Vander Berg
 * Lab Exercise 10
 * 1: Driver File
 */
package lab10;

public class VehicleDriver {

	public static void main(String[] args) {
		Person p1 = new Person("John", "Smith");
		Person p2 = new Person("Mark", "Johnson");
		Truck t1 = new Truck("Ford", 8, p1, 28.3, 15);
		Truck t2 = new Truck("Chevy", 6, p2, 16.4, 73);
		Truck t3 = new Truck("Ford", 8, p1, 28.3, 15);
		System.out.println("t1 is:\n" + t1);
		System.out.println("t2 is:\n" + t2);
		System.out.println("t3 is:\n" + t3);
		if(t1.equals(t2)){
			System.out.println("t1 equals t2");
		}
		if(t1.equals(t3)){
			System.out.println("t1 equals t3");
		}
	}

}
