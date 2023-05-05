package codedevl;

import java.math.BigInteger;
import java.util.Scanner;

public class j03016 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			BigInteger a=sc.nextBigInteger();
			BigInteger b=a.mod(BigInteger.TEN.add(BigInteger.ONE));
			if(b.equals(BigInteger.ZERO)) System.out.println(1);
			else System.out.println(0);
		}
	}
}
