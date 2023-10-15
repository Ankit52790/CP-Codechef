/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
			Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
		    int n=sc.nextInt();
		    long m=sc.nextLong();
		    long[] p=new long[n];
		    for(int i=0;i<n;i++)
		    {
		        p[i]=sc.nextLong();
		    }
		    Arrays.sort(p);
		        long s=0;
		        int flag=1;
		        for(int j=n-1;j>=0;j--)
		        {
		            s+=p[j];
		            if(s>=m)
		            {
		                flag=0;
		                 System.out.println(n-j);
		                 break;
		            }
		        }
		        if(flag==1) System.out.println(-1);
	}
}
}
