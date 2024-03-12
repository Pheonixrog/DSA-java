public class binarysearch {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
        int target = 6;
        System.out.println(binary(arr, target, 0, arr.length - 1));
    }

    public static int binary(int[] arr, int target, int s, int e) {

        if (s > e) {
            return -1;
        }
        int mid = (e + s) / 2;

        if (arr[mid] == target) {
            return mid;
        }

        if (target > arr[mid]) {
            return binary(arr, target, mid + 1, e);
        }

        if (target > arr[mid]) {
            return binary(arr, target, s, mid + 1);
        }

        return 0;

    }

}
