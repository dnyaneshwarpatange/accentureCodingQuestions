public class FindPEakElementWhichisNotSmallerThanItsNeighbour{
    public static void main(String[] args){
        int[] myArr = {4,5,3,4,6,2,9,6,1};
        int n = myArr.length;
        
        System.out.println("Peak Element is:"+ findPeak(myArr,n)); 
        

        
        
    }

    static int findPeak(int[] myArr,int n ){
        for(int i=1;i<n-1;i++){
            if(myArr[i]>myArr[i-1]&&myArr[i]>myArr[i+1]){
                return myArr[i];
                
            }

        }
        return -1;
    }
}