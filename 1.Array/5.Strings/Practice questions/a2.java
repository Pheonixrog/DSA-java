import java.util.*;


class a2
{
    public static void main(String[] args) 
    {
        try (// your code goes here
        Scanner sc = new Scanner(System.in)) {
            int t = sc.nextInt();


            for (int i = 0; i < t; i++) {
                
                 int n = sc.nextInt();
                String a = sc.next();
               
                int count = 0;


                for (int j=0; j < n-1; j++) {


                    if (a.charAt(j) == a.charAt(j + 1)) {
                        count++;
                    }

                }


                System.out.println(count);
            }
        }




    }
}
