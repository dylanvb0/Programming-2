/*
 * Dylan Vander Berg
 * Lab Exercise 10
 * 1: Person Class
 */
package lab10;

public class Person {
	String first;
	String last;
	
	/**
	 * @param first
	 * @param last
	 */
	public Person(String first, String last) {
		this.first = first;
		this.last = last;
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
	
	public boolean equals(Person other){
		if(this.first == other.first && this.last == other.last){
			return true;
		}else{
			return false;
		}
	}
	
	public String toString(){
		return this.first + " " + this.last;
	}
	
}
