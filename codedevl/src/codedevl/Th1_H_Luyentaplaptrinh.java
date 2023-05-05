package codedevl;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Th1_H_Luyentaplaptrinh {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("LUYENTAP.in"));
		int t = sc.nextInt();
		ArrayList<SinhVien> l = new ArrayList<SinhVien>();
		while(t-->0) {
			sc.nextLine();
			SinhVien a = new SinhVien(sc.nextLine(),sc.nextInt(),sc.nextInt());
			l.add(a);
		}
		l.sort(Comparator.comparing(SinhVien::getDung).reversed()
				.thenComparing(SinhVien::getSubmit)
				.thenComparing(SinhVien::getTen));
		for(SinhVien x:l) System.out.println(x);
	}
}
