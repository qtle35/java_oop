//package codedevl;
//
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.Comparator;
//import java.util.List;
//import java.util.Scanner;
//
//class Mathang{
//	private String ma,ten,dv;
//	private double mua,ban,ln;
//	public Mathang(String ten, String dv, double mua, double ban) {
//		super();
//		this.ten = ten;
//		this.dv = dv;
//		this.mua = mua;
//		this.ban = ban;
//		this.ln=ban-mua;
//	}
//	public String getMa() {
//		return ma;
//	}
//	public void setMa(String ma) {
//		this.ma = ma;
//	}
//	public String getTen() {
//		return ten;
//	}
//	public void setTen(String ten) {
//		this.ten = ten;
//	}
//	public String getDv() {
//		return dv;
//	}
//	public void setDv(String dv) {
//		this.dv = dv;
//	}
//	public double getMua() {
//		return mua;
//	}
//	public void setMua(double mua) {
//		this.mua = mua;
//	}
//	public double getBan() {
//		return ban;
//	}
//	public void setBan(double ban) {
//		this.ban = ban;
//	}
//	public double getLn() {
//		return ban-mua;
//	}
//	@Override
//	public String toString() {
//		return ma + " " + ten + " " + dv + " " + 
//				String.format("%.2f", ln);
//	}
//	
//}
//public class j05010sapxepdanhsachmathang {
//	public static <T> void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int t=Integer.parseInt(sc.nextLine());
//		List<Mathang> l=new ArrayList<>();
//		for(int i=1;i<=t;i++) {
//			Mathang a=new Mathang(sc.nextLine(),sc.nextLine(),
//					Double.parseDouble(sc.nextLine()),Double.parseDouble(sc.nextLine()));
//			a.setMa(""+i);
//			l.add(a);
//		}
//		l.sort(Comparator.comparing(Mathang::getLn).reversed());
//		for(Mathang x:l) {
//			System.out.println(x.toString());
//		}
//	}
//}
//
