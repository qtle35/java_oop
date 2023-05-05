package codedevl;

import java.util.Scanner;

public class j03040 {
	public static boolean check(String s) {
		int a = 0, b = 0;
		if (s.charAt(0) == '6' || s.charAt(0) == '8')
			b++;
		for (int i = 1; i < 5; i++) {
			int x = s.charAt(i) - '0';
			int y = s.charAt(i - 1) - '0';
			if (y < x)
				a++;
			if (x == 6 || x == 8)
				b++;
		}
		if (a == 4)
			return true;
		if (b == 5)
			return true;
		if (s.charAt(0) == s.charAt(1) && s.charAt(1) == s.charAt(2) && s.charAt(3) == s.charAt(4))
			return true;
		return false;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			String s = sc.next();
			String m = "";
			for (int i = 5; i < s.length(); i++) {
				if (i != 8)
					m += s.charAt(i);
			}
			if (check(m))
				System.out.println("YES");
			else
				System.out.println("NO");
		}
	}
}
