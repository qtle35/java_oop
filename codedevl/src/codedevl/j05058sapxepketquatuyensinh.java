package codedevl;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class j05058sapxepketquatuyensinh {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<ThiSinh> l = new ArrayList<ThiSinh>();
		int t = sc.nextInt();
		for(int i=0;i<t;i++) {
			sc.nextLine();
			l.add(new ThiSinh(sc.nextLine(), sc.nextLine(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble()));
		}
		l.sort(Comparator.comparing(ThiSinh::getDiem).reversed());
		for(ThiSinh x: l) System.out.println(x);
	}
}
