package codedevl;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class CuocGoi {
	private String so, sta, end;
	private long diff, giacuoc;
	private ThanhPho thanhPho;
	public CuocGoi(String so, String sta, String end) {
		super();
		this.so = so;
		this.sta = sta;
		this.end = end;
		this.diff = getDiffTime(sta, end);
	}
	public long getDiffTime(String start, String end) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm");
        LocalTime d1 = LocalTime.parse(start, dtf);
        LocalTime d2 = LocalTime.parse(end, dtf);
        return ChronoUnit.MINUTES.between(d1, d2);
    }
	public void setThanhPho(ThanhPho thanhPho) {
		this.thanhPho = thanhPho;
	}
	public void setGiacuoc(long giacuoc) {
		this.giacuoc = giacuoc;
	}
	public long getDiff() {
		return diff;
	}
	
	public void setDiff(long diff) {
		this.diff = diff;
	}
	
	public long getGiacuoc() {
		return giacuoc;
	}
	@Override
	public String toString() {
		return so+" "+thanhPho.getTen()+" "+diff+" "+giacuoc;
	}
	
}
