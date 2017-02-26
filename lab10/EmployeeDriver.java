/*
 * Dylan Vander Berg
 * Lab Exercise 10
 * 2: Employee Driver
 */
package lab10;

import java.util.Date;

public class EmployeeDriver {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		Date d1 = new Date(112, 5, 13);
		Date d2 = new Date(113, 2, 7);
		Administrator a1 = new Administrator("Joe", d1, 70000, "Associate", "Oversee Sales", "Jim");
		Administrator a2 = new Administrator("Joe", d1, 70000, "Associate", "Oversee Sales", "Jim");
		Administrator a3 = new Administrator("Jimmy", d2, 70456, "Executive", "Daily Operations", "Charles");
		Administrator a4 = new Administrator();
		a4.keyboardData();
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		System.out.println(a1.equals(a2));
		System.out.println(a1.equals(a3));
		System.out.println(a1.equals(a4));
		Doctor doctor1 = new Doctor("Joe", d1, 90000, "Skin", 200);
		Doctor doctor2 = new Doctor("Joe", d1, 90000, "Skin", 200);
		Doctor doctor3 = new Doctor("Jimmy", d2, 90456, "Eyes", 300);
		System.out.println(doctor1);
		System.out.println(doctor2);
		System.out.println(doctor3);
		System.out.println(doctor1.equals(doctor2));
		System.out.println(doctor1.equals(doctor3));
	}

}