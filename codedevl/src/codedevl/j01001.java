package codedevl;

import java.util.Scanner;

public class j01001 {
	public static void main(String[] args) {
		int a,b;
		Scanner sc= new Scanner(System.in);
		a= sc.nextInt();
		b= sc.nextInt();
		if(a<=0||b<=0) {
			System.out.println('0');
		}
		else {
			System.out.print(2*(a+b)+" ");
			System.out.println(a*b);
		}
	}
}
