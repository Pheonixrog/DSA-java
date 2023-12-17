import java.util.*;

public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int a = sc.nextInt();
      
        System.out.println(fact(a));
        System.out.println(summation(a));
        

    }

    public static int fact(int a){
        if(a==0){
            return 1;
        }

        return a * fact(a-1);

    }
    
    public static int summation(int a){
        if(a==0){
            return 0;
        }

        return a + summation(a-1);

    }
}
