package codedevl;

import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class j07003tachdoivatinhtong {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("DATA.in"));
		String s=sc.nextLine();
		while(s.length()!=1) {
			
			BigInteger a= new BigInteger(s.substring(0,s.length()/2));
			BigInteger b= new BigInteger(s.substring(s.length()/2));
			BigInteger c= a.add(b);
			s=c.toString();
			System.out.println(s);
		}
	}
}
