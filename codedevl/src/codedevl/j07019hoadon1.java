package codedevl;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class j07019hoadon1 {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("DATA1.in"));
		ArrayList<SanPham> lsp = new ArrayList<>();
		ArrayList<DanhSachHoaDon> ldshd = new ArrayList<>();
		int t = sc.nextInt();
		while(t-->0) {
			sc.nextLine();
			lsp.add(new SanPham(sc.nextLine(),sc.nextLine(),sc.nextInt(),sc.nextInt()));
		}
		sc = new Scanner(new File("DATA2.in"));
		t = sc.nextInt();
		for(int i=1;i<=t;i++) {
			HoaDon a = new HoaDon(sc.next(), sc.nextInt());
			String s = a.getMaHd().substring(0, 2);
			String sl = a.getMaHd().substring(2);
			a.setMaHdDu(a.getMaHd()+"-"+String.format("%03d", i));
			for(SanPham x: lsp) {
				if(x.getMasp().equals(s)) {
					int tiengiam=0, tientra=0, tong=0;
					if(sl.equals("1")) tong = a.getsLuong()*x.getGial1();
					else tong = a.getsLuong()*x.getGial2(); 
					if(a.getsLuong()>=150) {
						tiengiam = (int) (0.5*tong);
						tientra = tong - tiengiam;
					}
					else if(a.getsLuong()>=100) {
						tiengiam = (int) (0.3*tong);
						tientra = tong - tiengiam;
					}
					else if(a.getsLuong()>=50) {
						tiengiam = (int) (0.15*tong);
						tientra = tong - tiengiam;
					}
					else {
						tiengiam = 0;
						tientra = tong - tiengiam;
					}
					DanhSachHoaDon danhSachHoaDon = new DanhSachHoaDon(a.getMaHdDu(), x.getTensp(), tiengiam, tientra);
					ldshd.add(danhSachHoaDon);
					break;
				}
			}
			
		}
		for(DanhSachHoaDon x : ldshd) System.out.println(x);
	}
}
