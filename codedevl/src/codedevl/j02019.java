package codedevl;

import java.util.Scanner;

public class j02019 {
	static int[] a = new int[1000005];

	public static void us() {
		for (int i = 2; i <= 1000000; i++) {
			for (int j = i * 2; j <= 1000000; j += i) {
				a[j] += i;
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		us();
		int l = sc.nextInt();
		int r = sc.nextInt();
		int dem = 0;
		for (int i = l; i <= r; i++) {
			if (a[i] > i)
				dem++;
		}
		System.out.println(dem);
	}
}
