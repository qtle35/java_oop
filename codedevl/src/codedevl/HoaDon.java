package codedevl;

public class HoaDon {
	private String mahd, kh, mh;
	private int sl;
	private KhachHang khachHang;
	private MatHang matHang;
	public HoaDon(int mahd, String kh, String mh, int sl) {
		super();
		this.mahd = String.format("HD0%02d", mahd);
		this.kh = kh;
		this.mh = mh;
		this.sl = sl;
	}
	public void setKhachHang(KhachHang khachHang) {
		this.khachHang = khachHang;
	}
	public void setMatHang(MatHang matHang) {
		this.matHang = matHang;
	}
	public String getKh() {
		return kh;
	}
	public String getMh() {
		return mh;
	}
	@Override
	public String toString() {
		return mahd+" "+khachHang.getTenkh()+" "+khachHang.getDc()+" "+matHang.getTenmh()
			+" "+matHang.getDv()+" "+matHang.getMua()+" "+matHang.getBan()+" "+sl+" "+(sl*matHang.getBan());
	}
	
	
}
