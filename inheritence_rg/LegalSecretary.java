package inheritence_rg;
public class LegalSecretary extends Secretary {
	//overrides getSalary from Employee class
	public double getSalary(){
		return super.getSalary() + 5000;
	}
	
	//behavior
	public void fileLegalBriefs(){
		System.out.println("I could file all day!");
	}	
}
