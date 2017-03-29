package lab12;

/*
 * Dylan Vander Berg
 * Lab Exercise 12
 * 1: Handshakes
 */
import java.util.Scanner;

public class Handshakes {
	static int handshakes = 0;
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of people >> ");//prompt number of people
		handshake(input.nextInt() - 1);//subt 1 because you can't shake with yourself
		System.out.println("Handshakes: " + handshakes);//print resut
	}
	
	static void handshake(int n){
		if(n != 0){
			handshakes += n;//add iteration to pins
			handshake(--n);//call method again as long as n is not 0
		}
		
	}

}
