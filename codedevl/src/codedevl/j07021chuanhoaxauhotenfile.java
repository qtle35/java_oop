package codedevl;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class j07021chuanhoaxauhotenfile {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("DATA.in"));
		while(sc.hasNextLine()) {
			String k=sc.nextLine();
			if(k.equals("END")) break;
			String[] s=k.trim().split("\\s+");
			for(int i=0;i<s.length;i++) {
				StringBuilder s1=new StringBuilder(s[i].toLowerCase());
				s1.setCharAt(0, Character.toUpperCase(s1.charAt(0)));
				System.out.print(s1+" ");
			}
			System.out.println();
		}
	}
}
