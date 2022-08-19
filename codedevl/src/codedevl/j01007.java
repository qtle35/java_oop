package codedevl;

import java.util.Scanner;

public class j01007 {
	public static long[] f = new long[95];

	public static void fibo() {
		f[0] = 0;
		f[1] = 1;
		for (int i = 2; i <= 92; i++) {
			f[i] = f[i - 1] + f[i - 2];
		}
	}

	public static boolean check(long n) {
		for (int i = 0; i <= 92; i++) {
			if (n == f[i])
				return true;
			if (n < f[i])
				return false;
		}
		return false;
	}

	public static void main(String[] args) {
		fibo();
		int t;
		Scanner sc = new Scanner(System.in);
		t = sc.nextInt();
		while (t-- > 0) {
			long a=sc.nextLong();
			if (check(a))
				System.out.println("YES");
			else
				System.out.println("NO");
		}
	}
}
