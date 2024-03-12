import java.util.*;

public class duplicate {

    public static void main(String[] args) {
        int[] arr = {0, 1, 4,4, 6, 5, 1};
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(findDuplicates(arr));
    }

    public static void cyclicSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            while (arr[i] != i && arr[i] < arr.length) {
                int temp = arr[i];
                arr[i] = arr[temp];
                arr[temp] = temp;
            }
        }
    }

    public static List<Integer> findDuplicates(int[] arr) {
        List<Integer> duplicates = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (i != arr[i] && arr[i] == arr[arr[i]]) {
                duplicates.add(arr[i]);
            }
        }
        return duplicates;
    }
}
