
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
       int room;
       int decision = 0;
       String location;
       String action;
       Scanner key = new Scanner (System.in) ;
       
       System.out.println ("This is a choose your adventure you will move through 7 rooms");
       room = key.nextInt ();
       System.out.println ("You could possibly make 35 decisions good luck");
       decision = key.nextInt ();
       if(room == 1){
           location = "kitchen";
       }
        else if (decision == 2) {

            action = "open refrigerator";
        }
        else if (decision == 3) {
            action = "drink strange milk";
            System.out.println ("spits out strange milk");
       }
        else if (decision == 4) {
            action = "eat leftovers";

       }
        else if (decision == 5) {
            action ="open cabinet";
       }
        else if (decision == 6) {
            action = "eat can of beans";
        }
        else if (decision == 7) {
            action = "take a plate";
       }
        //move upstairs

                

    }

}
