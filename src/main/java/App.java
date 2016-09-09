import java.io.Console;
import java.util.Random;

public class App {
  public static void main(String[] args) {
    Console console = System.console();

    System.out.println("Welcome to PDX Party Planning. Answer a few easy questions for a free quote! Or we can create a random party for you. Would you like us to create a party for you? Y/N");
    String answer = console.readLine();
    if (answer.equals("N")){
      System.out.println("Please enter the number of guests you are expecting at your party");
      int guests = Integer.parseInt(console.readLine());
      System.out.println("Please choose one of the following for your food service: full course, light meal, snacks");
      String food = console.readLine();
      System.out.println("Please choose one of the following for your beverage service: full bar, light refreshments, water");
      String beverages = console.readLine();
      System.out.println("Please choose one of the following for your entertainment service: live band, DJ, none");
      String entertainment = console.readLine();

      Party newParty = new Party(guests, food, beverages, entertainment);
      int cost = newParty.calculateCost();
      System.out.println("The estimated total cost for your party is $" + cost + ".");

    } else {
      Random randomGenerator = new Random();
      String[] foodArray = {"full course", "light meal", "snack"};
      String[] beverageArray = {"full bar", "light refreshments", "water"};
      String[] entertainmentArray = {"live band", "DJ", "none"};
      int guests = randomGenerator.nextInt(500) + 1;
      String food = foodArray[randomGenerator.nextInt(3)];
      String beverages = beverageArray[randomGenerator.nextInt(3)];
      String entertainment = entertainmentArray[randomGenerator.nextInt(3)];

      Party randomParty = new Party(guests, food, beverages, entertainment);
      System.out.println("These are the details for your party: Number of guests: " + guests + ", Food Service: " + food + ", Beverage Service: " + beverages + ", Entertainment: " + entertainment + ".");

      int cost = randomParty.calculateCost();
      System.out.println("The estimated total cost for your party is $" + cost + ".");
    }
  }
}
