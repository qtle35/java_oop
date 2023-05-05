package danhsachsinhvien1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class j07059danhsachcathi {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("SV.in"));
		ArrayList<CaThi> l = new ArrayList<CaThi>();
		int t = Integer.parseInt(sc.nextLine());
		for(int i=1;i<=t;i++) {
			l.add(new CaThi(i, sc.nextLine(), sc.nextLine(), sc.nextLine()));
		}
		l.sort(Comparator.comparing(CaThi::getComp)
				.thenComparing(CaThi::getMa));
//		for(CaThi x:l) System.out.println(x);
	}
}
