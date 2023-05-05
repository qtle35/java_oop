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
//	private int mua,ban,ln,tt;
//	public Mathang(String ten, String dv, int mua, int ban) {
//		super();
//		this.ten = ten;
//		this.dv = dv;
//		this.mua = mua;
//		this.ban = ban;
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
//	public int getMua() {
//		return mua;
//	}
//	public void setMua(int mua) {
//		this.mua = mua;
//	}
//	public int getBan() {
//		return ban;
//	}
//	public void setBan(int ban) {
//		this.ban = ban;
//	}
//	public int getTt() {
//		return tt;
//	}
//	public void setTt(int tt) {
//		this.tt = tt;
//	}
//	public int getLn() {
//		return ban-mua;
//	}
//	@Override
//	public String toString() {
//		ln=ban-mua;
//		return ma + " " + ten + " " + dv + " " + 
//				mua + " " + ban + " " + ln;
//	}
//	
//}
//public class j05081danhsachmathang {
//	public static <T> void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int t=Integer.parseInt(sc.nextLine());
//		List<Mathang> l=new ArrayList<>();
//		for(int i=1;i<=t;i++) {
//			Mathang a=new Mathang(sc.nextLine(),sc.nextLine(),
//					Integer.parseInt(sc.nextLine()),Integer.parseInt(sc.nextLine()));
//			if(i>=10) {
//				a.setMa("MH0"+i);
//			}
//			else a.setMa("MH00"+i);
//			a.setTt(i);
//			l.add(a);
//		}
//		Collections.sort(l,new Comparator<Mathang>() {
//
//			@Override
//			public int compare(Mathang o1, Mathang o2) {
//				if (o1.getLn()==o2.getLn()) {
//					return o1.getTt()<o1.getTt()?-1:1;
//				}
//				return o1.getLn()<o2.getLn()?1:-1 ;
//			}
//		});
//		for(Mathang x:l) {
//			System.out.println(x.toString());
//		}
//	}
//}
