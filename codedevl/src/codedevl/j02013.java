package codedevl;

import java.util.Scanner;

public class j02013 {
	static void bubleSort(int[] a, int n) {
        for (int k = 0; k < n; k++) {
            int d = 0;
            for (int i = 0; i < n - 1; i++) {
                if (a[i] > a[i + 1]) {
                    d++;
                    a[i] = a[i] + a[i + 1];
                    a[i + 1] = a[i] - a[i + 1];
                    a[i] = a[i] - a[i + 1];
                }
            }
            if (d > 0) {
                System.out.print("Buoc "+(k+1)+": ");
                for (int i = 0; i < n; i++) 
                    System.out.print(a[i]+" ");
                System.out.println();
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();
        bubleSort(a, n);
    }
}
