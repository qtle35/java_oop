//package codedevl;
//
//import java.util.ArrayList;
//import java.util.Collection;
//import java.util.Collections;
//import java.util.Comparator;
//import java.util.List;
//import java.util.Scanner;
//
//class time{
//	private int h,m,s;
//
//	public time(int h, int m, int s) {
//		super();
//		this.h = h;
//		this.m = m;
//		this.s = s;
//	}
//
//	public int getH() {
//		return h;
//	}
//
//	public void setH(int h) {
//		this.h = h;
//	}
//
//	public int getM() {
//		return m;
//	}
//
//	public void setM(int m) {
//		this.m = m;
//	}
//
//	public int getS() {
//		return s;
//	}
//
//	public void setS(int s) {
//		this.s = s;
//	}
//	public int getres() {
//		return h*60*60+m*60+s;
//	}
//
//	@Override
//	public String toString() {
//		return h + " " + m + " " + s;
//	}
//	
//}
//public class j05033sxthoigian {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int t=sc.nextInt();
//		List<time> l=new ArrayList<>();
//		while(t-->0) {
//			
//			time a=new time(sc.nextInt(),sc.nextInt(),sc.nextInt());
//			l.add(a);
//		}
//		Collections.sort(l, new Comparator<time>() {
//			public int compare(time o1, time o2) {
//				return o1.getres()<o2.getres()?-1:1;
//			}
//		});
//		for(time x :l) {
//			System.out.println(x.toString());
//		}
//	}
//}
