package codedevl;

import java.util.Scanner;

public class j01011 {
	public static long ucln(long a, long b) {
		if(b==0) return a;
		return ucln(b,a%b);
		
	}
	public static void main(String[] args) {
		int t;
		Scanner sc=new Scanner(System.in);
		t=sc.nextInt();
		while(t-->0) {
			long a=sc.nextLong(),b=sc.nextLong();
			System.out.println(a*b/ucln(a,b)+" "+ucln(a,b));
		}
	}
}
