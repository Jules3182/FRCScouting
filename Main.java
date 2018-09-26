/**
 * Team 3182's Scouting Program
 *
 * @author Julian Baker
 * @version 1.0
 */

import java.util.Scanner;
public class Main{
    public static void main(){
        TeamNames TeamNamesObject = new TeamNames();               
        String Correct = "n";
        //get team number
        while (Correct == "n"){
            System.out.println("Enter the Team Number");                          
            TeamNames.main();
            //confirm team number
            System.out.println("is " + "(" + TeamNames.main() +  ")" + " the correct team? (y-n)");
            Scanner s = new Scanner(System.in);
            Correct  = s.nextLine();

        }
        /*
        while (Correct == "n"){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of points scored");
        String Pts  = s.nextLine();

        //confirm team number
        System.out.println("is " + Pts + " the correct number? (y-n)");
        Correct  = s.nextLine();

        }
         */

    }
}