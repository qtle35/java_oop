package codedevl;

import java.util.Scanner;

public class j02012 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int buoc = 0;
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++)
			a[i] = sc.nextInt();
		System.out.print("Buoc " + buoc + ": ");
		System.out.print(a[0] + " ");
        System.out.println();
		buoc++;
		for (int i = 1; i < n; ++i) {
            int key = a[i];
            int j = i - 1;
            while (j >= 0 && a[j] > key) {
                a[j + 1] = a[j];
                j = j - 1;
            }
            a[j + 1] = key;
            System.out.print("Buoc " + buoc + ": ");
	        for (int l = 0; l < buoc+1; l++)
				System.out.print(a[l] + " ");
	        System.out.println();
			buoc++;
        }
        
        }
	}
