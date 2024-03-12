public class ceilingandfloor {

    public static void main(String[] args) {
        int[] a = { 1, 8, 15, 86, 99, 120 };
        int b = a.length;
        int target = 100;
        System.out.println(ceiling(a, b, target));
        System.out.println(floor(a, b, target));

    }

    public static int ceiling(int[] a, int b, int target) {
        int start = 0;
        int end = b - 1;

        if (a[start] < a[end]) {

            while (start <= end) {
                int mid = start + (end - start) / 2;

                if (a[mid] == target) {

                    break;
                } else if (a[mid] < target) {
                    start = mid + 1;

                } else {
                    end = mid - 1;

                }

            }
            if (start < b) {
                System.out.println("Solution is " + start);
                return start;
            }

        }

        return 0;
    }

    public static int floor(int[] a, int b, int target) {
        int start = 0;
        int end = b - 1;

        if (a[start] < a[end]) {

            while (start <= end) {
                int mid = start + (end - start) / 2;

                if (a[mid] == target) {

                    break;
                } else if (a[mid] < target) {
                    start = mid + 1;

                } else {
                    end = mid - 1;

                }

            }

            return end;

        }

        return 0;
    }

}
