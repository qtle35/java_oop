package codedevl;

import java.util.Scanner;

public class j02106 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
			int n=sc.nextInt(),res=0;
			int[][] a=new int[1005][1005];
			for(int i=0;i<n;i++) {
				int dem=0;
				for(int j=0;j<3;j++) {
					a[i][j]=sc.nextInt();
					if(a[i][j]==1) dem++;
				}
				if(dem>=2) res++;
			}
			System.out.println(res);
		}
}
