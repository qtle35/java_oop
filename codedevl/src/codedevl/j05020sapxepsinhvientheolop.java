//package codedevl;
//
//import java.util.ArrayList;
//import java.util.Comparator;
//import java.util.Scanner;
//
//class Sinhvien{
//	private String ma,ten,lop,mail;
//
//	public Sinhvien(String ma, String ten, String lop, String mail) {
//		super();
//		this.ma = ma;
//		this.ten = ten;
//		this.lop = lop;
//		this.mail = mail;
//	}
//
//	public String getLop() {
//		return lop;
//	}
//
//	@Override
//	public String toString() {
//		return ma + " " + ten + " " + lop + " " + mail;
//	}
//
//	public String getMa() {
//		return ma;
//	}
//	
//}
//public class j05020sapxepsinhvientheolop {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		ArrayList<Sinhvien> l = new ArrayList<Sinhvien>();
//		int n=Integer.parseInt(sc.nextLine());
//		for(int i=1;i<=n;i++) {
//			l.add(new Sinhvien(sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine()));
//			
//		}
//		l.sort(Comparator.comparing(Sinhvien::getLop)
//				.thenComparing(Sinhvien::getMa));
//		for(Sinhvien x:l) System.out.println(x);
//	}
//}
