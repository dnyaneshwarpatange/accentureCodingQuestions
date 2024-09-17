public class additionOfSecondLargestandSecondSmallestofOddandEvenPosition {
    public static void main(String[] args) {
        int[] arr = {3,2,1,7,5,4};
        System.out.println(addition(arr));
        
    }
    public static int addition(int[] arr){
        int evenLargest = 0;
        int evenSecondlargest = 0;
        int oddLargest =0;
        int oddSecondLargest = 0;
        for(int i=0;i<arr.length;i++){
            if(i%2==0){
                if(arr[i]>evenLargest){
                    evenSecondlargest = evenLargest;
                    evenLargest = arr[i];
                }else if(arr[i]>evenSecondlargest){
                    evenSecondlargest = arr[i];
                }
            }else{
                if(arr[i]>oddLargest){
                    oddSecondLargest = oddLargest;
                    oddLargest = arr[i];
                }else if(arr[i]>oddSecondLargest){
                    oddSecondLargest = arr[i];
                }
            }
      
        }return oddSecondLargest+evenSecondlargest;
    }
       
      
}
