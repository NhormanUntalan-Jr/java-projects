// Required to get the user's input for one section.
// All other asks for input are done by the Player class.
import java.util.Scanner;

public class Adventure1
{
   // Prints the introduction of the game
   public static void printIntroduction()
   {
      System.out.println("Welcome to the game!\n" +
                         "This is a simple text-based adventure game,\n" +
                         "with five different endings.\n" +
                         "Please note that this game should only be played by one person.");
   }
   
   // Prints the instructions of the game. Strongly encouraged to read the rules.
   public static void printInstructions()
   {
      System.out.println("\nHere are a few rules before we get to the game:\n" +
                         "When entering your name/response: ONLY enter a STRING (word) representing your first name/response!\n" +
                         "When entering the money amount: ONLY enter a DOUBLE (number with decimal) representing the number!\n" +
                         "Do you understand?");
   }
   
   // Prints part one of the story.
   public static void printStory1()
   {
      System.out.println("\nOur story starts with a lone house within a forest's clearing.\n" +
                         "Residing in this house is ... someone I cant't recall...");
   }
   
   // Prints part two of the story.
   public static void printStory2()
   {
      System.out.println("\nYou wanted to go on a quest to obtain the Goblet of Holding.\n" +
                         "You didn't tell me why you wanted such an artifact,\n" +
                         "but that doesn't matter. What does matter is preparing for the journey.\n" +
                         "However, you rethink your decisions and ask yourself this question:\n" +
                         "Would you rather stay in your home, or leave to get the Goblet?");
   }
   
   // Prints part three of the story.
   public static void printStory3()
   {
      System.out.println("After what felt like 30 minutes of walking, you notice.\n" +
                         "what looks like a small campsite beside the road up\n" +
                         "ahead. Then, you see that there are three people around\n" +
                         "the campfire. You decide to walk towards them without\n" +
                         "looking threatening. The group notices you, but instead\n" +
                         "of being agitated, they invite you to join them.\n");
                         
      System.out.println("Person 1: Come join us. We were just about to prepare lunch.\n" +
                         "Person 2: Yes, we'll be having chicken pot pie. Want some?\n" +
                         "\nEveryone beckons you to join them.\n");
                         
      System.out.println("You contemplate whether you should join the group or not.\n" +
                         "Do you join them for lunch, or decline their offer?");
   }
   
   // Prints part four of the story.
   public static void printStory4()
   {
      System.out.println("Person 3: Just so you know, there is like a massive" +
                         "gate that requires a payment to be opened.\n" +
                         "Person 3: From what I've heard, the fee is $3.99, so\n" +
                         "make sure you have enough to go through!\n");
                               
      System.out.println("With the reminder in mind, you continue with your\n" +
                         "journey. However, before you reach the gate, you\n" +
                         "get stopped by what looks like a bandit duo.\n");
            
      System.out.println("Bandit 1: Stop right there, wanderer!\n" +
                         "Bandit 2: Yeah! You better pay up a lot of money!\n");
   }
   
   // Main program
   public static void main(String[] args)
   {
      // Variables for agreement and confirmation for restart.
      boolean restart = true;
      String agreement;
      Scanner type = new Scanner(System.in);
      
      printIntroduction();
      
      // Asks the user for their input of whether they read the instructions or not.
      printInstructions();
      
      // Get's the user's input and sets agreement to it.
      System.out.print("> ");
      agreement = type.nextLine();
      
      // while loop that checks whether the user's input is "yes" or "y".
      // If it is, the program moves on, but if it isn't, the instructions are printed again, and the user needs to put another input.
      while (!agreement.equalsIgnoreCase("yes") && !agreement.equalsIgnoreCase("y"))
      {
         System.out.println("\nIt seems like you didn't get that. Read the instructions again.");
         printInstructions();
         
         // Get's the user's input and sets agreement to it.
         System.out.print("> ");
         agreement = type.nextLine();
      }
      
      System.out.println("With that out of the way, let's get to the main game!");
      
      // Do-while loop that contains a majority of the code.
      // Keeps looping the main game and only stops if player.proposeRestart() = false.
      do
      {
         // Variables for gaining/losing money and the boolean endAdventure.
         boolean isGaining = false;
         double cash = 0.0;
         double cost = 0.0;
         boolean endAdventure = false;
         
         // Creates a new Player object called player.
         Player player = new Player();
         
         printStory1();
         
         // Asks for the user's name and sets it using a method from the Player class.
         player.setName();
         System.out.printf("\nAh, %s, I remember now.\n", player.getName());
         
         printStory2();
         
         // Checks the user's response to make sure it matches one of the two Strings listed.
         player.verifyResponse("stay", "leave");
         
         // If-statement determing whether the user's response matches one String, or the other.
         if (player.getResponse().equals("stay"))
         {
            System.out.println("You decide not to leave at all.\n" +
                               "Instead, you said to yourself that you'll get it later.\n" +
                               "What actually happens is your unwillingness prevents you from doing anything.\n");
                               
            System.out.println("\tCongratulations! You got the\n" +
                               "\n\t\tPROCRASTINATION ENDING\n");
            endAdventure = true;
         }
         else if (player.getResponse().equals("leave"))
         {
            System.out.println("You decide to go on the adventure. Good choice.\n" +
                               "You get some rations, bandages, and a spoon?\n" +
                               "An odd choice, but I guess nothing is stopping you.\n" +
                               "Before you leave, you look back at your piggy bank.\n" +
                               "You definitely need money for the adventure, but you\n" +
                               "realize that bringing a lot could make an encounter\n" +
                               "with bandits problematic.");
         }
         
         // If-statement that checks the boolean endAdventure.
         // If true, then all of the code in this statement is ignored.
         if (!endAdventure)
         {
            // Asks the user to set how much money they want to bring as a double using a method from the Player class.
            player.setMoney();
            System.out.printf("$%.2f? Make sure to spend your money wisely!\n", player.getMoney());
            
            System.out.println("You get of your house, noticing the sunrise.\n" +
                               "After safely admiring the view, you get to your merry way.\n" +
                               "10 minutes of walking later, you see a sign up ahead.\n" +
                               "However, after noticing how worn down the words are,\n" +
                               "you decide to look at where they're pointing.\n" +
                               "The left road leads into a cave lit by torches,\n" +
                               "while on the right, it's just a regular road.");
            
            // Checks the user's response to make sure it matches one of the two Strings listed.
            player.verifyResponse("left", "right");
            
            // If-statement determing whether the user's response matches one String, or the other.
            if (player.getResponse().equals("left"))
            {
               System.out.println("You decide to be courageous, and take the left road.\n" +
                                  "Once you're fully inside, you notice a few coins on\n" +
                                  "the ground, and pick them up.\n");
               
               // Sets the double cash to 3.00 and the boolean isGaining to true.
               cash = 3.00;
               isGaining = true;
               
               // Either adds or removes cash from the user's money.
               // Since isGaining is true, the cash is getting added to their money.
               player.payGain(cash, isGaining);
               System.out.printf("Current amount of money: $%.2f\n", player.getMoney());
               
               System.out.println("\nAfter getting an extra $" + cash + ", you look around\n" +
                                  "and realize that this cave doesn't lead anywhere\n" +
                                  "You get out of the cave and take the right road anyway.\n");
               printStory3();
               
               // Checks the user's response to make sure it matches one of the two Strings listed.
               player.verifyResponse("join", "decline");
            }
            else if (player.getResponse().equals("right"))
            {
               System.out.println("Feeling a bit cautious, you decide to take the right road.");
               printStory3();
               
               // Checks the user's response to make sure it matches one of the two Strings listed.
               player.verifyResponse("join", "decline");
            }
         }
         
         // If-statement determing whether the user's response matches one String, or the other.
         if (player.getResponse().equals("join"))
         {
            System.out.println("You decide to join the group for lunch.\n");
            
            System.out.println("Person 1: Oh, your name is " + player.getName() + "? Well, nice to meet you.\n" +
                               "Barry: I'm Barry, that's Todd, and that's Jimbo.\n");
            
            System.out.println("After some talking, you realize that all of\n" +
                               "you have very similar interests. Instead of\n" +
                               "continuing your adventure, you join your new\n" +
                               "friends on their adventure.\n");
                               
            System.out.println("Instead of going for the Goblet of Holding,\n" +
                               "you found that the true goblet is the\n" +
                               "friends we made along the way.\n");
            
            System.out.println("\t\tCongratulations! You got the\n" +
                               "\n\tFRIENDS WE MADE ALONG THE WAY ENDING\n");
            endAdventure = true;
         }
         else if (player.getResponse().equals("decline"))
         {
            System.out.println("You decide to decline their offer and continue\n" +
                               "walking past them.\n");
            
            System.out.println("Person 1: Oh, okay then.\n");
            
            System.out.println("However, before you could get\n" +
                               "far, one person from the group yells at you\n" +
                               "about something.\n");
            
            printStory4();
            
            // Sets isGaining to false and the double cost to the user's money amount.
            isGaining = false;
            cost = player.getMoney();
            
            // If-statement that determines whether cost is less than or equal to 5.00.
            if (cost <= 5.00)
            {
               System.out.println("Bandit 2: Wait a second? You're not even worth robbing!" +
                                  "Bandit 1: What!? You only have $" + player.getMoney() + "?\n" +
                                  "Bandit 1: You know what Kyle? Let's go get someone else!" +
                                  "Bandit 2: Yeah! Preferably someone who's richer!\n");
               
               System.out.println("Luckily, the bandits left you alone, but.\n" +
                                  "self-esteem is a little bit destroyed.\n" +
                                  "At least you still have enough for the gate fee.\n");
            }
            else
            {
               // Either adds or removes cash from the user's money.
               // Since isGaining is false, the cash is removed from their money.
               player.payGain(cost, isGaining);
               System.out.printf("Current amount of money: $%.2f\n", player.getMoney());
               
               System.out.println("\nBandit 1: Hope you enjoy the rest of the day, friend! HAHAHAHA!\n" +
                                  "Bandit 2: Hey! Let's get out of here before we get caught again!\n" +
                                  "Bandit 1: You got it John! HAHAHA!\n");
               
               System.out.println("Sadly, with no money, you can't even afford to get.\n" +
                                  "the goblet. It looks like your journey ends here...\n");
               
               System.out.println("\t  Unfortunately, you got the\n" +
                                  "\n\t\t\tGOBLETLESS ENDING\n");
               endAdventure = true;
            }
         }
         
         // If-statement that checks the boolean endAdventure.
         // If true, then all of the code in this statement is ignored.
         if (!endAdventure)
         {
            System.out.println("Finally, you get to the gate, and it's massize.\n" +
                               "It looks like it's over 40 feet tall, and that's\n" +
                               "a lot of feet. You take a closer look at the door\n" +
                               "and see what looks like a toll booth just beside it.\n" +
                               "You go up to it, and an automated message begins speaking.\n");
            
            // Sets cost to 3.99;
            cost = 3.99;
            System.out.printf("Voice: Please pay the %.2f entrance fee.\n", cost);
            
            System.out.println("\nYou go to pay the fee with the money you have.");
            
            if (player.getMoney() >= cost)
            {
               // Either adds or removes cash from the user's money.
               // Since isGaining is false, the cash is removed from their money.
               player.payGain(cost, isGaining);
               System.out.printf("Current amount of money: $%.2f\n", player.getMoney());
               
               System.out.println("Once you enter the coins, the doors begin to\n" +
                                  "slowly open. On a lone pedestal in the room\n" +
                                  "is the legendary Goblet of Holding. You go\n" +
                                  "towards it, and begin pulling out some things\n" +
                                  "from your bag. How odd. After a few seconds of\n" +
                                  "struggle, you pull out a cereal box, a milk\n" +
                                  "carton, and that spoon.\n");
                                  
               System.out.println("I can't believe this entire adventure has\n" +
                                  "just been so you could eat cereal in a fancy\n" +
                                  "bowl. I cannot believe it!\n");
               
               System.out.println("Regardless of my frustrations, you happily\n" +
                                  "enjoy your cereal, and reach peace, I guess.\n");
               
               System.out.println("\tCongratulations, you got the\n" +
                                  "\n\t\t\t  TRUE ENDING\n");
            }
            else
            {
               System.out.println("Sadly, you realize that you don't have enough for.\n" +
                                  "the fee. Despite your hard work, you can't get\n" +
                                  "the legendary Goblet of Holding.\n");
               
               System.out.println("\t\tUnfortunately, you got the\n" +
                                  "\n\t\t\tGOBLETLESS 2 ENDING\n");
            }
         }
         
         // Sets the boolean restart based on the user's response to the method player.proposeRestart().
         restart = player.proposeRestart();
         
         // If-statement that if triggered, then activate the method player.closeScanner()
         if (!restart)
         {
            player.closeScanner();
         }
      } while (restart);
   }
}