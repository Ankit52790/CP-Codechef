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
	    while(t-->0){
	        int X=sc.nextInt();
	        int Y=sc.nextInt();
	        if(X<Y){
	            int p=Y-X;
	            System.out.println(p*2+X);
	        }else if(X==Y){
	            System.out.println(X);
	        }else{
	            System.out.println(Y);
	        }
	    }
		// your code goes here
	}
}
