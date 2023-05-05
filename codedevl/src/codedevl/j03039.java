package codedevl;

import java.math.BigInteger;
import java.util.*;

public class j03039 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			BigInteger a= sc.nextBigInteger();
			BigInteger b= sc.nextBigInteger();
			BigInteger c= a.mod(b);
			BigInteger d= b.mod(a);
			if(c.equals(BigInteger.ZERO)||d.equals(BigInteger.ZERO)) System.out.println("YES");
			else System.out.println("NO");
		}
		
		
	}
}
