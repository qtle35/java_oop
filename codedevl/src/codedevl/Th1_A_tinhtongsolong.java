package codedevl;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Th1_A_tinhtongsolong {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("DATA.in"));
		long res = 0;
		while(sc.hasNext()) {
			try {
				long a = Long.parseLong(sc.next());
				if(a>Integer.MAX_VALUE && a<Long.MAX_VALUE) res+=a;
			}
			catch (Exception e) {
				continue;
			}
		}
		System.out.println(res);
	}
}
