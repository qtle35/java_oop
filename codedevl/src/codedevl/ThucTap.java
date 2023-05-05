package codedevl;

public class ThucTap {
	private String masv, tensv, sdt, mail;
	private String madt,tengv, tendt;
	public ThucTap(String ma, String ten, String sdt, String mail) {
		super();
		this.masv = ma;
		this.tensv = ten;
		this.sdt = sdt;
		this.mail = mail;
	}
	public void setMadt(String madt) {
		this.madt = madt;
	}
	public String getMasv() {
		return masv;
	}
	public String getMadt() {
		return madt;
	}
	public void setTengv(String tengv) {
		this.tengv = tengv;
	}
	public void setTendt(String tendt) {
		this.tendt = tendt;
	}
	@Override
	public String toString() {
		return masv+" "+tensv+" "+sdt+" "+mail+" "+tengv+" "+tendt;
	}
	
}
