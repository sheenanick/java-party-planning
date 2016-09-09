import java.io.Console;

public class App {
  public static void main(String[] args) {
    Console console = System.console();

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

    System.out.println("The total cost of your party is $" + cost + ".");
  }
}
