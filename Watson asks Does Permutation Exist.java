/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		while(t > 0){
		    int n = scan.nextInt();
		    long nums[] = new long[n];
		    for(int i=0; i<n; i++){
		        nums[i] = scan.nextLong();
		    }
		    Arrays.sort(nums);
		    boolean flag = false;
		    for(int i=1; i<n; i++){
		        if(nums[i] - nums[i-1] <= 1) continue;
		        else{
		            flag = true;
		            break;
		        }
		    }
		    if(flag) System.out.println("NO");
		    else System.out.println("YES");
		    t--;
		}
	}
}
