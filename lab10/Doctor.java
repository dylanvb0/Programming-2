/*
 * Dylan Vander Berg
 * Lab Exercise 10
 * 2: Doctor Class
 */
package lab10;

import java.util.Date;

public class Doctor extends SalariedEmployee {
	String specialty;
	double visitFee;
	/**
	 * @param specialty
	 * @param visitFee
	 */
	public Doctor(String specialty, double visitFee) {
		this.specialty = specialty;
		this.visitFee = visitFee;
	}
	/**
	 * 
	 */
	public Doctor() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param originalObject
	 */
	public Doctor(SalariedEmployee originalObject) {
		super(originalObject);
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param theName
	 * @param theDate
	 * @param theSalary
	 * @param specialty
	 * @param vistFee
	 */
	public Doctor(String theName, Date theDate, double theSalary, String specialty, double visitFee) {
		super(theName, theDate, theSalary);
		this.specialty = specialty;
		this.visitFee = visitFee;
	}
	
	public boolean equals(Doctor other){
		if(!this.specialty.equals(other.specialty)){
			return false;
		}
		if(this.visitFee != other.visitFee){
			return false;
		}
		if(this.getSalary() != other.getSalary()){
			return false;
		}
		if(!this.getName().equals(other.getName())){
			return false;
		}
		if(!this.getHireDate().equals(other.getHireDate())){
			return false;
		}
		return true;
	}
	
	public String toString(){
		return super.toString() + "\nSpecialty: " + specialty + "\nVisit Fee: $" + visitFee;
	} 
	
}
