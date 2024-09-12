public class MaxElementinArray {
    public static void main(String[] args) {
        int[] arr = {4,3,5,7,43,3,5,6,7};
        System.out.println(MaxArray(arr));
        
    }
    static int MaxArray(int[] arr){
        int max = arr[0];
        for(int element:arr){
            if(element>max){
                max = element;
            }

        }
        return max;
    }
    
}
