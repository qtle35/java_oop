package danhsachsinhvien1;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CaThi {
	private String ma, ngay, gio, phong, dd;
	private long comp;
	public CaThi(int ma, String ngay, String gio, String phong) {
		this.ma = String.format("C%03d", ma);
		this.ngay = ngay;
		this.gio = gio;
		this.phong = phong;
		this.dd = ngay+" "+gio;
		this.comp = getDiffTime(dd);
	}
	public long getDiffTime(String start) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        LocalDateTime d1 = LocalDateTime.parse(start, dtf);
        System.out.println(d1.getMinute());
        return d1.getMinute();
    }
	public long getComp() {
		return comp;
	}
	
	public String getMa() {
		return ma;
	}
	@Override
	public String toString() {
		return ma + " "+ dd+" "+phong;
	}
	
}
