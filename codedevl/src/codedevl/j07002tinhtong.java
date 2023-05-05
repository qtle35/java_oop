package codedevl;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class j07002tinhtong {
	public static boolean check(String s) {
		if (s.length() > 9)
			return false;
		for (int i = 0; i < s.length(); i++) {
			if (!Character.isDigit(s.charAt(i))) {
				return false;
			}
		}

		return true;
	}

	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("DATA.in"));
		ArrayList<String> data = new ArrayList<String>();
		long sum = 0;
		while (sc.hasNext()) {
			String s = sc.next();
			if (check(s))
				sum += Integer.valueOf(s);
		}
		System.out.println(sum);
	}
}
