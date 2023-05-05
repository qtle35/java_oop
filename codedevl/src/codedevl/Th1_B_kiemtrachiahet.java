package codedevl;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigInteger;
import java.util.Scanner;

public class Th1_B_kiemtrachiahet {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("SONGUYEN.IN"));
		int t = sc.nextInt();
		while(t-->0) {
			BigInteger a = new BigInteger(sc.next());
			BigInteger bay = new BigInteger("7");
			BigInteger mba = new BigInteger("13");
			if(a.mod(bay).equals(BigInteger.ZERO) && a.mod(mba).equals(BigInteger.ZERO)) {
				System.out.println("Both");
			}
			else if(a.mod(bay).equals(BigInteger.ZERO)) System.out.println("Div 7");
			else if(a.mod(mba).equals(BigInteger.ZERO)) System.out.println("Div 13");
			else System.out.println("None");
		}
	}
}
