package codedevl;

import java.util.Scanner;

public class j02007 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int l=1;l<=t;l++) {
			int n=sc.nextInt();
			int[] b=new int[n];
			int[] a=new int[n];
			for(int i=0;i<n;i++) {
				a[i]=sc.nextInt();
				b[i]=0;
			}
			System.out.println("Test "+l+":");
			for(int i=0;i<n;i++) {
				int dem=1;
				if(b[i]==0) {
					b[i]=1;
					for(int j=i+1;j<n;j++) {
						if(a[i]==a[j]) {
							b[j]=1;
							dem++;
						}
					}
					System.out.println(a[i]+" xuat hien "+dem+" lan");
				}
			}
		}
	}
}
