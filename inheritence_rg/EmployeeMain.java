package inheritence_rg;

import lab10.Employee;

/*
 * Driver class for Employee and sub-classes of Employee
 */
public class EmployeeMain {

	public static void main(String[] args) {
		System.out.print("Employee: ");
		Employee edna = new Employee();
		System.out.print("\t" + edna.getHours() + ", ");
		System.out.printf("%.2f, ", edna.getSalary());
		System.out.print(edna.getVacationDays() + ", ");
		System.out.println(edna.getVacationForm() + ". ");
		System.out.println();
		
		System.out.print("Secretary: ");
		Secretary stan = new Secretary();
		System.out.print("\t" + stan.getHours() + ", ");
		System.out.printf("%.2f, ", stan.getSalary());
		System.out.print(stan.getVacationDays() + ", ");
		System.out.println(stan.getVacationForm() + ". ");
		stan.takeDictation("the cunning fox jumped over the brown lazy dog");
		System.out.println();
		
		System.out.print("Lawyer: ");
		Lawyer lucy = new Lawyer();
		System.out.print("\t" + lucy.getHours() + ", ");
		System.out.printf("%.2f, ", lucy.getSalary());
		System.out.print(lucy.getVacationDays() + ", ");
		System.out.println(lucy.getVacationForm() + ". ");
		lucy.sue();
		System.out.println();
		
		System.out.print("Legal Secretary: ");
		LegalSecretary leo = new LegalSecretary();
		System.out.print("\t" + leo.getHours() + ", ");
		System.out.printf("%.2f, ", leo.getSalary());
		System.out.print(leo.getVacationDays() + ", ");
		System.out.println(leo.getVacationForm() + ". ");
		leo.takeDictation("neato");
		leo.fileLegalBriefs();
		System.out.println();
		
//		System.out.print("Marketer: ");
//		Marketer mark = new Marketer();
//		System.out.print("\t" + mark.getHours() + ", ");
//		System.out.printf("%.2f, ", mark.getSalary());
//		System.out.print(mark.getVacationDays() + ", ");
//		System.out.println(mark.getVacationForm() + ". ");
//		mark.advertise();
//		System.out.println();
		
	}

}
