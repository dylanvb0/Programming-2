package inheritence_rg;

import lab10.Employee;

public class Lawyer extends Employee {
	//overrides getVacationDays from Employee Class
	public int getVacationDays(){
		return 15;
	}
	
	//overrides getVacationFrom from Employee Class
	public String getVacationForm(){
		return "pink";
	}
	
	//behavior
	public void sue(){
		System.out.println("I'll see you in court!");
	}
}
