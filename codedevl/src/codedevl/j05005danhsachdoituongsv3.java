//package codedevl;
//
//import java.util.ArrayList;
//import java.util.Comparator;
//import java.util.Scanner;
//
//class Sinhvien{
//	private String name,birth,lop,ma;
//	private double gpa;
//	public Sinhvien() {
//		super();
//		// TODO Auto-generated constructor stub
//	}
//	public String formatbi(String s) {
//		if (s.charAt(1)=='/') s='0'+s;
//		if (s.length()<10) {
//			s=s.substring(0,3)+'0'+s.substring(3);
//		}
//		return s;
//	}
//	public String formatname(String s){
//		String res="";
//		String[] s1=s.trim().toLowerCase().split("\\s+");
//		for(int i=0;i<s1.length;i++) {
//			res+=s1[i].substring(0,1).toUpperCase()+s1[i].substring(1)+" ";
//		}
//		return res;
//	}
//	public Sinhvien(String name, String lop, String birth, double gpa) {
//		super();
//		this.name = formatname(name);
//		this.birth = formatbi(birth);
//		this.lop = lop;
//		this.gpa = gpa;
//	}
//	public String getName() {
//		return name;
//	}
//	public String getBirth() {
//		return birth;
//	}
//	public String getlop() {
//		return lop;
//	}
//	public double getGpa() {
//		return gpa;
//	}
//	
//	public void setMa(String ma) {
//		this.ma = ma;
//	}
//	@Override
//	public String toString() {
//		return ma+ name + lop + " " + birth +" " +String.format("%.2f", gpa);
//	}
//	
//}
//public class j05005danhsachdoituongsv3 {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		ArrayList<Sinhvien> l = new ArrayList<Sinhvien>();
//		int n=Integer.parseInt(sc.nextLine());
//		for(int i=1;i<=n;i++) {
//			Sinhvien a = new Sinhvien(sc.nextLine(),sc.nextLine(),sc.nextLine(),
//					Double.parseDouble(sc.nextLine()));
//			if(i>=10) a.setMa("B20DCCN0"+i+" ");
//			else a.setMa("B20DCCN00"+i+" ");
//			l.add(a);
//		}
//		l.sort(Comparator.comparing(Sinhvien::getGpa).reversed());
//		for(Sinhvien x : l) System.out.println(x);
//	}
//}
//
//
