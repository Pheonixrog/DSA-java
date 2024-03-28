// https://www.codechef.com/practice/course/strings/STRINGS/problems/ADDONE?tab=statement//
import java.util.Scanner;

public class a3 {
     public static void main(String[] args) throws java.lang.Exception
    {
        try (// your code goes here
        Scanner sc = new Scanner(System.in)) {
            int x = sc.nextInt();
            sc.nextLine();



            for (int i = 0; i < x ; i++ ) {
                
                
                StringBuilder sb = new StringBuilder(sc.nextLine());
                
                int last = sb.length()-1;
                char lastchar = sb.charAt(last);
                
                if(lastchar != '9'){
                    sb.setCharAt(last , (char)(lastchar + 1));
                }
                else{
                     int carry = 1;
                    for (int z = 0; z <= last; z++) {
                        int digit = sb.charAt(last - z) - '0' + carry;
                        sb.setCharAt(last - z, (char)(digit % 10 + '0'));
                        carry = digit / 10;
                    }
                    if (carry > 0) {
                        sb.insert(0, (char)(carry + '0'));
                    }
                    
                }
                
                
                
                
              
                System.out.println(sb);
            }
        }



    }
}


