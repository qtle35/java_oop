//package codedevl;
//
//import java.util.ArrayList;
//import java.util.Comparator;
//import java.util.Scanner;
//
//class sinhvien{
//	private String tt,ma,hten,lop,mail,dnghiep;
//
//	public sinhvien(String ma, String hten, String lop, String mail, String dnghiep) {
//		super();
//		this.ma = ma;
//		this.hten = hten;
//		this.lop = lop;
//		this.mail = mail;
//		this.dnghiep = dnghiep;
//	}
//
//	public String getHten() {
//		return hten;
//	}
//	
//	public String getMa() {
//		return ma;
//	}
//
//	public void setTt(String tt) {
//		this.tt = tt;
//	}
//	
//	public String getDnghiep() {
//		return dnghiep;
//	}
//
//	@Override
//	public String toString() {
//		return tt+" "+ma+" "+hten+" "+lop+" "+mail+" "+dnghiep;
//	}
//	
//}
//public class j05034danhsachthuctap1 {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		ArrayList<sinhvien> l = new ArrayList<sinhvien>();
//		int n=Integer.parseInt(sc.nextLine());
//		for(int i=1;i<=n;i++) {
//			sinhvien a= new sinhvien(sc.nextLine(),sc.nextLine(),sc.nextLine()
//					,sc.nextLine(),sc.nextLine());
//			a.setTt(""+i);
//			l.add(a);
//		}
//		l.sort(Comparator.comparing(sinhvien::getMa));
//		int t=sc.nextInt();
//		while(t-->0) {
//			String s=sc.next();
//			for(sinhvien x:l) {
//				if(x.getDnghiep().equals(s)) System.out.println(x);
//			}
//		}
//		
//	}
//}
