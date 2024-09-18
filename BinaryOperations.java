import java.util.*;
public class BinaryOperations{
    public static void main(String[] args) {
        // String s1 = "1011";
        // String s2 = "1111";
        // String operation = "AND";
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        String operation = sc.next();
        switch (operation) {
            case "AND":
            System.out.println(andOps(s1, s2));
                
                break;
            case "OR":
            System.out.println(orOps(s1, s2));
            break;

            case "XOR":
            System.out.println(xorOps(s1, s2));

            default:
            System.out.println("Give Proper Input");
                break;
        }
        
    }
    public static String andOps(String s1,String s2){
        StringBuilder andAns = new StringBuilder();
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)=='1' && s2.charAt(i)=='1'){
                andAns.append("1");

            }else{
                andAns.append('0');
            }
           
        } return andAns.toString();
    }
    public static String orOps(String s1,String s2){
        StringBuilder orAns = new StringBuilder();
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)=='1' || s2.charAt(i)=='1'){
                orAns.append("1");

            }else{
                orAns.append('0');
            }
            
        }return orAns.toString();
    }
    public static String xorOps(String s1,String s2){
        StringBuilder xorAns = new StringBuilder();
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i) != s2.charAt(i)){
                xorAns.append("1");

            }else{
                xorAns.append('0');
            }
            
        }return xorAns.toString();
    }

}