package codedevl;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class VanDongVien {
	private String ma, ten, ns, timeSta, timeEnd;
	private long diff;
	private int ut,rank;
	private long res;
	public VanDongVien(int ma, String ten, String ns, String timeSta, String timeEnd) {
		this.ma = String.format("VDV%02d", ma);
		this.ten = ten;
		this.ns = ns;
		this.timeSta = timeSta;
		this.timeEnd = timeEnd;
		this.diff = getDiffTime(timeSta, timeEnd);
		this.ut = tuoi(ns);
		this.res = diff-ut;
	}
	public int tuoi(String ns) {
		String s = ns.substring(6);
		int k = 2021 - Integer.parseInt(s);
		if(k<18) return 0;
		else if(k<25) return 1;
		else if(k<32) return 2;
		else return 3;
	}
	public long getDiffTime(String start, String end) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalTime d1 = LocalTime.parse(timeSta, dtf);
        LocalTime d2 = LocalTime.parse(timeEnd, dtf);
        return ChronoUnit.SECONDS.between(d1, d2);
    }
	public long getRes() {
		return res;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	
	public int getRank() {
		return rank;
	}
	@Override
	public String toString() {
		return ma+" "+ten+" "+String.format("%02d:%02d:%02d", diff / 3600, (diff % 3600) / 60, (diff% 60))
				+" "+String.format("00:00:%02d", ut)+" "
				+String.format("%02d:%02d:%02d", (res) / 3600, ((res) % 3600) / 60, ((res)% 60))+" "+rank;
	}
}
