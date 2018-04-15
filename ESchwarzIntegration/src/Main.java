import java.util.ArrayList;
import java.util.Arrays;
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
    /*
     * playerAge allows the user to input their name Java has a few different
     * data types. They are the following: Byte: used to save memory in a small
     * amount Short: same as a byte Int: to use integer data types as an
     * unsigned integer Long: stores values larger than int Float: used when you
     * have to store something with a precise value (decimal) Double: for
     * decimals (never precise) Boolean: only for true/false values Char:
     * represents a single 16-bit Unicode character
     */

    System.out.println("You're " + (int) playerAge + "? Nice! People of all "
        + "ages " + "can play, so you're in luck!");

    // start game below
    System.out.println("Greetings " + playerName + ", I am Robin, your mentor"
        + " for your journey.");
    System.out.println("Please type 'Y', so I know you're ready!");
    String Y = input.next();

    // choose a companion
    System.out.println(
        "Okay, so to begin your adventure, you will need a " + "companion.");
    System.out.println("Type in either 1, 2, 3, or 4 to get your companion! "
        + "Let fate decide your new best friend!");
    int playerCompanionChoice = input.nextInt();
    // playerCompanionChoice allows the user to type in a number to get a
    // companion

    // prints the possible companion choices
    if (playerCompanionChoice == 1) {
      System.out.println(
          "Congrats! You have chosen the Water companion, " + "Cascadia!");
    } else if (playerCompanionChoice == 2) {
      System.out.println(
          "Congrats! You have chosen the Fire companion," + " Ignatus!");
    } else if (playerCompanionChoice == 3) {
      System.out
          .println("Congrats! You have chosen the Earth companion, " + "Gaia!");
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

    // returns info about companions
    switch (companionNumInput) {
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

    System.out.println("Now that you have a companion, we can learn how to "
        + "do some cool stuff with code!");
    System.out.println("You have two options. You can choose to manipulate "
        + "code with math or words. Please type 1 for math or 2 for words to "
        + "get started!");
    int demoInput = input.nextInt();

    if (demoInput == 1) {
      mathDemo();
    } else {
      stringDemo();
    }

  }

  // math demo
  public static void mathDemo() {
    Scanner input = new Scanner(System.in);
    System.out.println("Welcome to a math demo!");

    // subtraction demonstration
    System.out.println("Ignatus got injured in battle! Cascadia used Waterfall "
        + "on him. Enter any number between 1 and 100 to determine how much "
        + "damage she did!");
    double hpSubtraction = input.nextDouble();
    double hpValueOne = 100 - hpSubtraction;

    // addition demonstration
    System.out.println("It seems that Ignatus now has an HP of " + hpValueOne
        + " ! You decide to use a potion to heal him. Enter any number between "
        + "1 and 50 to heal him!");
    double hpAddition = input.nextDouble();
    double hpValueTwo = hpValueOne + hpAddition;

    // multiplication demo
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

    // division demo
    System.out.println("What if Ignatus causes Cascadia's HP to decrease to 50?"
        + " He used Fire Blast. In this case, that attack does 20 HP worth of "
        + "damage.");
    System.out.println("How many times did his attack hit? Let's divide 50 by "
        + "20 to find out!");

    double hpDivision = 50 / 20;
    System.out
        .println("It looks like his attack hit " + hpDivision + " times.");

    // remainder demo
    System.out.println("What if we want to find the remainder of that number?");
    int hpRemainder = 50 % 20;
    System.out.println("It seems like the remainder is " + hpRemainder + " !");

    System.out.println("Next, we will use an array to see how we can sort "
        + "through different values of attack points.");
    System.out.println("This is how we can find the smallest number in array.");

    // array stuff, this allows the user to create the array
    double[] mainArray = new double[5];
    
    // enter 5 numbers to fill out the array
    System.out.println("Enter" + " " + mainArray.length + " numbers."
        + " The numbers will represent attack points.");
    for (int c = 0; c < mainArray.length; c++) {
      mainArray[c] = input.nextDouble();
    }
    System.out.println("The lowest value you typed was: " + min(mainArray));
    
    System.out.println("The sum of these attack points is: " + sum(mainArray));
    
    //System.out.println("Element at attack point index: " + find(mainArray));
    
    System.out.println("Now, we'll use a while loop to count the number of "
        + "times an attack will hit. Type in the number 1 to start the loop!");
    //input count for while loop
    int attackCounter = input.nextInt();
    
    // while demo 
      while (attackCounter < 6) {
        System.out.println("Attack hit " + attackCounter + "times!");
        attackCounter++;    
      }
    
     
  }

  // finds the minimum value of the array
  private static double min(double[] minArray) {
    double min = minArray[0];
    for (int i = 1; i < minArray.length; i++) {
      if (minArray[i] < min) {
        min = minArray[i];
      }
    }
    return min;
  }

  // finds the sum of an array
 public static double sum(double[] theSum) {
   int sum = 0;
   int i;
   
   for (i = 0; i < theSum.length; i++) {
     sum += theSum[i];
   }
    return sum;
 }
 
  // finding the index of an array, which isn't working ugh
 public static double find(double[] hufflepuff, double value) {
   double h = 0;
   for ( int i = 0; i < hufflepuff.length; i++) {
     if (hufflepuff[i]== value) {
       h = i;
       break;
     }
   }
   return h;
   
 }
 
  public static void stringDemo() {
    Scanner input = new Scanner(System.in);
    // string manipulation
    System.out.println("This is the string demo! This consists of a few "
        + "demonstrations about what you can do with words in code!");
    
    System.out.println("First, I'll show you what can be done with the "
        + "characters in the word 'adventure'.");
    
    String words = "Adventure";
    char aChar = words.charAt(0);
    System.out.println("This is the first character: " + aChar);
    // prints character

    String vent = words.substring(2, 6);
    System.out.println("This is a substring: " + vent);
    // prints substring

    String upper = words.toUpperCase();
    System.out.println("This is the word in uppercase: " + upper);
    // prints in upper case

    String lower = words.toLowerCase();
    System.out.println("This is the word in lowercase: " + lower);
    // prints in lower case
    
    System.out.println("Next, the string builder class will be used to show"
        + " other cool things you can do. Press 'A' to continue!");
    String a = input.next();
    
    System.out.println("Let's see what we can do with Cascadia's name!");
    
    //reverse
    String words2 = "Cascadia";
    StringBuilder sb = new StringBuilder(words2);
    sb.reverse();
    System.out.println("This is her name in reverse: " + sb);
    
    //delete
    StringBuilder sb2 = new StringBuilder(words2);
    sb2.delete(3, 7);
    System.out.println("This is her name with characters deleted: " + sb2);
    
    //insert 
    StringBuilder sb3 = new StringBuilder(words2);
    sb3.insert(8, "s");
    System.out.println("This is her name with a character added: " + sb3);
    
    }
  
    //two-dimensional array
   /* int[][] board = new int[3][3]; {
    for (int i = 0; i < board.length; i++) {
      for (int j = 0; j < board[i].length; j++) {
        board[i][j] = i+ j;
      }
    }
    } */
    
    /*ArrayList<String> list = new ArrayList<String>();
    list.add("Item1");
    int pos = list.indexOf("Item1");
    int size = list.size();
    boolean element = list.contains("Item5");
    String item = list.get(0);
    list.remove(0);
    list.remove("Item3");
    
    for (int i = 0; i < list.size(); i++) {
      System.out.println("Index: " + i + " - Item: " + list.get(i));
    }
    
    for (String str : list) {
      System.out.println("Item is: " + str);
    }
} */
}

  