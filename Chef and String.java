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
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		while(t-->0){
		    String str=s.next();
		    int n=str.length();
		    int x=0;
		    int y=0;
		    int pair=0;
		    for(int i=0;i<n-1;i++){
		        if((str.charAt(i)=='x' && str.charAt(i+1)=='y')|| str.charAt(i)=='y' && str.charAt(i+1)=='x' ){
		            pair++;
		            i+=1;
		        }
		        
		    }
		    System.out.println(pair);
		}
	}
}
