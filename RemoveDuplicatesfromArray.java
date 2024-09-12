import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatesfromArray {
    public static void main(String[] args) {
        int[] arr = {3,6,34,3,2,4,7,7,3,2,9};
        int[] fresult = (removeDuplicate(arr));
        System.out.println(Arrays.toString(fresult));
        
    }
    public static int[] removeDuplicate(int[] arr){
        Set<Integer> set = new LinkedHashSet<>();
        for(int element:arr){
            set.add(element);
        }
        int[] result = new int[set.size()];
        int index = 0;
        for(int num:set){
            result[index++]=num;
        }return result;

    }
    
}
