package codedevl;

public class SanPham {
	private String masp, tensp;;
	private int gial1, gial2;
	public SanPham(String masp, String tensp, int gial1, int gial2) {
		super();
		this.masp = masp;
		this.tensp = tensp;
		this.gial1 = gial1;
		this.gial2 = gial2;
	}
	public String getMasp() {
		return masp;
	}
	public String getTensp() {
		return tensp;
	}
	public int getGial1() {
		return gial1;
	}
	public int getGial2() {
		return gial2;
	}
	
}
