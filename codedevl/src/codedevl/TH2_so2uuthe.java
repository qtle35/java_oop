package codedevl;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class TH2_so2uuthe {
	public static boolean check(String s) {
		int hai=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='2') hai++;
			
		}
		return (hai>(s.length()-hai));
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			int n = sc.nextInt();
			Queue<String> q = new LinkedList<>();
			q.add("1");
			q.add("2");
			while(n>0) {
				String x = q.poll();
				if(check(x)) {
					System.out.print(x+" ");
					n--;
				}
				q.add(x+"0");
				q.add(x+"1");
				q.add(x+"2");
			}
			System.out.println();
		}
	}
}
