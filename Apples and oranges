/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc= new Scanner(System.in);
		int t= sc.nextInt();
		while(t!=0)
		{
		    int a=sc.nextInt();
		    int b = sc.nextInt();
		    System.out.println(split(a,b));
		    t--;
		}
	}
	static int split(int x,int y)
	{
	    if(y==0)
	        return x;
	       return split(y,x%y);
	}
}
