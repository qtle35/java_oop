package codedevl;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class khachhang1{
	private String ten,phong,nhan,tra,ma;
	private int tien,tong,ngay;
	public void setNgay(int ngay) {
		this.ngay = ngay;
	}
	public String getMa() {
		return ma;
	}
	public void setMa(String ma) {
		this.ma = ma;
	}
	public String getPhong() {
		return phong;
	}
	public String getNhan() {
		return nhan;
	}
	public String getTra() {
		return tra;
	}
	public int getTien() {
		return tien;
	}
	public String formatbi(String s) {
		if (s.charAt(1)=='/') s='0'+s;
		if (s.length()<10) {
			s=s.substring(0,3)+'0'+s.substring(3);
		}
		return s;
	}
	public String formatname(String s){
		String res="";
		String[] s1=s.trim().toLowerCase().split("\\s+");
		for(int i=0;i<s1.length;i++) {
			res+=s1[i].substring(0,1).toUpperCase()+s1[i].substring(1)+" ";
		}
		return res;
	}
	public khachhang1(String ten, String phong, String nhan, String tra, int tien) {
		super();
		this.ten = formatname(ten);
		this.phong = phong;
		this.nhan = formatbi(nhan);
		this.tra = formatbi(tra);
		this.tien = tien;
	}
	
	public int getTong() {
		return tong;
	}
	public void setTong(int tong) {
		this.tong = tong;
	}
	@Override
	public String toString() {
		return ma+" " + ten + " " + phong + " "+ngay+" " + tong;
	}
	
}
public class j07051tinhtienphong {
	public static void main(String[] args) throws FileNotFoundException {
		int[] gia={0,25,34,50,80};
		Scanner sc = new Scanner(new  File("KHACHHANG.in"));
		ArrayList<khachhang1> l = new ArrayList<khachhang1>();
		int n=Integer.parseInt(sc.nextLine());
		for(int i=1;i<=n;i++) {
			khachhang1 a=new khachhang1(sc.nextLine(), sc.nextLine(),
					sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()));
			if(i>=10) a.setMa("KH"+i);
			else a.setMa("KH0"+i);
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
			LocalDate dBefore = LocalDate.parse(a.getNhan(),formatter);
	        LocalDate dAfter = LocalDate.parse(a.getTra(),formatter);
	        int diff = (int) ChronoUnit.DAYS.between(dBefore, dAfter);
	        diff+=1;
	        a.setNgay(diff);
	        a.setTong(gia[a.getPhong().charAt(0)-'0']*diff+a.getTien()) ;
			l.add(a);
		}
		Collections.sort(l,new Comparator<khachhang1>() {

			@Override
			public int compare(khachhang1 o1, khachhang1 o2) {
				// TODO Auto-generated method stub
				return o1.getTong()<o2.getTong()?1:-1;
			}
		});
		for(khachhang1 x:l) {
			System.out.println(x);
		}
	}
}
