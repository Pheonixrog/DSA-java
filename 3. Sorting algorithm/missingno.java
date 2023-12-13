import java.util.Arrays;

public class missingno {
    public static void main(String[] args) {
        int[] arr = {0,1,4,3};
        cyclicsort(arr);
        System.out.println(Arrays.toString(arr));

        
    }

    public static void cyclicsort(int[] arr){
        for (int i = 0; i < arr.length; i++) {

            while( arr[i] != i && i > arr.length){
                
                int temp = arr[i];
                arr[i] =arr[temp];
                arr[temp] =temp;
            }
            
        }
    }
    
}
