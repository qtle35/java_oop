package codedevl;

import java.util.Scanner;

public class j03024 {
	public static boolean check(String s) {
		int chan=0,le=0;
		for(int i=0;i<s.length();i++) {
			int x=s.charAt(i)-'0';
			if(x%2==0) chan++;
			else le++;
		}
		if(s.length()%2==0 &&chan>le) return true;
		else if(s.length()%2!=0&&le>chan) return true;
		return false;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t=sc.nextInt();
		while (t-->0){
			int k=1;
			String s=sc.next();
			for(int i=0;i<s.length();i++) {
				if( Character.isAlphabetic(s.charAt(i)) ) {
					System.out.println("INVALID");
					k=0;
					break;
				}
			}
			if(k==1) {
				if(check(s)) System.out.println("YES");
				else System.out.println("NO");
			}
		}
	}
}
