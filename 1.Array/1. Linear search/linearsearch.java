import java.util.*;

public class linearsearch {
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

            for (int i = 0; i < b; i++) {
                if (a[i] == target) {
                    System.out.println("elemnet found at " + a[i]);
                }

            }
        }

    }

}
