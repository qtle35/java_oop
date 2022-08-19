package codedevl;

import java.util.Scanner;

public class J01002 {
	public static void main(String[] args) {
		int t;
		Scanner sc= new Scanner(System.in);
		t=sc.nextInt();
		while(t-- > 0) {
			long a;
			a=sc.nextLong();
			System.out.println((1+a)*a/2);
			
		}
	}
}
