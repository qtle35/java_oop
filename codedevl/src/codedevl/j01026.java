package codedevl;

import java.util.Scanner;

public class j01026 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			long n= sc.nextLong();
			for(long i=1;i<=1000000;i++) {
				if(i*i==n) {
					System.out.println("YES");
					break;
				}
				if(i*i>n) {
					System.out.println("NO");
					break;
				}
			}
		}
	}
}
