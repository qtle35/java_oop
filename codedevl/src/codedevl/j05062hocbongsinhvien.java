package codedevl;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class j05062hocbongsinhvien {
	public static String check(SinhVien x) {
		if(x.getGpa()>=3.6 && x.getRl()>=90) return "XUATSAC";
		else if(x.getGpa()>=3.2 && x.getRl()>=80) return "GIOI";
		else if(x.getGpa()>=2.5 && x.getRl()>=70) return "KHA";
		else return "KHONG";
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<SinhVien> lsv = new ArrayList<SinhVien>();
		int n = sc.nextInt(), m=sc.nextInt();
		for(int i=1;i<=n;i++) {
			sc.nextLine();
			SinhVien a = new SinhVien(sc.nextLine(), sc.nextDouble(), sc.nextInt());
			lsv.add(a);
		}
		ArrayList<SinhVien> res = new ArrayList<SinhVien>(lsv);
		lsv.sort(Comparator.comparing(SinhVien::getGpa).reversed());
		int k=0;
		for(int i=0;i<n;i++) {
			double curr = lsv.get(i).getGpa();
			if(k<m) {
				while(lsv.get(i).getGpa() == curr) {
					lsv.get(i).setHb(check(lsv.get(i)));
					if(!lsv.get(i).getHb().equals("KHONG")) k++;
					i++;
				}
				i--;
			}
			else {
				lsv.get(i).setHb("KHONG");
			}
		}
		for(SinhVien x: res) System.out.println(x);
	}
}
