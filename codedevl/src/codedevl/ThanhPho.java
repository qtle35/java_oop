package codedevl;

public class ThanhPho {
	private String ma, ten;
	private int giacuoc;
	public ThanhPho(String ma, String ten, int giacuoc) {
		super();
		this.ma = ma;
		this.ten = ten;
		this.giacuoc = giacuoc;
	}
	public String getMa() {
		return ma;
	}
	public void setMa(String ma) {
		this.ma = ma;
	}
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public int getGiacuoc() {
		return giacuoc;
	}
	public void setGiacuoc(int giacuoc) {
		this.giacuoc = giacuoc;
	}
	
}
