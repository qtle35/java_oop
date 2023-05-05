package codedevl;

import java.util.Scanner;

public class j03004 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t=sc.nextInt();
		sc.nextLine();
		while(t-->0) {
			String s=sc.nextLine();
			String[] s1=s.split("\\s+");
			for(String a : s1) System.out.println(a);
			for(String a : s1) {
				if(a.length()>=1) {
					a=a.toLowerCase();
					String tmp=a.substring(0,1);
					tmp=tmp.toUpperCase();
					a=a.replaceFirst(tmp.toLowerCase(), tmp);
					System.out.print(a+" ");
				}
			}
			System.out.println();
		}
	}
}
