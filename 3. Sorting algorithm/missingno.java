import java.util.Arrays;

public class missingno {
    public static void main(String[] args) {
        int[] arr = {0,1,4,3};
        cyclicsort(arr);
        System.out.println(Arrays.toString(arr));
        missing(arr);

        
    }

    public static void cyclicsort(int[] arr){
        for (int i = 0; i < arr.length; i++) {

            while( arr[i] != i && arr[i] > arr.length){
                
                int temp = arr[i];
                arr[i] =arr[temp];
                arr[temp] =temp;
            }
            
        }
    }

    public static void missing(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            if (i != arr[i] ) {
                System.out.println(arr[i]);
                
            }
            
        }

    }
    
}
