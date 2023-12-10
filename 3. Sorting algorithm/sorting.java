import java.util.Arrays;

public class sorting {
    public static void main(String[] args) {
        //Sample array
        int[] arr = { 3, 7, 1, 9, 2 };
        bubblesort(arr);
        System.out.println(Arrays.toString(arr));

    }
    //Bubble sort function
    public static void bubblesort(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {

                if(arr[j]>arr[j+1]){
                    swap(arr, j, j+1);
                }

            }

        }

    }
    // Swap function
    public static void swap(int[] arr ,int a,int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] =temp;

    }

}
