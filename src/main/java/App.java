import java.io.Console;
import java.util.Random;

public class App {
  public static void main(String[] args) {
    Console console = System.console();
    int guests = 0;
    String food = "";
    String beverages = "";
    String entertainment = "";
    boolean mainProgramRunning = true;

    System.out.println("Welcome to PDX Party Planning. Answer a few easy questions for a free quote! Or we can create a random party for you. Would you like us to create a party for you? Y/N");

    while(mainProgramRunning){
      String answer = console.readLine().toUpperCase();
      if (answer.equals("N")){
        System.out.println("Please enter the number of guests you are expecting at your party");
        guests = Integer.parseInt(console.readLine());
        System.out.println("Please choose one of the following for your food service: full course, light meal, snacks");
        boolean foodChecker = true;
        while(foodChecker) {
          food = console.readLine().toLowerCase();
          if(food.equals("full course") || food.equals("light meal") || food.equals("snacks")){
            foodChecker = false;
          } else {
            System.out.println("I'm sorry, we don't recognize your input. Please enter one of the following: full course, light meal, snacks.");
          }
        }
        System.out.println("Please choose one of the following for your beverage service: full bar, light refreshments, water");
        boolean beverageChecker = true;
        while(beverageChecker) {
          beverages = console.readLine().toLowerCase();
          if(beverages.equals("full bar") || beverages.equals("light refreshments") || beverages.equals("water")){
            beverageChecker = false;
          } else {
            System.out.println("I'm sorry, we don't recognize your input. Please enter one of the following: full bar, light refreshments, water.");
          }
        }
        System.out.println("Please choose one of the following for your entertainment service: live band, DJ, none");
        boolean entertainmentChecker = true;
        while(entertainmentChecker) {
          entertainment = console.readLine().toLowerCase();
          if(entertainment.equals("live band") || entertainment.equals("dj") || entertainment.equals("none")){
            entertainmentChecker = false;
          } else {
            System.out.println("I'm sorry, we don't recognize your input. Please enter one of the following: live band, DJ, none.");
          }
        }
        mainProgramRunning = false;
      } else if(answer.equals("Y")) {
        boolean programRunning = true;
        while(programRunning) {
          Random randomGenerator = new Random();
          String[] foodArray = {"full course", "light meal", "snack"};
          String[] beverageArray = {"full bar", "light refreshments", "water"};
          String[] entertainmentArray = {"live band", "DJ", "none"};
          guests = randomGenerator.nextInt(500) + 1;
          food = foodArray[randomGenerator.nextInt(3)];
          beverages = beverageArray[randomGenerator.nextInt(3)];
          entertainment = entertainmentArray[randomGenerator.nextInt(3)];
          System.out.println(String.format("These are the details for your party: Number of guests: %d, Food Service: %s, Beverage Service: %s, Entertainment: %s. Would you like to create a new party or see the cost estimate for this party? Enter one of the following options: New Party or See Cost", guests, food, beverages, entertainment));
          boolean choiceChecker = true;
          while(choiceChecker) {
            String choice = console.readLine().toLowerCase();
            if(choice.equals("new party")){
              choiceChecker = false;
            } else if(choice.equals("see cost")){
              programRunning = false;
              choiceChecker = false;
            } else {
              System.out.println("I'm sorry, we don't recognize your input. Please enter New Party or See Cost.");
            }
          }
        }
        mainProgramRunning = false;
      } else {
        System.out.println("I'm sorry, we don't recognize your input. Please enter Y or N.");
      }
    }
    Party party = new Party(guests, food, beverages, entertainment);
    int cost = party.calculateCost();
    System.out.println(String.format("The estimated total cost for your party is $%d.", cost));
  }
}
