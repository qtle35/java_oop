package codedevl;

import java.util.HashSet;
import java.util.Scanner;

public class j02037 {
	public static boolean check(String[] s) {
		int chan=0;
		int le=0;
		for(int i=0;i<s.length;i++) {
			int a=Integer.parseInt(s[i]);
			if(a%2==0) chan++;
			else le++;
		}
		if(chan>le&&s.length%2==0) return true;
		else if(chan<le&&s.length%2!=0) return true;
		return false;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		sc.nextLine();
		while (t-- > 0) {
			String s=sc.nextLine();
			String[] s1=s.split(" ");
			if (check(s1)) System.out.println("YES");
			else System.out.println("NO");
		}
	}
}
