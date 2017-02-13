/*
 * Dylan Vander Berg
 * Lab Exercise 8
 * 3: Contact List
 */
package lab8;

import java.util.ArrayList;
import java.util.Scanner;

public class Contact {
	String first;
	String last;
	String phone;
	String email;
	static ArrayList<Contact> contacts = new ArrayList<>();
	static Scanner keyboard = new Scanner(System.in);

	public static void main(String[] args) {
		//init arraylist with names
		contacts.add(new Contact("Jon", "Lewiston", "9092782640", "jlewiston@gmail.com"));
		contacts.add(new Contact("Terry", "Bradshaw", "8916656640", "tbradshaw@hotmail.com"));
		contacts.add(new Contact("Mason", "Moore", "1357348957", "mmoore@gmail.com"));
		contacts.add(new Contact("Andrew", "Antinony", "4883347891", "aantinony@outlook.com"));
		contacts.add(new Contact("Travis", "Reanstad", "4431863146", "treanstad@gmail.com"));
		mainMenu();//show main menu
	}
	
	static void mainMenu(){
		//give available actions
		System.out.println("Add a contact (a)");
		System.out.println("Display all contacts (d)");
		System.out.println("Search for contact (s)");
		String in = keyboard.nextLine();
		//call correct method based on selected action
		if(in.contains("a")){
			addContact();
		}else if(in.contains("d")){
			displayMultipleContacts(contacts);
		}else if(in.contains("s")){
			searchContacts();
		}else{
			mainMenu();
		}
	}
	
	private static void addContact() {
		//prompt user input for fields and add contact to contacts arrayList
		Contact contact = new Contact();
		System.out.print("Enter a first name >> ");
		contact.setFirst(keyboard.nextLine().trim());
		System.out.print("Enter a last name >> ");
		contact.setLast(keyboard.nextLine().trim());
		System.out.print("Enter a phone number >> ");
		contact.setPhone(keyboard.nextLine().trim());
		System.out.print("Enter an email addrsss >> ");
		contact.setEmail(keyboard.nextLine().trim());
		contacts.add(contact);
		displayOneContact(contacts.size() - 1, contacts);//display newly created contact
	}

	static void searchContacts(){
		//prompts a keyword and finds all contacts that have a field that contains the keyword
		System.out.print("Please enter a search keyword >> ");
		String in = keyboard.nextLine();
		ArrayList<Contact> searchResults = new ArrayList<>();
		for(Contact contact : contacts){
			if(contact.first.contains(in) || contact.last.contains(in) || contact.phone.contains(in) || contact.email.contains(in)){
				searchResults.add(contact);
			}
		}
		displayMultipleContacts(searchResults);//display the results
	}
	
	
	static void displayMultipleContacts(ArrayList<Contact> contacts){
		//display all contacts in passed list, either all contacts or search results
		for(int index = 0; index < contacts.size(); index++){
			System.out.println("First Name: " + contacts.get(index).first);
			System.out.println("Last Name: " + contacts.get(index).last);
			System.out.println("Phone: " + contacts.get(index).phone);
			System.out.println("Email: " + contacts.get(index).email);
			System.out.println("View Contact (" + index + ")");
			System.out.println();
		}
		if(contacts.size() == 0){
			System.out.println("No Results");//no results message if nothing in list
		}
		System.out.println("Back to main menu (b)");
		String in = keyboard.nextLine();
		if(in.contains("b")){
			mainMenu();
		}else{
			try{
				//display contact corresponding to number input
				int inNum = Integer.parseInt(in);
				displayOneContact(inNum, contacts);
			}catch(Exception e){
				//if it gets here, they didn't type in an integer or b, so try display same initial list
				displayMultipleContacts(contacts);
			}
		}
	}
	
	/**
	 * 
	 * @param index - index in list that was being viewed
	 * @param contacts - list that was being viewed
	 */
	static void displayOneContact(int index, ArrayList<Contact> contacts){
		//print fields of contact
		System.out.println("First Name: " + contacts.get(index).first);
		System.out.println("Last Name: " + contacts.get(index).last);
		System.out.println("Phone: " + contacts.get(index).phone);
		System.out.println("Email: " + contacts.get(index).email);
		//prompt for delete or back to main menu
		System.out.println("Back to main menu (b)");
		System.out.println("Delete contact (d)");
		String in = keyboard.nextLine();
		if(in.contains("d")){
			deleteContact(index, contacts);
		}else if(in.contains("b")){
			mainMenu();
		}else{
			displayOneContact(index, contacts);
		}
	}

	private static void deleteContact(int index, ArrayList<Contact> contacts) {
		//remove contact from contacts list
		Contact.contacts.remove(contacts.get(index));
		mainMenu();
	}

	/**
	 * @param first
	 * @param last
	 * @param phone
	 * @param email
	 */
	public Contact(String first, String last, String phone, String email) {
		this.first = first;
		this.last = last;
		this.phone = phone;
		this.email = email;
	}

	public Contact() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the first
	 */
	public String getFirst() {
		return first;
	}

	/**
	 * @param first the first to set
	 */
	public void setFirst(String first) {
		this.first = first;
	}

	/**
	 * @return the last
	 */
	public String getLast() {
		return last;
	}

	/**
	 * @param last the last to set
	 */
	public void setLast(String last) {
		this.last = last;
	}

	/**
	 * @return the phone
	 */
	public String getPhone() {
		return phone;
	}

	/**
	 * @param phone the phone to set
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	
	

}
