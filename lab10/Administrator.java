/*
 * Dylan Vander Berg
 * Lab Exercise 10
 * 2: Administrator Class
 */
package lab10;

import java.util.Date;
import java.util.Scanner;

public class Administrator extends SalariedEmployee {
	String title;
	String responsibility;
	String supervisor;
	/**
	 * @param title
	 * @param responsibility
	 * @param supervisor
	 */
	public Administrator(String title, String responsibility, String supervisor) {
		this.title = title;
		this.responsibility = responsibility;
		this.supervisor = supervisor;
	}
	/**
	 * @param theName
	 * @param theDate
	 * @param theSalary
	 */
	public Administrator(String theName, Date theDate, double theSalary, String title, String responsibility, String supervisor) {
		super(theName, theDate, theSalary);
		this.title = title;
		this.responsibility = responsibility;
		this.supervisor = supervisor;
	}
	/**
	 * Empty Constructor
	 */
	public Administrator() {
	}
	
	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	/**
	 * @return the responsibility
	 */
	public String getResponsibility() {
		return responsibility;
	}
	/**
	 * @param responsibility the responsibility to set
	 */
	public void setResponsibility(String responsibility) {
		this.responsibility = responsibility;
	}
	/**
	 * @return the supervisor
	 */
	public String getSupervisor() {
		return supervisor;
	}
	/**
	 * @param supervisor the supervisor to set
	 */
	public void setSupervisor(String supervisor) {
		this.supervisor = supervisor;
	}
	
	@SuppressWarnings("deprecation")
	public void keyboardData(){
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Please enter the name >> ");
		setName(keyboard.nextLine());
		System.out.print("Please enter the year they were hired >> ");
		int year = Integer.parseInt(keyboard.nextLine().trim());
		System.out.print("Please enter the month they were hired >> ");
		int month = Integer.parseInt(keyboard.nextLine().trim());
		System.out.print("Please enter the date they were hired >> ");
		int date = Integer.parseInt(keyboard.nextLine().trim());
		setHireDate(new Date(year - 1900, month, date));
		System.out.print("Please enter the salary >> ");
		setSalary(Double.parseDouble(keyboard.nextLine().trim()));
		System.out.print("Please enter their title >> ");
		setTitle(keyboard.nextLine());
		System.out.print("Please enter their responsibility >> ");
		setResponsibility(keyboard.nextLine());
		System.out.print("Please enter their supervisor >> ");
		setSupervisor(keyboard.nextLine());
	}
	
	public boolean equals(Administrator other){
		if(!this.title.equals(other.title)){
			return false;
		}
		if(!this.responsibility.equals(other.responsibility)){
			return false;
		}
		if(!this.supervisor.equals(other.supervisor)){
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
		return super.toString() + "\nTitle: " + title + "\nResponsibility: " + responsibility + "\nSupervisor: " + supervisor;
	} 
	
	
}
