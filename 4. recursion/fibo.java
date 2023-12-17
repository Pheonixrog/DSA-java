public class fibo {
    public static void main(String[] args) {
        int n =25;
        System.out.println(fibonacci(n));
        
    }

    public static int fibonacci(int n) {
        if(n==1){
            return 1;
        }
        if(n==0){
            return 0;
        }

        return fibonacci(n-1) + fibonacci(n-2);
        

    }
}
