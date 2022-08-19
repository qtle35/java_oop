package codedevl;

import java.util.Scanner;

public class j02034bosungdayso {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt(),max=0;
		int[] a=new int[2000];
		for(int i=0;i<n;i++) {
			int m=sc.nextInt();
			a[m]=1;
			max=m;
		}
		if(max==n) System.out.println("Excellent!");
		else {
			for(int i=1;i<=max;i++) {
				if(a[i]!=1) System.out.println(i);
			}
		}
		
	}
}
