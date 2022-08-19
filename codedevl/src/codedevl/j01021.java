package codedevl;

import java.util.Scanner;

public class j01021 {
	static long m=(long) (1e9+7);
	public static long powmod(long a, long b) {
		if(b==0) return 1;
		long x=(long) powmod(a, b/2);
		if(b%2==0) return (x*x)%m;
		return a*(x*x%m)%m;
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		while(true) {
			long a=sc.nextLong(),b=sc.nextLong();
			if(a==0&&b==0) break;
			System.out.println(powmod(a,b));
		}
	}
}
