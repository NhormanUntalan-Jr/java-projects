// Required to get user input
import java.util.Scanner;

class Player
{
   // instance variables
   private String name;
   private String response;
   private double money;
   
   // two scanners are required for different purposes.
   Scanner keyboard = new Scanner(System.in);
   Scanner scan = new Scanner(System.in);
   
   // sets the String name to the user's name.
   public void setName()
   {
      System.out.println("\nRemind me, what is your name again?");
      System.out.print("> ");
      name = keyboard.nextLine();
   }
   
   // sets the double money to how much money the user wants to bring.
   public void setMoney()
   {
      System.out.println("\nHow much money are you taking?\n" +
                         "You only have $20 in your piggy bank.");
      
      System.out.print("> $");
      money = keyboard.nextDouble();
      
      if (money <= 0 || money > 20)
      {
         money = 5.00;
         System.out.printf("Since the amount of money was an insufficient amount of funds,\n" +
                            "you will get the default amount of $%.2f.\n", money);
      }
   }
   
   // Method that asks the user for a String response, and then making sure it matches the Strings input1 and input2.
   // If it doesn't, the user is asked to enter another String input. Keeps looping until they enter the required String.
   public void verifyResponse(String input1, String input2)
   {
      System.out.println("\nWhat is your decision? [ " + input1 + " | " + input2 + " ]");
      System.out.print("> ");
      response = scan.nextLine().toLowerCase();
      
      while (!response.equalsIgnoreCase(input1) && !response.equalsIgnoreCase(input2))
      {
         System.out.println("Please enter " + input1 + " or " + input2 + " as your input.");
         
         System.out.print("> ");
         response = scan.nextLine().toLowerCase();
      }
   }
   
   // Return the user's name to the main program.
   public String getName()
   {
      return name;
   }
   
   // Return the user's current amount of money to the main program.
   public double getMoney()
   {
      return money;
   }
   
   // Return the user's response to the main program.
   public String getResponse()
   {
      return response;
   }
   
   // Method that either adds or removes cash from the user's money depending on the boolean gaining.
   // If gaining is true, they get extra cash added to their money.
   // If gaining is false, they get cash taken out of their money depending on the cost.
   public void payGain(double c, boolean gaining)
   {
      if (gaining)
      {
         System.out.println("Adding $" + c + " to your pockets.\n");
         money += c;
      }
      else
      {
         System.out.println("Removing $" + c + " from your pockets.\n");
         money -= c;
      }
   }
   
   // Method that asks the user if they want to restart by entering y or n.
   // Depending on their input, the boolean restart is changed to true or false.
   // Returns restart to the main program
   public boolean proposeRestart()
   {
      boolean restart;

      System.out.println("Would you like to restart the game? (y/n)");
      System.out.print("> ");
      restart = keyboard.next().toLowerCase().startsWith("y");
      
      return restart;
   }
   
   // Method that closes the two scanners so they drop what they're currently holding
   public void closeScanner()
   {
      keyboard.close();
      scan.close();
   }
}