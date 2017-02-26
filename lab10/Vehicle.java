/*
 * Dylan Vander Berg
 * Lab Exercise 10
 * 1: Vehicle Class
 */
package lab10;

public class Vehicle {
	String manufacturer;
	int	cylinders;
	Person owner;
	
	/**
	 * @param manufacturer
	 * @param cylinders
	 * @param owner
	 */
	public Vehicle(String manufacturer, int cylinders, Person owner) {
		this.manufacturer = manufacturer;
		this.cylinders = cylinders;
		this.owner = owner;
	}

	/**
	 * @return the manufacturer
	 */
	public String getManufacturer() {
		return manufacturer;
	}

	/**
	 * @param manufacturer the manufacturer to set
	 */
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	/**
	 * @return the cylinders
	 */
	public int getCylinders() {
		return cylinders;
	}

	/**
	 * @param cylinders the cylinders to set
	 */
	public void setCylinders(int cylinders) {
		this.cylinders = cylinders;
	}

	/**
	 * @return the owner
	 */
	public Person getOwner() {
		return owner;
	}

	/**
	 * @param owner the owner to set
	 */
	public void setOwner(Person owner) {
		this.owner = owner;
	}
	
	
}
