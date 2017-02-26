package inheritence_rg;

import lab10.Employee;

public class Marketer extends Employee{
	
	public double getSalary(){
		return super.getSalary() + 10000;
	}
	
	//behavior
	public void advertise(){
		System.out.println("Act now, while supplies last!");
	}
}
