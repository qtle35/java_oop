package codedevl;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class j05050tinhtiendien {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<KhachHang> l = new ArrayList<KhachHang>();
		int t = sc.nextInt();
		for(int i=1;i<=t;i++) {
			l.add(new KhachHang(i, sc.next(), sc.nextLong(), sc.nextLong()));
			
		}
		l.sort(Comparator.comparing(KhachHang::getTongtien).reversed());
		for(KhachHang x:l) System.out.println(x);
	}
}
