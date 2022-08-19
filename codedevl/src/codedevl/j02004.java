package codedevl;

import java.util.Scanner;

public class j02004 {
	public static boolean check(int[] a, int n) {
		for(int i=0;i<n/2;i++) {
			if(a[i]!=a[n-1-i]) return false;
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			int n=sc.nextInt();
			int[] a=new int[100];
			for(int i=0;i<n;i++) a[i]=sc.nextInt();
			if(check(a,n)) System.out.println("YES");
			else System.out.println("NO");
		}
	}
}
