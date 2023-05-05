package codedevl;

public class DonHang {
	private String madh;
	private long sl;
	private GiaVaThue giaVaThue;
	private long thue, thanhtien;
	public DonHang(String madh, long sl) {
		super();
		this.madh = madh;
		this.sl = sl;
	}
	
	public void setGiaVaThue(GiaVaThue giaVaThue) {
		this.giaVaThue = giaVaThue;
		this.thue = tinhThue();
		this.thanhtien = tinhTien();
	}
	public GiaVaThue getGiaVaThue() {
		return giaVaThue;
	}
	public long tinhThue() {
		return  this.giaVaThue.getDongia()*this.giaVaThue.getThue()*sl/200;
	}
	public long tinhTien() {
		return this.giaVaThue.getDongia()*this.sl + this.thue;
	}
	public String getMadh() {
		
		return madh;
	}
	public long getSl() {
		return sl;
	}
	
	
	public long getThanhtien() {
		return thanhtien;
	}

	@Override
	public String toString() {
		return giaVaThue.getDongia()+" "+thue+" "+thanhtien;
	}
	
}
