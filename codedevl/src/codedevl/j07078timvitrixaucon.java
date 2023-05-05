package codedevl;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class j07078timvitrixaucon {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("STRING.in"));
		int t = Integer.parseInt(sc.nextLine());
		while(t-->0){
			String s1 = sc.nextLine();
			String s2 = sc.nextLine();
			int id=0;
			while(s1.indexOf(s2,id)!=-1 && id<s1.length()) {
				System.out.print((s1.indexOf(s2,id)+1)+" ");
				id = s1.indexOf(s2,id)+1;
			}
			System.out.println();
		}
	}
}
