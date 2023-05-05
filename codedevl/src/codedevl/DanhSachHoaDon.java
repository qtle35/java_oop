package codedevl;

public class DanhSachHoaDon {
	private String ma, ten;
	private int tiengiam, tientra;
	public DanhSachHoaDon(String ma, String ten, int tiengiam, int tientra) {
		super();
		this.ma = ma;
		this.ten = ten;
		this.tiengiam = tiengiam;
		this.tientra = tientra;
	}
	@Override
	public String toString() {
		return ma + " " + ten + " " + tiengiam + " " + tientra;
	}
	
}
