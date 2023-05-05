package codedevl;

import java.util.Arrays;
import java.util.Scanner;

public class j02022 {
	static int n;
	static int[] a = new int[10000];
	static int[] b = new int[10000];
	public static boolean check() {
		for(int i=2;i<=n;i++) {
			if(Math.abs(a[i]-a[i-1])==1) return false;
		}
		return true;
	}
	public static void in() {
		if(check()) { 
			for (int i = 1; i <= n; i++) System.out.print(a[i]);
			System.out.println();
		}
		
	}

	public static void quaylui(int i) {
		for (int j = 1; j <= n; j++) {
			if(b[j]==0) {
				a[i]=j;
				b[j]=1;
				if (i == n)
					in();
				else
					quaylui(i + 1);
				b[j]=0;
			}
			
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			n = sc.nextInt();
			Arrays.fill(b, 0);
			quaylui(1);
		}
		
	}
}
