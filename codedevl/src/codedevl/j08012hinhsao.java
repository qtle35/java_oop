package codedevl;

import java.util.Scanner;

public class j08012hinhsao {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int t=n;
		int[] a=new int[100000];
		while (t-->1){
			int x=sc.nextInt(),y=sc.nextInt();
			a[x]+=1;
			a[y]+=1;
		}
		int k=0;
		for(int i=1;i<n;i++) {
			if (a[i]==n-1) {
				k=1;
				System.out.println("Yes");
				break;
			}
		}
		if(k==0) System.out.println("No");
	}
}
