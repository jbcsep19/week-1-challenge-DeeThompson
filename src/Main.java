
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {


        String Go, Look = null, Walk = null, Eat, Lay, Open = null;



        Scanner key = new Scanner(System.in);

        System.out.println("This is your choose your adventure  you can Go in the 'First Floor' or 'Upstairs");
        System.out.println("If you choose to Go to 'First Floor' you can Go into the 'Kitchen', 'Living Room ', 'Patio");
        System.out.println("You can also Go to 'Basement' and 'walk in the dark'");
        System.out.println("If you Go 'Upstairs' you can go to the 'Bedroom' or 'Bathroom' ");
        System.out.println("Where do you want to Go?");
        Go = key.next();

        if (Go.equalsIgnoreCase ("First Floor")) {
            System.out.println ("Do you want to go to the Kitchen or Upstairs?");
            System.out.print (">");
            Walk = key.next();

            if (Walk.equalsIgnoreCase("Kitchen")) {
                System.out.println("Walk to the refrigerator");
            } else if (Walk.equalsIgnoreCase("Walk Upstairs")) {
                System.out.println(" ");
                System.out.println(">");
                System.out.println("Bedroom or Bathroom");
                System.out.println(">");

            }


        }

        if  (Look == "refrigerator");
            System.out.println("In side the refrigerator is ' Strange Milk and 'Leftovers' Do you want to drink the milk or eat leftovers?");
            System.out.print (">");
            Eat=key.next();

            if (Eat.equalsIgnoreCase ("Drink Milk")) {
                System.out.println(" ");
                System.out.println("You will throw up");
            }else if (Eat.equalsIgnoreCase("eat leftovers")) {
                System.out.println(" ");
                System.out.println("You will still throw up");
            }
            if (Go == "Upstairs")
                System.out.println ("Go into the bedroom");
            if (Go == "Bedroom")
                System.out.println ("Lay on bed");
            else if (Open =="Open the  drawer" );

            if (Go == "Bathroom")
                System.out.println (" ");
            System.out.print("I need to pee");
             if (Go == "Use the toilet");
            System.out.println (" ");
            System.out.print("water shoots out the toilet and you run out the bathroom");

            if (Walk == "Patio")
                System.out.println (" ");
            System.out.print ("Maybe I'll go to the pool");

            if (Look == "the pool");
            System.out.println (" ");
            System.out.print ("This pool is dirty! But I want to Swim");

            if ( Go == "Swim in the pool");
            System.out.println (" ");
            System.out.print ("Need to clean the pool");

            System.out.println ("Gets out of pool and dries off");

            if (Go == "Living Room" );
            System.out.println (" ");
            System.out.print ("relax 'Turn on the TV'");
            System.out.print ("Change the change");

            if (Go == "Change channel");
            System.out.println (" ");
            System.out.print ("The Volume increased on it's own WTH!? Do you want to decrease the volume? Yes or No?");

            if (Go  == " yes Decrease the volume");
            System.out.println (" ");
            System.out.print ("your ears have been saved, do you want to continue watching TV?");

            if (Go == "no Decrease the volume");
            System.out.println (" ");
            System.out.print ("The neighbors will call the cops and your eardrums will burst");

            if (Walk == "To the 'Basement'");
            System.out.println (" ");
            System.out.print ("Turn on the lights");

            if (Walk == "Open a closet");
            System.out.println ("");
            System.out.print ("Surprise!! Here are plane tickets to Tahiti and a week hotel stay, you made it through the house!");





    }

    private static void If(boolean b) {
    }


}