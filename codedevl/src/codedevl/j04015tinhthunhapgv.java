package codedevl;

import java.util.Scanner;

class Giaovien{
	private String ma,ten;
	private long luongcb,phucap,thunhap,hsl;
	public Giaovien() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Giaovien(String ma, String ten, long luongcb) {
		super();
		this.ma = ma;
		this.ten = ten;
		this.luongcb = luongcb;
	}
	public String getMa() {
		return ma;
	}
	public String getTen() {
		return ten;
	}
	public long getLuongcb() {
		return luongcb;
	}
	public long getPhucap() {
		return phucap;
	}
	public long getThunhap() {
		return thunhap;
	}
	public long getHsl() {
		return hsl;
	}
	@Override
	public String toString() {
		String s=ma.substring(0,2);
		int k=Integer.parseInt(ma.substring(2));
		if (s.equals("HP")) phucap=900000;
		else if(s.equals("HT")) phucap=2000000;
		else phucap=500000;
		return  ma +" " + ten + " "+k +" " + phucap +" "+(luongcb*k+phucap);
	}
	
}
public class j04015tinhthunhapgv {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Giaovien a= new Giaovien(sc.nextLine(),sc.nextLine(),sc.nextLong());
		System.out.println(a.toString());
	}
}
