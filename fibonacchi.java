public class fibonacchi {
    public static void main(String[] args) {
        int n = 4;
        System.out.println(findFibo(n));
        
    }
    public static int findFibo(int n){
        if(n==0 || n==1){
            return n;
        }else{
            return findFibo(n-1)+findFibo(n-2);
        }
    }
    
}
