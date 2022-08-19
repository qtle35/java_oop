package codedevl;

import java.util.Scanner;

public class j02011 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int buoc = 1;
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++)
			a[i] = sc.nextInt();
		for (int i = 0; i < n - 1; i++) {
            int min_idx = i;
            for (int j = i + 1; j < n; j++)
                if (a[j] < a[min_idx])
                    min_idx = j;
            int temp = a[min_idx];
            a[min_idx] = a[i];
            a[i] = temp;
            System.out.print("Buoc " + buoc + ": ");
            for (int j = 0; j < n; j++)
				System.out.print(a[j] + " ");
            System.out.println();
			buoc++;
        }
	}
}
