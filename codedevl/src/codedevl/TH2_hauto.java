package codedevl;

import java.util.Scanner;
import java.util.Stack;

public class TH2_hauto {
	static boolean isLong(String s) {
		try {
			Long.parseLong(s);
			return true;
			
		}
		catch(NumberFormatException e) {
			return false;
		}
	}
	static long cal(long a, long b, String c) {
		if(c.equals("+")) return a+b;
		if(c.equals("-")) return a-b;
		if(c.equals("*")) return a*b;
		return a/b;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			int n = sc.nextInt();
			long x,y,z=0;
			Stack<Long> stack = new Stack<>();
			while(n-->0) {
				String c = sc.next();
				if(isLong(c)) stack.add(Long.parseLong(c));
				else {
					x = stack.peek();stack.pop();
					y = stack.peek();stack.pop();
					z = cal(y,x,c);
					stack.add(z);
				}
			}
			System.out.println(stack.peek());
		}
	}
}
