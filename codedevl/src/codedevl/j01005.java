package codedevl;

import java.util.Scanner;

public class j01005 {
	public static void main(String[] args) {
		int t;
		Scanner sc= new Scanner(System.in);
		t=sc.nextInt();
		while(t-- > 0) {
			int n,h;
			n=sc.nextInt();h=sc.nextInt();
			for(int i=1;i<n;i++) System.out.printf("%.6f ",h*Math.sqrt((double)i/n));
			System.out.print("\n");
		}
	}
}
