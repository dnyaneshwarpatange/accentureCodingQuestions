public class diffOfdivisibleByEvenAndOdd {
    public static void main(String[] args) {
        int n=4;
        int m=20;
        System.out.println(findSoln(m, n));
        
    }
    public static int findSoln(int m,int n){
        int divbyN = 0;
        int notdivbyN=0;
        for (int i = 0; i <= m; i++) {
            // System.out.println(i);
            if(i%n==0){
                divbyN+=i;
            }else{
                notdivbyN+=i;
            }
            
        }return notdivbyN-divbyN;
    }
    
}
