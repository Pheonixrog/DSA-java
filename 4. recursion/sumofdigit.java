public class sumofdigit {
    public static void main(String[] args) {
      int n = 3504; 
      System.out.println(sumofDigit(n)); 
      System.out.println(mulofDigit(n));

    }

    public static int sumofDigit(int n){
        if(n==0){
            return 0;
        }

        int rem = n%10;
        n = n/10;

        return rem + sumofDigit(n);

    }

    public static int mulofDigit(int n){
        if(n==0){
            return 1;
        }

        int rem = n%10;
        n = n/10;

        return rem * mulofDigit(n);

    }
}
