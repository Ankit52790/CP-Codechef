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
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		while(T-->0) {		
			int x = sc.nextInt();
			int y = sc.nextInt();
			int z = sc.nextInt();
		int	X=5*x;
		int	Y=10*y;
			
			int totCost =X+Y;
			int max = totCost/z;
			System.out.println(max);
		} // while
	}
}
