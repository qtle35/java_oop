package codedevl;

import java.util.Scanner;

public class j01012 {
	public static void main(String[] args) {
		int t;
		Scanner sc=new Scanner(System.in);
		t=sc.nextInt();
		while(t-->0) {
			int n=sc.nextInt(),dem=0;
			for(int i=2;i<Math.sqrt(n);i++) {
				if(n%i==0) {
					if(i%2==0) dem++;
					if(n/i %2==0) dem++;
				}
			}
			if(n%Math.sqrt(n)==0&&Math.sqrt(n)%2==0) dem++;
			if(n%2==0) dem++;
			System.out.println(dem);
		}
	}
}
