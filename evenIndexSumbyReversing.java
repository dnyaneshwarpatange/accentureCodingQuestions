public class evenIndexSumbyReversing {
    public static void main(String[] args) {
        int[] arr = {44,10,22,32,11,5};
        System.out.println(indexSum(arr));
        
    }
    public static int indexSum(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start<end){
            int temp  =arr[start];
            arr[start]=arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            if(i==0 || i%2==0){
                sum+=arr[i];
            }
        }return sum;
        

    }
    
}
