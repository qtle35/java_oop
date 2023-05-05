package codedevl;

import java.util.Scanner;

public class j03025 {
	public static boolean check(String s) {
		int dem=0;
		for(int i=0;i<s.length()/2;i++) {
			if(s.charAt(i)!=s.charAt(s.length()-i-1)) dem++;
		}
		if(s.length()%2!=0&&dem==0) return true;
		return (dem==1);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t=sc.nextInt();
		while (t-->0){
			String s=sc.next();
			if(check(s)) System.out.println("YES");
			else System.out.println("NO");
		}
	}
}
