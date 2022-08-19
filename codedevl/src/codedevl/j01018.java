package codedevl;

import java.util.Scanner;

public class j01018 {
	public static boolean check(long n) {
		long a,b,sum=0;
		a=n%10;n/=10;
		sum+=a;
		while(n>0) {
			b=n%10;
			if(Math.abs(a-b)!=2) return false;
			a=b;
			n/=10;
			sum+=a;
		}
		if(sum%10!=0) return false;
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
