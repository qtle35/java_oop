package codedevl;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class j07027quanlibaitapnhom {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("SINHVIEN.in"));
		ArrayList<SinhVien> lsv = new ArrayList<>();
		int t = Integer.parseInt(sc.nextLine()) ;
		for(int i=1;i<=t;i++) {
			lsv.add(new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine()));
		}
		ArrayList<BaiTap> lbt = new ArrayList<>();
		sc = new Scanner(new File("BAITAP.in"));
		t = Integer.parseInt(sc.nextLine()) ;
		for(int i=1;i<=t;i++) {
			lbt.add(new BaiTap(i, sc.nextLine()));
		}
		ArrayList<Nhom> ln = new ArrayList<>();
		sc = new Scanner(new File("NHOM.in"));
		while(sc.hasNext()) {
			Nhom a = new Nhom(sc.next(), sc.nextInt());
			ln.add(a);
			for(SinhVien x:lsv) {
				for(BaiTap y:lbt) {
					if(x.getMsv().equals(a.getMasv()) && y.getMabt()==a.getStt()) {
						a.setBaiTap(y);
						a.setSinhVien(x);
					}
				}
			}
		}
		ln.sort(Comparator.comparing(Nhom::getMasv));
		for(Nhom x:ln) System.out.println(x);
	}
}
