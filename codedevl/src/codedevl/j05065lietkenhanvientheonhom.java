package codedevl;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class j05065lietkenhanvientheonhom {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<NhanVien> l = new ArrayList();
		int t = Integer.parseInt(sc.nextLine());
		for(int i=1;i<=t;i++) {
			String s[] = sc.nextLine().split(" ", 2);
//			System.out.println(s[0]);
			l.add(new NhanVien(s[0], s[1]));
		}
		l.sort(Comparator.comparing(NhanVien::getBacluong).reversed().
				thenComparing(NhanVien::getSohieu));
		t = sc.nextInt();
		for(int i=1;i<=t;i++) {
			String s = sc.next();
			for(NhanVien x:l) {
				if(s.equals(x.getMacv())) System.out.println(x);
			}
			System.out.println();
		}
	}
}
