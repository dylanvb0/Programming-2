package inheritence_rg;

import lab10.Employee;

public class Secretary extends Employee{
	public void takeDictation(String text){
		System.out.println("Dictating text: " + text);
	}
}
