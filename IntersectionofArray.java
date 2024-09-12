import java.util.ArrayList;
import java.util.List;
public class IntersectionofArray {
    public static void main(String[] args) {
        int[] arr1 = {3,4,2,5,4,52,5,41};
        int[] arr2 = {3,5,3,56,5,41,5,12};
        findIntersection(arr1, arr2);
        
    }
    public static void findIntersection(int[] arr1, int[] arr2){
        List<Integer> CommonElement= new ArrayList<>(); 

        for(int element1:arr1){
            for(int element2:arr2){
                if(element1==element2){
                    CommonElement.add(element2);
                }
            }

        }System.out.println(CommonElement);


        
    } 
    
}
//time complexity if O(n^2) its too high.if want to reduce user HashSet with it
