package codedevl;

import java.util.Scanner;

class Phanso1{
	private long mau, tu;

	public static long gcd(long a, long b) {
		if (b == 0)
			return a;
		return gcd(b, a % b);
	}

	public Phanso1() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Phanso1(long tu, long mau) {
		super();
		this.mau = mau;
		this.tu = tu;
	}

	public long getMau() {
		return mau;
	}

	public void setMau(long mau) {
		this.mau = mau;
	}

	public long getTu() {
		return tu;
	}

	public void setTu(long tu) {
		this.tu = tu;
	}

	public void rutgon() {
		long m = gcd(this.tu, this.mau);
		this.setTu(this.tu/m);
		this.setMau(this.mau/m);
	}
	public void tinhtong(Phanso1 p2) {
		Phanso1 q=new Phanso1();
		q.setTu(this.getTu()*p2.getMau()+p2.getTu()*this.getMau());
		q.setMau(this.getMau()*p2.getMau());
		q.rutgon();
		System.out.println(q.getTu()+"/"+q.getMau());
	}
}

public class j04004tongphanso {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Phanso1 p1=new Phanso1(sc.nextLong(),sc.nextLong());
		Phanso1 p2=new Phanso1(sc.nextLong(),sc.nextLong());
		p1.tinhtong(p2);
	}
}
