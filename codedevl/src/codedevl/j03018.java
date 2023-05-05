package codedevl;

import java.util.Scanner;

public class j03018 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			String s=sc.next();
			if(s.equals("4")||s.equals("8")) System.out.println(4);
			else {
				int sum=0;
				sum=sum*10+(s.charAt(s.length()-2)-'0');
				sum=sum*10+(s.charAt(s.length()-1)-'0');
				if(sum%4==0) System.out.println(4);
				else System.out.println(0);
			}
		}
		
	}
}
