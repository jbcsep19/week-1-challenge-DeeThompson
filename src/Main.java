
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {


        String Go, Look = null, Walk = null, Eat, Lay, Open = null;


        Scanner key = new Scanner(System.in);

        System.out.println("This is your choose your adventure  you can Go in the 'First Floor' or 'Upstairs");
        System.out.println("If you choose to Go to 'First Floor' you can Go into the 'Kitchen', 'Living Room ', 'Patio");
        System.out.println("You can also Go to 'Basement' and 'walk in the dark'");
        System.out.println("If you Go 'Upstairs' you can go to the 'Bedroom' or 'Bathroom' ");
        System.out.println("Where do you want to Go?");Go = key.next();

        if (Go.equalsIgnoreCase("First Floor")) {
            System.out.println("Do you want to go to the Kitchen or Upstairs?");
            System.out.print(">");
            Walk = key.next();

            if (Walk.equalsIgnoreCase("Kitchen")) {
                System.out.println("Walk to the refrigerator");
            } else if (Walk.equalsIgnoreCase("Walk Upstairs")) {
                System.out.println(" ");
                System.out.println(">");
                System.out.println("Bedroom or Bathroom");
                System.out.println(">");
                Look = key.next();


                if (Look.equalsIgnoreCase("refrigerator")) ;
                System.out.println("In side the refrigerator is ' Strange Milk and 'Leftovers' Do you want to drink the milk or eat leftovers?");
                System.out.print(">");
                Eat = key.next();

                if (Eat.equalsIgnoreCase("Drink Milk")) {
                    System.out.println(" ");
                    System.out.println("You will throw up");
                } else if (Eat.equalsIgnoreCase("eat leftovers")) {
                    System.out.println(" ");
                    System.out.println("You will still throw up");
                }

                if (Walk.equalsIgnoreCase("Bedroom")) {
                    System.out.println("Lay on bed");
                } else if (Walk.equalsIgnoreCase("Open the drawer")) {
                    System.out.println(" ");
                    System.out.println("Ewwwww Dirty underwear!");
                    System.out.println("Now do you want to go back to the First Floor? Yes or No?");
                } else if (Walk.equalsIgnoreCase("Yes")) {
                    System.out.println(" ");
                    System.out.println("Go to Patio");
                } else if (Walk.equalsIgnoreCase("No")) {
                    System.out.println(" ");
                    System.out.println("Go to Living Room");
                    Walk = key.next();

                    if (Walk.equalsIgnoreCase("Turn on the TV")) {
                        System.out.print(" ");
                        System.out.print("Why is the TV so loud!?");
                        System.out.println("I need to turn the volume down"); }

                    if (Go.equalsIgnoreCase("Basement")) {
                        System.out.print("");
                        System.out.print("It's Dark I can't see anything down here!");
                        System.out.print("Do you want to turn on the lights or leave?");
                    } else if (Walk.equalsIgnoreCase("turn on the lights")) {
                      System.out.println("");
                      System.out.println("Open a closet");
                      System.out.println("Surprise!! You don't get to leave you have to clean the entire house, Here's cleaning supplies");
                      System.out.println("The End!! Have fun scrubbing the toilets");


                    }
                }
            }
        }
    }
}