package codedevl;

import java.math.BigInteger;
import java.util.Scanner;

public class j03033 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			BigInteger a=sc.nextBigInteger();
			BigInteger b=sc.nextBigInteger();
			BigInteger c=(a.multiply(b)).divide(a.gcd(b));
			System.out.println(c);
		}
			
	}
}
