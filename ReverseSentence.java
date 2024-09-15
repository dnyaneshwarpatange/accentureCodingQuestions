import java.util.Scanner;

public class ReverseSentence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(reverseString(str));
    }
 
    public static String reverseString(String str){
        String[] newSent = str.split(" ");
        String reversedString = "";

        for(int i=newSent.length-1;i>=0;i--){
            reversedString += newSent[i]+ " ";
        }return reversedString;

    }
}
