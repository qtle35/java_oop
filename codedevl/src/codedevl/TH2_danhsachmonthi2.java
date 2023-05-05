package codedevl;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.TreeSet;

public class TH2_danhsachmonthi2 {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("MONHOC.in"));
		TreeSet<MonHoc> l = new TreeSet<>();
		while(sc.hasNextLine()) {
			l.add(new MonHoc(sc.nextLine(), sc.nextLine(), sc.nextLine()));
		}
		for(MonHoc x : l) System.out.println(x);
	}
}
