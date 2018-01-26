import java.util.Scanner;
// Emily Schwarz
// My Integration Project that integrates all the
// skills I've learned in my Intro to Programming class
// COP 2006

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Hello from Emily's Integration Project!");
		
		System.out.println("What is your name?");
		String inputName = input.nextLine();
		
		// this variable allows the user to input their name
		// a variable 
		
		System.out.println("Your name is " + inputName + "? How nice!");
		
		System.out.println("How old are you, " + inputName + "?");
		int inputAge = input.nextInt();
		
		System.out.println("You're " + inputAge + "? Cool!");
		

	}
}
