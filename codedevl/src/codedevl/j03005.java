package codedevl;

import java.util.Scanner;
import java.util.Vector;

public class j03005 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t=sc.nextInt();
		sc.nextLine();
		while(t-->0) {
			Vector<String> res=new Vector<String>();
			String s=sc.nextLine();
			String[] s1=s.split("\\s+");
			for(String a : s1) {
				if(a.length()>=1) {
					a=a.toLowerCase();
					String tmp=a.substring(0,1);
					tmp=tmp.toUpperCase();
					a=a.replaceFirst(tmp.toLowerCase(), tmp);
					res.add(a);
				}
			}
			for(int i=1;i<res.size();i++) {
				System.out.print(res.get(i));
				if(i==res.size()-1) System.out.print(", ");
				else System.out.print(" ");
			}
			System.out.println(res.get(0).toUpperCase());
		}
	}
}
