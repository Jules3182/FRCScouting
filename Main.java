
/**
 * Team 3182's Scoutimg Program
 *
 * @author Julian Baker
 * @version 1.0
 */

import java.util.Scanner;
public class Main{
    public static void main(){
        String Correct = "n";
        //get team number
        while (Correct == "n"){
            Scanner s = new Scanner(System.in);
            System.out.println("Enter the Team Number");
            String TeamNum  = s.nextLine();

            //confirm team number
            System.out.println("is " + TeamNum + " the correct number? (y-n)");
            Correct  = s.nextLine();

        }
                while (Correct == "n"){
            Scanner s = new Scanner(System.in);
            System.out.println("Enter the number of points scored");
            String Pts  = s.nextLine();

            //confirm team number
            System.out.println("is " + Pts + " the correct number? (y-n)");
            Correct  = s.nextLine();

        }
        
        
    }
}