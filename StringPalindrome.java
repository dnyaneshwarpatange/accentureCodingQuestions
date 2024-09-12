public class StringPalindrome{
    public static void main(String[] args) {
        String inpuString = "hello";
        System.out.println(checkPalindrome(inpuString));
        
    }
    public static int checkPalindrome(String inputString){
        String string1 = new StringBuilder(inputString).reverse().toString();
        String string2 = inputString;
        if (string1 == string2) {
            System.out.println("String Palindrome");
            
        }else{
            System.out.println("Not Palindrome");
        }
        return 0;
    } 
}