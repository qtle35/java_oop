//package codedevl;
//
//import java.util.Scanner;
//
//class Sinhvien{
//	private String name,birth,id;
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
//	public Sinhvien(String name, String id, String birth, double gpa) {
//		super();
//		this.name = name;
//		this.birth = formatbi(birth);
//		this.id = id;
//		this.gpa = gpa;
//	}
//	public String getName() {
//		return name;
//	}
//	public String getBirth() {
//		return birth;
//	}
//	public String getId() {
//		return id;
//	}
//	public double getGpa() {
//		return gpa;
//	}
//	@Override
//	public String toString() {
//		return name  + " " + id + " " + birth +" " +String.format("%.2f", gpa);
//	}
//	
//}
//public class j05003danhsachdoituongsinhvien1 {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int n=Integer.parseInt(sc.nextLine());
//		for(int i=1;i<=n;i++) {
//			Sinhvien a = new Sinhvien(sc.nextLine(),sc.nextLine(),sc.nextLine(),
//					Double.parseDouble(sc.nextLine()));
//			if(i>=10) System.out.print("B20DCCN0"+i+" ");
//			else System.out.print("B20DCCN00"+i+" ");
//			System.out.println(a);
//		}
//		
//	}
//}
