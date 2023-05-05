package codedevl;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Th1_C_Sapxepmatran {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("MATRIX.in"));
		int t = sc.nextInt();
		while(t-->0) {
			int n = sc.nextInt(), m = sc.nextInt(), k = sc.nextInt();
			int[][] a = new int[n][m];
			for(int i=0;i<n;i++) {
				for(int j=0;j<m;j++) a[i][j]=sc.nextInt();
			}
			for(int i=0;i<n;i++) {
				for(int j=i+1;j<n;j++) {
					if(a[i][k-1]>a[j][k-1]) {
						int h = a[i][k-1];
						a[i][k-1] = a[j][k-1];
						a[j][k-1] = h;
					}
				}
				
			}
			for(int i=0;i<n;i++) {
				for(int j=0;j<m;j++) System.out.print(a[i][j]+" ");
				System.out.println();
			}
		}
	}
}
