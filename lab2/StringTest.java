/*
 * Dylan Vander Berg
 * Lab Exercise 2
 * 4: String Test
 */
package lab2;

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Welcome to Java";
		String s2 = "Programming is fun";
		String s3 = "Welcome to Object Oriented Programming with Java";
		System.out.println("The result of s1.equals(s2) is: " + s1.equals(s2));
		System.out.println("The result of s1.equals(s3) is: " + s1.equals(s3));
		System.out.println("The result of s1.compareto(s2) is: " + s1.compareTo(s2));
		System.out.println("The result of s2.compareTo(s3) is: " + s2.compareTo(s3));
		System.out.println("The result of s2.compareTo(s2) is: " + s2.compareTo(s2));
		System.out.println("The result of s1.charAt(0) is: " + s1.charAt(0));
		System.out.println("The result of s1.indexOf('J') is: " + s1.indexOf('J'));
		System.out.println("The result of s1.lastIndexOf('a') is: " + s1.lastIndexOf('a'));
		System.out.println("The result of s1.lastIndexOf(\"o\", 15) is: " + s1.lastIndexOf("o", 15));
		System.out.println("The result of s1.length() is: " + s1.length());
		System.out.println("The result of s1.substring(5) is: " + s1.substring(5));
		System.out.println("The result of s1.substring(5, 11) is: " + s1.substring(5, 11));
		System.out.println("The result of s1.startsWith(\"Wel\") is: " + s1.startsWith("Wel"));
		System.out.println("The result of s1.endsWith(\"Java\") is: " + s1.endsWith("Java"));
		System.out.println("The result of s1.toLowerCase() is: " + s1.toLowerCase());
		System.out.println("The result of s1.toUpperCase() is: " + s1.toUpperCase());
		System.out.println("The result of s1.contains(s3) is: " + s1.contains(s3));
		System.out.println("The result of \"\\t Wel \\t\".trim() is: " + "\t Wel \t".trim());
		System.out.println("The result of s2 + s3 is: " + s2 + s3);

		
	}

}
