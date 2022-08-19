package codedevl;

import java.util.Scanner;

public class j02008boichungnn {
	public static long gcd(long a, long b) {
		if(b==0) return a;
		return gcd(b,a%b);
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			long n=sc.nextLong();
			long res=1;
			for(int i=2;i<=n;i++) {
				res=(i*res)/gcd(i,res);
			}
			System.out.println(res);
		}
	}
}
