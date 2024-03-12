import java.util.Arrays;

public class sorting {
    public static void main(String[] args) {
        // Sample array
        int[] arr = { 3, 7, 1, 9, 2 };
        bubblesort(arr);
        System.out.println(Arrays.toString(arr));
        selectionsort(arr);
        System.out.println(Arrays.toString(arr));

    }

    // Selection sort
    public static void selectionsort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int start = 0;
            int end = arr.length - i - 1;

            int maxIndex = maxElement(arr, start, end);
            swap(arr, maxIndex, end);

        }

    }

    // Finding max element
    public static int maxElement(int[] array, int start, int end) {
        int maxIndex = start;

        for (int i = start; i <= end; i++) {
            if (array[i] > array[maxIndex]) {
                maxIndex = i;

            }

        }
        return maxIndex;
    }

    // Bubble sort function
    public static void bubblesort(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {

                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                }

            }

        }

    }

    // Swap function
    public static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;

    }

}
