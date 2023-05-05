package codedevl;

public class Nhom {
	private String masv;
	private int stt;
	private SinhVien sinhVien;
	private BaiTap baiTap;
	public Nhom(String masv, int stt) {
		super();
		this.masv = masv;
		this.stt = stt;
	}
	public void setSinhVien(SinhVien sinhVien) {
		this.sinhVien = sinhVien;
	}
	public void setBaiTap(BaiTap baiTap) {
		this.baiTap = baiTap;
	}
	public String getMasv() {
		return masv;
	}
	public int getStt() {
		return stt;
	}
	@Override
	public String toString() {
		return masv+" "+sinhVien+" "+baiTap;
	}
	
}
