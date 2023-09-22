/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		while(n-->0){
		    long x =sc.nextLong();
		    long y=sc.nextLong();
		    long l= (x*x*x*x)+4*(y*y);
		    long r= (4*(x*x)*y);
		    if(l==r){
		        System.out.println("YES");
		    }else{
		        System.out.println("NO");
		    }
		}
	}
}
