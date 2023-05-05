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
//public class j05022lietkesinhvientheolop {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		ArrayList<Sinhvien> l = new ArrayList<Sinhvien>();
//		int n=Integer.parseInt(sc.nextLine());
//		while(n-->0) {
//			l.add(new Sinhvien(sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine()));
//			
//		}
//		int t=sc.nextInt();
//		while(t-->0) {
//			String s=sc.next();
//			System.out.println("DANH SACH SINH VIEN LOP "+s +":");
//			for(Sinhvien x:l) {
//				if(x.getLop().equals(s)) System.out.println(x);
//			}
//		}
//	}
//}
//
