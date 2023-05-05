package codedevl;

public class MatHang {
	private String mamh;
	private String tenmh, dv;
	private int mua,ban;
	public MatHang(int mamh, String tenmh, String dv, int mua, int ban) {
		this.mamh = String.format("MH0%02d", mamh);
		this.tenmh = tenmh;
		this.dv = dv;
		this.mua = mua;
		this.ban = ban;
	}
	public String getMamh() {
		return mamh;
	}
	public String getTenmh() {
		return tenmh;
	}
	public String getDv() {
		return dv;
	}
	public int getMua() {
		return mua;
	}
	public int getBan() {
		return ban;
	}
	
}
