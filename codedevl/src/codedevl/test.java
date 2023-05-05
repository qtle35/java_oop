package codedevl;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class test {
   public static BigInteger factorial(int number) {
       BigInteger factorial = BigInteger.ONE;

       for (int i = number; i > 0; i--) {
           factorial = factorial.multiply(BigInteger.valueOf(i));
       }

       return factorial;
   }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int l=sc.nextInt(),r=sc.nextInt(),k=sc.nextInt();
			BigInteger res=factorial(l);
			BigInteger temp = new BigInteger(String.valueOf(res));
			for(int i=l+1;i<=r;i++) {
				BigInteger j=new BigInteger(i+"");
				temp=temp.multiply(j);
				res = res.multiply(temp);
			}
			res=res.pow(k);
			System.out.println(res.mod(new BigInteger("1000033")));
		}
	}
}
