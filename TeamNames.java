import java.util.Scanner;
public class TeamNames{
    public static String main(){
        Scanner s = new Scanner(System.in);
        int teamNum  = s.nextInt();
        
        String[] teamNames = new String[9000];
        teamNames[0] = "team Moe";
        teamNames[181] = "Birds Of Prey";
        teamNames[195] = "Cyber Knights";
        teamNames[0] = "team Moe";
        teamNames[0] = "team Moe";
        teamNames[3182] = "Athena's Warriors";
        return (teamNames[teamNum]);
    }
}