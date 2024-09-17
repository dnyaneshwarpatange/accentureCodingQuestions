public class reverInt {
    public static void main(String[] args) {
        int x = -4545;
        System.out.println(newreverseInt(x));
    }
    public static int newreverseInt(int x){
        boolean isNegative  = x<0;
        String newString = String.valueOf(x);
        String newString2 = isNegative? newString.replace("-",""):newString;
        String reversedString = new StringBuilder(newString2).reverse().toString();
        try {
            int rint = Integer.parseInt(reversedString);
            return isNegative? - rint :rint;
            
        } catch (Exception e) {
            // TODO: handle exception
            return 0;
        }
        
    }
    
}
