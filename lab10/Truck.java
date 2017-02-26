/*
 * Dylan Vander Berg
 * Lab Exercise 10
 * 1: Truck Class
 */
package lab10;

public class Truck extends Vehicle{
	double loadCapacity;
	int towingCapacity;
	
	public Truck(String manufacturer, int cylinders, Person owner, double load, int tow) {
		super(manufacturer, cylinders, owner);
		this.loadCapacity = load;
		this.towingCapacity = tow;
	}

	/**
	 * @return the loadCapacity
	 */
	public double getLoadCapacity() {
		return loadCapacity;
	}

	/**
	 * @param loadCapacity the loadCapacity to set
	 */
	public void setLoadCapacity(double loadCapacity) {
		this.loadCapacity = loadCapacity;
	}

	/**
	 * @return the towingCapacity
	 */
	public int getTowingCapacity() {
		return towingCapacity;
	}

	/**
	 * @param towingCapacity the towingCapacity to set
	 */
	public void setTowingCapacity(int towingCapacity) {
		this.towingCapacity = towingCapacity;
	}
	
	public boolean equals(Truck other){
		if(this.getCylinders() != other.getCylinders()){
			return false;
		}
		if(this.getManufacturer() != other.getManufacturer()){
			return false;
		}
		if(!this.getOwner().equals(other.getOwner())){
			return false;
		}
		if(this.loadCapacity != other.loadCapacity){
			return false;
		}
		if(this.towingCapacity != other.towingCapacity){
			return false;
		}
		return true;
	}
	
	public String toString(){
		return "Manufacturer: " + this.getManufacturer() + "\nCylinders: " + this.cylinders + "\nLoad Capacity: " + this.loadCapacity + "\nTowing Capacity: " + this.towingCapacity + "\nOwner: " + this.getOwner().toString();
	}
	
	
}
