public class ReverseString {
    public static void main(String[] args) {
        System.err.println(reversingString("Hello"));
        
    }
    public static String reversingString(String input){
        return new StringBuilder(input).reverse().toString();

    }

    
}
