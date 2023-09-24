/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	static class FastReader{
		BufferedReader br; StringTokenizer st;
		public FastReader(){
			br=new BufferedReader(new InputStreamReader(System.in)); }
		String next(){
			while(st==null || !st.hasMoreElements())
				try{ st=new StringTokenizer(br.readLine()); }
				catch(IOException e){ e.printStackTrace(); }
			return st.nextToken(); }
		int nextInt(){ return Integer.parseInt(next()); }
	}
	public static void main(String[] args) {
		FastReader in=new FastReader();
		PrintWriter out=new PrintWriter(System.out);
		int t=in.nextInt();
		while(t-->0) {
			int n=in.nextInt(),
				a[]=new int[n],
				p[]=new int[n],
				s[]=new int[n],
				r=0;
			a[0]=in.nextInt(); p[0]=a[0];
			for(int i=1;i<n;i++) {
				a[i]=in.nextInt();
				p[i]=gcd(p[i-1],a[i]);
			}
			s[n-1]=a[n-1];
			for(int i=n-2;i>=0;i--)
				s[i]=gcd(s[i+1],a[i]);
			if(p[n-2]>1) r++;
			if(s[1]>1) r++;
			for(int i=1;i<n-1;i++)
				if(gcd(p[i-1],s[i+1])>1) r++;
			out.println(r);
		} out.close();
	}
	private static int gcd(int a, int b) {
		return b==0?a:gcd(b,a%b);
	}
}
