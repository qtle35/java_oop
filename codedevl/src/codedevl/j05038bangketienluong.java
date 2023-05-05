//package codedevl;
//
//import java.util.ArrayList;
//import java.util.Comparator;
//import java.util.Scanner;
//
//class nv{
//	private String ten,chucvu,ma;
//	private int lNgay,lThang,thuong,phucap,thuclinh,ngaycong;
//	public nv(String ten,int lNgay ,int ngaycong, String chucvu ) {
//		super();
//		if(chucvu.equals("GD")) this.phucap=250000;
//		else if(chucvu.equals("PGD")) this.phucap=200000;
//		else if(chucvu.equals("TP")) this.phucap=180000;
//		else this.phucap=150000;
//		this.ten = ten;
//		this.ngaycong = ngaycong;
//		this.chucvu = chucvu;
//		this.lNgay = lNgay;
//		if(ngaycong>=25) {
//			
//			this.lThang=lNgay*ngaycong;
//			this.thuong=lNgay*ngaycong*20/100;
//		}
//		else if(ngaycong>=22) {
//			this.thuong=lNgay*ngaycong*10/100;
//			this.lThang=lNgay*ngaycong;
//		}
//		else {
//			this.lThang=lNgay*ngaycong;
//			this.thuong=0;
//		}
//		this.thuclinh=lThang+thuong+phucap;
//	}
//	public void setMa(String ma) {
//		this.ma = ma;
//	}
//	
//	public int getThuclinh() {
//		return thuclinh;
//	}
//	@Override
//	public String toString() {
//		return ma+" "+ten+" "+lThang+" "+thuong+" "+phucap+" "+thuclinh;
//	}
//	
//}
//public class j05038bangketienluong {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int n=Integer.parseInt(sc.nextLine());
//		ArrayList<nv> l = new ArrayList<nv>();
//		for(int i=1;i<=n;i++) {
//			nv a=new nv(sc.nextLine(),Integer.parseInt(sc.nextLine())
//					,Integer.parseInt(sc.nextLine()),sc.nextLine());
//			a.setMa(String.format("NV%02d", i));
//			l.add(a);
//			//System.out.println(a);
//		}
//		//System.out.println("Tong chi phi tien luong: "+tong);
//		l.sort(Comparator.comparing(nv::getThuclinh).reversed());
//		for(nv x:l) System.out.println(x);
//	}
//}
