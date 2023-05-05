package codedevl;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;

public class j070202hoadon2 {
	public static void main(String[] args) throws FileNotFoundException, ParseException {
		Scanner sc = new Scanner(new File("KH.in"));
		int t = Integer.parseInt(sc.nextLine());
		ArrayList<KhachHang> lkh = new ArrayList<KhachHang>();
		ArrayList<MatHang> lmh = new ArrayList<>();
		ArrayList<HoaDon> lhd = new ArrayList<>();
		for(int i=1;i<=t;i++) {
			lkh.add(new KhachHang(i, sc.nextLine(),
					sc.nextLine(), sc.nextLine(), sc.nextLine()));
		}
		sc = new Scanner(new File("MH.in"));
		t = sc.nextInt();
		for(int i=1;i<=t;i++) {
			sc.nextLine();
			lmh.add(new MatHang(i,sc.nextLine(),sc.nextLine(),sc.nextInt(),sc.nextInt()));
		}
		sc= new Scanner(new File("HD.in"));
		t= sc.nextInt();
		for(int i=1;i<=t;i++) {
			HoaDon a = new HoaDon(i, sc.next(), sc.next(), sc.nextInt());
			lhd.add(a);
			for(KhachHang x: lkh) {
				for(MatHang y: lmh) {
					if(a.getKh().equals(x.getMakh()) && a.getMh().equals(y.getMamh())) {
						a.setKhachHang(x);
						a.setMatHang(y);
					}
				}
			}
		}
		for(HoaDon x: lhd) {
			System.out.println(x);
		}
	}
}
