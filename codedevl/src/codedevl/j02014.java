package codedevl;

import java.util.Scanner;

public class j02014 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			int n=sc.nextInt(),sum=0;
			int[] a=new int[n];
			for(int i=0;i<n;i++) {
				a[i]=sc.nextInt();
				sum+=a[i];
			}
			int index=-1,lsum=a[0];
			for(int i=1;i<n;i++) {
				if(sum-lsum-a[i]==lsum) {
					index=i+1;
					break;
				}
				lsum+=a[i];
			}
			System.out.println(index);
		}
	}
}
