package codedevl;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

class gamethu{
	private String ma,ten,stime,etime;
	private long diff;
	public gamethu(String ma, String ten, String stime, String etime) {
		super();
		this.ma = ma;
		this.ten = ten;
		this.stime = stime;
		this.etime = etime;
		this.diff=tinhgio(stime,etime);
	}
	public long getDiff() {
		
		return diff;
	}
	public long tinhgio(String s1, String s2) {
		DateTimeFormatter myfm= DateTimeFormatter.ofPattern("HH:mm");
		LocalTime s= LocalTime.parse(s1,myfm);
		LocalTime e= LocalTime.parse(s2,myfm);
		return ChronoUnit.MINUTES.between(s, e);
	}
	@Override
	public String toString() {
		return ma + " " + ten + " "+ diff/60 + " gio "+ diff%60+" phut";
	}
	
}
public class j05011tinhgio {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<gamethu> l = new ArrayList<gamethu>();
		int n=Integer.parseInt(sc.nextLine());
		for(int i=1;i<=n;i++) {
			l.add(new gamethu(sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine()));
		}
		l.sort(Comparator.comparing(gamethu::getDiff).reversed());
		for(gamethu x:l) System.out.println(x);
	}
}
