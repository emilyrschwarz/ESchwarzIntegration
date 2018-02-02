import java.util.Scanner;
// Emily Schwarz
// My Integration Project that integrates all the
// skills I've learned in my Intro to Programming class
// COP 2006

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to Emily's Integration Project!");
		System.out.println("This is a text-based adventure game.");
		// this is an intro to the game

		System.out.println("To begin, what is your name, adventurer?");
		String playerName = input.nextLine();
		// playerName allows the user to input their name
		
		System.out.println("Your name is " + playerName + "? How nice!");
		System.out.println("Next, how old are you, " + playerName + "?");
		int playerAge = input.nextInt();
		//playerAge allows the user to input their name
		
		System.out.println("You're " + playerAge + "? Nice! People of all ages "
		    + "can play, so you're in luck!");
		
		//start game below
		System.out.println("Greetings " + playerName + "I am Robin, your mentor"
		    + " for your journey.");
		System.out.println("Please type 'Y', so I know you're ready!");
		String Y = input.next();
		
		//choose a companion
		System.out.println("Okay, so to begin your adventure, you will need a "
		    + "companion.");
		System.out.println("Pick an element of nature to get your new friend! "
		    + "Please type 'water', 'air', 'fire', or 'earth'.");
		
		
	
		

	}
}
