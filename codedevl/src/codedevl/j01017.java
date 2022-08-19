package codedevl;

import java.util.Scanner;

public class j01017 {
	public static boolean check(long n) {
		long a,b;
		a=n%10;n/=10;
		while(n>0) {
			b=n%10;
			if(Math.abs(a-b)!=1) return false;
			a=b;
			n/=10;
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			long n=sc.nextLong();
			if(check(n)) System.out.println("YES");
			else System.out.println("NO");
		}
	}
}
