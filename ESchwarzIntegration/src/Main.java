import java.util.Scanner;
// Emily Schwarz
// My Integration Project that integrates all the
// skills I've learned in my Introduction to Programming class.
// I love adventure style games, so I've decided to use what I've
// learned in class to make something fun!

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Hello, welcome to my Integration Project!");
		System.out.println("This is a text-based adventure game.");
		// This is an introduction to the game

		System.out.println("To begin, what is your name, adventurer?");
		String playerName = input.nextLine();
		// playerName allows the user to input their name
		// Here is where I've used my first variable. A variable is a 
		// a placeholder for something else, like a string, an integer,
		// a character etc.
		
		System.out.println("Your name is " + playerName + "? How nice!");
		System.out.println("Next, how old are you, " + playerName + "?");
		int playerAge = input.nextInt();
		// playerAge allows the user to input their name
		// Java has a few different data types. They are the following:
		// Byte: used to save memory in a small amount
		// Short: same as a byte
		// Int: to use integer data types as an unsigned integer
		// Long: stores values larger than int
		// Float: used when you have to store something with a precise value 
		// (decimal)
		// Double: for decimals (never precise)
		// Boolean: only for true/false values
		// Char: represents a single 16-bit Unicode character
		
		System.out.println("You're " + (int) playerAge + "? Nice! People of all ages "
		    + "can play, so you're in luck!");
		
		// start game below
		System.out.println("Greetings " + playerName + "I am Robin, your mentor"
		    + " for your journey.");
		System.out.println("Please type 'Y', so I know you're ready!");
		String Y = input.next();
		
		//choose a companion
		System.out.println("Okay, so to begin your adventure, you will need a "
		    + "companion.");
		System.out.println("Pick an element of nature to get your new friend! "
		    + "Please type 'water', 'air', 'fire', or 'earth'.");
		String playerElementChoice = input.nextLine();
		// playerElementChoice allows the player to type in element of their
		// choosing. This allows them to pick a companion based off an element
		
		
		

		

	}
}
