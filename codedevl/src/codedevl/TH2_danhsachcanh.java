package codedevl;

import java.util.ArrayList;
import java.util.Scanner;

public class TH2_danhsachcanh {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<Pair<Integer, Integer>> res = new ArrayList<Pair<Integer, Integer>>();
		int[][] a = new int[n][n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				a[i][j] = sc.nextInt();
				if(a[i][j]==1 && j>i) {
					Pair<Integer, Integer> p = new Pair<>(i+1,j+1);
					res.add(p);
				}
			}
		}
		for(Pair x:res) System.out.println(x);
	}
}
