package codedevl;

import java.util.Scanner;

public class j03021 {
	static String[] s1=new String[]{"", "", "ABC", "DEF", "GHI",
								"JKL", "MNO", "PQRS", "TUV", "WXYZ"};
	public static String tim(String s) {
		String res="";
		for(int i=0;i<s.length();i++) {
			String tmp=""+s.charAt(i);
			for(int j=2;j<=9;j++) {
				
				if(s1[j].contains(tmp)) {
					res+=String.valueOf(j);
				}
			}
		}
		return res;
	}
	public static boolean check(String s) {
		for(int i=0;i<s.length()/2;i++) {
			int x=s.charAt(i)-'0';
			int y=s.charAt(s.length()-i-1)-'0';
			if(x!=y) return false;
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t=sc.nextInt();
		while (t-->0){
			String s=sc.next();
			s=s.toUpperCase();
			if(check(tim(s))) System.out.println("YES");
			else System.out.println("NO");
		}
	}
}
