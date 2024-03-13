import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner Sc=new Scanner(System.in);
		int T=Sc.nextInt();
		for(int i=0;i<T;i++)
		{
		    int N=Sc.nextInt();
		    String S=Sc.next();
		    for(int j=0;j<N-1;j=j+2)
		    {
		        if(S.charAt(j)=='0' && S.charAt(j+1)=='0')
		        System.out.print("A");
		        else if(S.charAt(j)=='0' && S.charAt(j+1)=='1')
		        System.out.print("T");
		        else if(S.charAt(j)=='1' && S.charAt(j+1)=='0')
		        System.out.print("C");
		        else if(S.charAt(j)=='1' && S.charAt(j+1)=='1')
		        System.out.print("G");
		    }
		    System.out.println();
		}
	}
}