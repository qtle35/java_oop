//package codedevl;
//
//import java.util.ArrayList;
//import java.util.Comparator;
//import java.util.Scanner;
//
//class giangvien{
//	private String hoten,mon,ten,ma,mamon;
//	private String layten(String s) {
//		String[] res=s.split(" ");
//		return res[res.length-1];
//	}
//	private String layma(String s) {
//		String res="";
//		String[] s2=s.split(" ");
//		for(int i=0;i<s2.length;i++) res+=s2[i].charAt(0);
//		return res.toUpperCase();
//	}
//	public giangvien(String hoten, String mon) {
//		super();
//		this.hoten = hoten;
//		this.mon = mon;
//		this.ten=layten(hoten);
//		this.mamon=layma(mon);
//	}
//	public String getTen() {
//		return ten;
//	}
//	public String getMa() {
//		return ma;
//	}
//	public void setMa(String ma) {
//		this.ma = ma;
//	}
//	@Override
//	public String toString() {
//		return ma+" "+hoten+" "+mamon;
//	}
//	
//}
//public class j05025sapxepdanhsachgiangvien {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		ArrayList<giangvien> l = new ArrayList<giangvien>();
//		int n=Integer.parseInt(sc.nextLine());
//		for(int i=1;i<=n;i++) {
//			giangvien a=new giangvien(sc.nextLine(),sc.nextLine());
//			a.setMa(String.format("GV%02d", i));
//			l.add(a);
//		}
//		l.sort(Comparator.comparing(giangvien::getTen)
//				.thenComparing(giangvien::getMa));
//		for(giangvien x:l) System.out.println(x);
//	}
//}
