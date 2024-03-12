import java.util.*;

public class missingno {
    public static void main(String[] args) {
        int[] arr = {0,1,4,6,5,8};
        cyclicsort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(missing(arr));

        
    }

    public static void cyclicsort(int[] arr){
        for (int i = 0; i < arr.length; i++) {

            while( arr[i] != i && arr[i] < arr.length){
                
                int temp = arr[i];
                arr[i] =arr[temp];
                arr[temp] =temp;
            }
            
        }
    }

    public static List<Integer> missing(int[] arr){
        List<Integer> ls = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (i != arr[i] ) {
                ls.add(i);
                
            }
            
        }
        return ls;

    }
    
}
