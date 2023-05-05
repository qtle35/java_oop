//package codedevl;
//
//import java.io.File;
//import java.io.FileNotFoundException;
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.Comparator;
//import java.util.Scanner;
//
//class doanhnghiep{
//	private String ma,ten,sv;
//
//	public doanhnghiep(String ma, String ten, String sv) {
//		super();
//		this.ma = ma;
//		this.ten = ten;
//		this.sv = sv;
//	}
//
//	public String getMa() {
//		return ma;
//	}
//
//	public void setMa(String ma) {
//		this.ma = ma;
//	}
//	
//	public int getSv() {
//		return Integer.parseInt(sv);
//	}
//
//	@Override
//	public String toString() {
//		return ma + " " + ten + " " + sv;
//	}
//	
//}
//public class j05028doanhnghiepnháninhvienthuctap1 {
//	public static void main(String[] args) throws FileNotFoundException {
//		Scanner sc = new Scanner(System.in);
//		int n=sc.nextInt();
//		sc.nextLine();
//		ArrayList<doanhnghiep> l = new ArrayList<doanhnghiep>();
//		while(n-->0) {
//			l.add(new doanhnghiep(sc.nextLine(),sc.nextLine(),sc.nextLine()));
//		}
//		l.sort(Comparator.comparing(doanhnghiep::getSv).reversed()
//				.thenComparing(doanhnghiep::getMa));
//		for(doanhnghiep x:l) {
//			System.out.println(x);
//		}
//		
//	}
//}
//
