/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		
		Scanner sca=new Scanner(System.in);
		int t=sca.nextInt();
		while(t-->0)
		{
		    int N=sca.nextInt();
		    int K=sca.nextInt();
		    int[] w=new int[N];
		    
		    long s1=0;
		    long s2=0;
		    for(int i=0;i<N;i++)
		    {
		        w[i]=sca.nextInt();
		    }
		    Arrays.sort(w);
		    
		    int g=Math.min(K,N-K);
		    for(int i=0;i<g;i++)
		    {
		        
		        s1+=w[i];
		                
		    }      
		    for(int i=g;i<N;i++)
		    {
		        
		        s2+=w[i];
		        
		    }
		    long h=s2-s1;
		    System.out.println(h);
		}
	}
}
