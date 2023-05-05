//package codedevl;
//
//import java.util.ArrayList;
//import java.util.Comparator;
//import java.util.Scanner;
//
//class sinhvien{
//	private String ma,ten,lop;
//	private double d1,d2,d3;
//	public sinhvien(String ma, String ten, String lop, double d1, double d2, double d3) {
//		super();
//		this.ma = ma;
//		this.ten = ten;
//		this.lop = lop;
//		this.d1 = d1;
//		this.d2 = d2;
//		this.d3 = d3;
//	}
//	public String getMa() {
//		return ma;
//	}
//	@Override
//	public String toString() {
//		return ma+" "+ten+" "+lop+" "+String.format("%.1f", d1)+" "+String.format("%.1f", d2)+" "+String.format("%.1f", d3);
//	}
//	
//}
//public class j05030bangdiemthanhphan1 {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		ArrayList<sinhvien> l = new ArrayList<sinhvien>();
//		int n=Integer.parseInt(sc.nextLine());
//		for(int i=1;i<=n;i++) {
//			sinhvien a=new sinhvien(sc.nextLine(),sc.nextLine(),sc.nextLine()
//					,Double.parseDouble(sc.nextLine()),Double.parseDouble(sc.nextLine()),Double.parseDouble(sc.nextLine()));
//			l.add(a);
//		}
//		l.sort(Comparator.comparing(sinhvien::getMa));
//		int i=1;
//		for(sinhvien x:l) {
//			System.out.print(i+" ");
//			System.out.println(x);
//			i+=1;
//		}
//	}
//}
