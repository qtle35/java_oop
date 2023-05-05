package codedevl;

public class NhanVien {
	private String manv, ten;
	private String macv;
	private int sohieu, bacluong;
	private static int gd=1,tp=3,pp=3;
	public NhanVien(String manv, String ten) {
		super();
		this.manv = manv;
		this.ten = ten;
		this.sohieu = Integer.parseInt(manv.substring(4));
		this.macv = cvreal(manv.substring(0,2));
		
		this.bacluong = Integer.parseInt(manv.substring(2,4));
	}
	public String cvreal(String s) {
		if(s.equals("GD") && sohieu==1) {
			return "GD";
		}
		else if(s.equals("TP") && sohieu<=3) {
			return "TP";
		}
		else if(s.equals("PP") && sohieu<=3) {
			return "PP";
		}
		else return "NV";
	}
	
	public int getBacluong() {
		return bacluong;
	}
	
	public int getSohieu() {
		return sohieu;
	}
	
	public String getMacv() {
		return macv;
	}
	
	public String getTen() {
		return ten;
	}
	@Override
	public String toString() {
		return ten+" "+macv+" "+String.format("%03d", sohieu)+" "+String.format("%02d", bacluong);
	}
	
}
