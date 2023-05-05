package codedevl;

import java.util.HashMap;

public class KhachHang {
	private String maKH, lSD;
	private long soMoi, soCu, hs, soDiff, thanhtien, phutroi;
	public KhachHang(int maKH, String lSD, long soCu, long soMoi) {
		super();
		this.maKH = String.format("KH%02d", maKH);
		this.lSD = lSD;
		this.soMoi = soMoi;
		this.soCu = soCu;
		this.hs = tinhHS(lSD);
		this.soDiff = soMoi - soCu;
		this.thanhtien = soDiff*hs*550;
		this.phutroi = tinhPhutroi();
	}
	public int tinhHS(String s) {		
		if(s.equals("KD")) return 3;
		else if(s.equals("NN")) return 5;
		else if(s.equals("TT")) return 4;
		return 2;
	}
	public long tinhPhutroi() {
		if(soDiff<50) return 0;
		else if(soDiff<=100) return (long) Math.round((thanhtien/100.0*35)*10/10);
		else return thanhtien;
		
	}
	public long getTongtien() {
		return (phutroi+thanhtien);
	}
	@Override
	public String toString() {
		return maKH+" "+hs+" "+thanhtien+" "+phutroi+" "+(phutroi+thanhtien);
	}
	

	
}
