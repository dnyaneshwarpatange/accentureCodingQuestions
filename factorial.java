public class factorial {
    public static void main(String[] args) {
        int n = 4;
        System.out.println(findFact(n));
        
    }
    public static int findFact(int n){
        if(n==0 || n==1){
            return 1;
        }else{
            return n * findFact(n-1);

        }
        
    }
}
