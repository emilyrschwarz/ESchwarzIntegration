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
		/* playerAge allows the user to input their name
		   Java has a few different data types. They are the following:
		   Byte: used to save memory in a small amount
		   Short: same as a byte
		   Int: to use integer data types as an unsigned integer
		   Long: stores values larger than int
		   Float: used when you have to store something with a precise value 
		   (decimal)
		   Double: for decimals (never precise)
		   Boolean: only for true/false values
		   Char: represents a single 16-bit Unicode character */
		
		System.out.println("You're " + (int) playerAge + "? Nice! People of all ages "
		    + "can play, so you're in luck!");
		
		// start game below
		System.out.println("Greetings " + playerName + ", I am Robin, your mentor"
		    + " for your journey.");
		System.out.println("Please type 'Y', so I know you're ready!");
		String Y = input.next();
		
		//choose a companion
		System.out.println("Okay, so to begin your adventure, you will need a "
		    + "companion.");
		System.out.println("Type in either 1, 2, 3, or 4 to get your companion! "
		    + "Let fate decide your new best friend!");
		int playerCompanionChoice = input.nextInt();
		//playerCompanionChoice allows the user to type in a number to get a 
		//companion
		
		//prints the possible companion choices
		if(playerCompanionChoice == 1) {
		  System.out.println("Congrats! You have chosen the Water companion, "
		      + "Cascadia!");
		} else if (playerCompanionChoice == 2) {
		  System.out.println("Congrats! You have chosen the Fire companion,"
		      + " Ignatus!");
		} else if (playerCompanionChoice == 3) {
		  System.out.println("Congrats! You have chosen the Earth companion, "
		      + "Gaia!");
		} else if (playerCompanionChoice == 4) {
		  System.out.println("Congrats! You have chose the Air companion, Azure!");
		} else {
		  System.out.println("Oops! Restart and please choose an whole number "
		      + "between 1 and 4 to get your companion!");
		  
		}
		
		System.out.println("Now you have your companion! Next we will discuss "
		    + "some information about them!");
	  System.out.println("Please type in the number you chose previously "
	      + "to learn about your companion!");
	  int companionNumInput = input.nextInt();
	  
	  // allows user to input number to get info about companion
	
	  //returns info about companions
	  switch(companionNumInput) {
	    case 1:
	      Water water = new Water();
	      System.out.println(water.getWaterTypeStats());
	      break;
	    case 2:
	      Fire fire = new Fire();
	      System.out.println(fire.getFireTypeStats());
	      break;
	    case 3:
	      Earth earth = new Earth();
	      System.out.println(earth.getEarthTypeStats());
	      break;
	    case 4:
	      Air air = new Air();
	      System.out.println(air.getAirTypeStats());
	      break;
	    default:
	      System.out.println("Invalid Response!");
	  }
		
	  System.out.println("Now, let's do some math and string manipulation since "
	      + "Emily isn't far enough into the game to actually incorporate real "
	      + "battling with the companions yet!");
	  
	  //subtraction demonstration
	  System.out.println("Ignatus got injured in battle! Cascadia used Waterfall "
	      + "on him. Enter any number between 1 and 100 to determine how much "
	      + "damage she did!");
	  double hpSubtraction = input.nextDouble();
	  double hpValueOne = 100 - hpSubtraction;
	  
	  //addition demonstration
	  System.out.println("It seems that Ignatus now has an HP of " + hpValueOne +
	      " ! You decide to use a potion to heal him. Enter any number between "
	      + "1 and 50 to heal him!");
	  double hpAddition = input.nextDouble();
	  double hpValueTwo = hpValueOne + hpAddition;
	  
	  //multiplication demo
	  System.out.println("Nice! You've healed Ignatus to " + hpValueTwo + " !"
	      + " It's his turn to attack. "
	      + "How much damage will he do if he uses Fire Blast?");
	  System.out.println("Enter a number between 1 and 50 to determine how much"
	      + " damage the attack will do.");
	  double fireBlastAttack = input.nextDouble();
	  
	  System.out.println("Enter any positive number to determine how many times "
	      + "the attack will hit.");
	  double hits = input.nextDouble();
	  
	  double fireBlastTotalDamage = fireBlastAttack * hits;
	  System.out.println("It looks like his attack will do this much damage: " 
	  + (int) fireBlastTotalDamage);
	  
	  //division demo
	  System.out.println("What if Ignatus causes Cascadia's HP to decrease to 50?"
	      + " He used Fire Blast. In this case, that attack does 20 HP worth of "
	      + "damage.");
	  System.out.println("How many times did his attack hit? Let's divide 50 by "
	      + "20 to find out!");
	  
	  double hpDivision = 50/20;
	  System.out.println("It looks like his attack hit " + hpDivision + 
	      " times.");
	  
	  //remainder demo
	  System.out.println("What if we want to find the remainder of that number?");
	  int hpRemainder = 50%20;
	  System.out.println("It seems like the remainder is " + hpRemainder + " !");
	  
	  System.out.println("Please type 'A', so I know you're ready!");
    String A = input.next();
    //continues program so it's not just a wall of text
	  
    //string manipulation 
	  System.out.println("Here's some string manipulation that has nothing to do"
	      + " with this project, but I want a good grade so here we go.");
	  String words = "Hello World!";
	  char aChar = words.charAt(11);
	  System.out.println(aChar);
	  //prints character
	  
	  String hello = words.substring(0, 5);
	  System.out.println(hello);
	  //prints substring
	  
	  String upper = words.toUpperCase();
	  System.out.println(upper);
	  //prints in upper case
	  
	  String lower = words.toLowerCase();
	  System.out.println(lower);
	  //prints in lower case
	  
	  
	  
	  
    
	  
   

	}
}
