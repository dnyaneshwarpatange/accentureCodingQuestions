import java.util.*;
public class RockPaperSesisor {

    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        String newStr = sc.nextLine();
        if(newStr.equals("Rock")){
            System.out.println("Paper");
        }else if(newStr.equals("Paper")){
            System.out.println("Seizor");
        }else if(newStr.equals("Seizor")){
            System.out.println("Rock");
        }else{
            System.out.println("failed");
        }

    }
}
