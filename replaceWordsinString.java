public class replaceWordsinString {
    public static void main(String[] args) {
        
        String s1 = "apples aae";
        String ch1 = "a";
        String ch2 = "p";
        System.out.println(replaceOps(s1, ch1, ch2));

    }
    public static String replaceOps(String s1,String ch1,String ch2){
        String tempString = s1.replace(ch1,"#");
        tempString  = tempString.replace(ch2, ch1);
        String andString = tempString.replace("#", ch2);
        return andString;
       
    }

    
}

