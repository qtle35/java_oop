//package codedevl;
//
//import java.util.ArrayList;
//import java.util.Comparator;
//import java.util.Scanner;
//
//class Sinhvien{
//	private String ma,ten,lop,mail;
//	private int nam;
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
//	public int getNam() {
//		int n=0;
//		n=n*10+(lop.charAt(1)-'0');
//		n=n*10+(lop.charAt(2)-'0');
//		return n;
//	}
//}
//public class j05023lietkesvtheonam {
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
//			System.out.println("DANH SACH SINH VIEN KHOA "+s +":");
//			int k=0;
//			k=k*10+(s.charAt(2)-'0');
//			k=k*10+(s.charAt(3)-'0');
//			for(Sinhvien x:l) {
//				if(x.getNam()==k) System.out.println(x);
//			}
//		}
//	}
//}
//
//
