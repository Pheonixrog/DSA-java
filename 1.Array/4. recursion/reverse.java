public class reverse {
    public static void main(String[] args) {
        int n = 151;
        System.out.println(Reverse(n));
        System.out.println(palindrome(Reverse(n), n));

    }

    public static int sum = 0;

    public static int Reverse(int n) {
        if (n == 0) {
            return sum;
        }

        int rem = n % 10;
        sum = sum * 10 + rem;
        n = n / 10;

        return Reverse(n);

    }

    public static boolean palindrome(int a, int b) {
        if (a == b) {
            return true;
        }
        return false;

    }
}
