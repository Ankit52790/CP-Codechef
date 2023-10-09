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
		int n = sc.nextInt();
		int d = sc.nextInt();
		List<Integer> list=new ArrayList<>();
		for(int i=0;i<n;i++){
		    list.add(sc.nextInt());
		}
		Collections.sort(list);
		int count=0;
		for(int i =1 ; i < n ; i++){
		    if(Math.abs(list.get(i)-list.get(i-1))<=d){
		        count++;
		        i++;
		    }
		}
		System.out.println(count);
	}
}
