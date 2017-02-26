/*
 * Dylan Vander Berg
 * Lab Exercise 10
 * 2: Employee Class
 */
package lab10;
//class to represent employees in general

import java.util.Date;

public class Employee {
	
	private String name;
	private java.util.Date hireDate;
	
	public Employee(){
		name = "No name";
		hireDate = new java.util.Date();	//just a placeholder
	}
	
	public Employee(String theName, java.util.Date theDate){
		if(theName == null || theDate == null){
			System.out.println("Fatal Error creating employee");
			System.exit(0);
		}
		name = theName;
		hireDate = theDate;
	}
	
	public Employee(Employee originalObject){
		name = originalObject.name;
		hireDate = originalObject.hireDate;
	}
	
	public String getName(){
		return name;
	}
	
	public Date getHireDate(){
		return hireDate;
	}
	
	public int getHours(){
		return 40;
	}
	
	public void setName(String newName){
		if(newName == null){
			System.out.println("Fata Error setting employee name.");
			System.exit(0);
		}
		else
			name = newName;
	}
	
	public void setHireDate(Date newDate){
		if(newDate == null){
			System.out.println("Fatal Error setting employee hire date");
			System.exit(0);
		}
		else
			hireDate = newDate;
	}
	
	public String toString(){
		return (name + " " + hireDate.toString());
	}
	
	public boolean equals(Employee otherEmployee){
		return (name.equals(otherEmployee.name) && 
				hireDate.equals(otherEmployee.hireDate)); 
	}	
		
	public double getSalary(){
		return 50000.0;
	}
	
	public int getVacationDays(){
		return 10;
	}
	
	public String getVacationForm(){
		return "yellow";
	}
}
