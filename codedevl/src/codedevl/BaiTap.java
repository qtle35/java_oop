package codedevl;

public class BaiTap {
	private String ten;
	private int mabt;
	public BaiTap(int mabt ,String ten) {
		this.mabt = mabt;
		this.ten = ten;
	}
	public String getTen() {
		return ten;
	}
	public int getMabt() {
		return mabt;
	}
	@Override
	public String toString() {
		return mabt+" "+ten;
	}
	
}
