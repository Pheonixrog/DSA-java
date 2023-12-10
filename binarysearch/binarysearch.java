import java.util.Scanner;

public class binarysearch {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("enter the number of elments");
            int b = sc.nextInt();
            int[] a = new int[b];

            for (int i = 0; i < b; i++) {
                a[i] = sc.nextInt();

            }

            System.out.println("enter the target");
            int target = sc.nextInt();

            int start = 0;
            int end = b - 1;

            if (a[start] < a[end]) {

                while (start <= end) {
                    int mid = start + (end - start) / 2;

                    if (a[mid] == target) {
                        System.out.println("solution is  " + mid);
                        break;
                    } else if (a[mid] < target) {
                        start = mid + 1;
                        System.out.println("start chnaged");
                    } else {
                        end = mid - 1;
                        System.out.println("end changed");

                    }

                }

            } else {

                while (start <= end) {
                    int mid = start + (end - start) / 2;

                    if (a[mid] == target) {
                        System.out.println("solution is  " + mid);
                        break;
                    } else if (a[mid] < target) {
                        end = mid - 1;
                        System.out.println("end chnaged");
                    } else {
                        start = mid + 1;
                        System.out.println("start changed");

                    }

                }

            }
        }

    }

}
