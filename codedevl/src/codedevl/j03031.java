package codedevl;

import java.util.HashSet;
import java.util.Scanner;

public class j03031 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			String s = sc.next();
			int k = sc.nextInt();
			HashSet<String> hset = new HashSet<String>();
			for (int i = 0; i < s.length(); i++) {
				hset.add(String.valueOf(s.charAt(i)));
			}
			if (26 - hset.size() <= k && s.length() >= 26)
				System.out.println("YES");
			else
				System.out.println("NO");
		}
	}
}
