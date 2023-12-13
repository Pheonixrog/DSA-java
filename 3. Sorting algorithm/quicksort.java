import java.util.Arrays;

public class quicksort {
    public static void main(String[] args) {
        int[] arr = {1,4,2,3,5,0,6,7};
        cyclicsort(arr);
        System.out.println(Arrays.toString(arr));

        
    }

    public static void cyclicsort(int[] arr){
        for (int i = 0; i < arr.length; i++) {

            while( arr[i] != i){
                
                int temp = arr[i];
                arr[i] =arr[temp];
                arr[temp] =temp;
            }
            
        }
    }
    
}
