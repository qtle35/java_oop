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
//	public Sinhvien(String name, String id, String birth, double gpa) {
//		super();
//		this.name = name;
//		this.birth = birth;
//		this.id = id;
//		this.gpa = gpa;
//	}
//	public String getName() {
//		return name;
//	}
//	public String getBirth() {
//		if (birth.charAt(1)=='/') birth='0'+birth;
//		String s = birth;
//		if (birth.length()<10) {
//			s=birth.substring(0,3)+'0'+birth.substring(3);
//		}
//		return s;
//	}
//	public String getId() {
//		return id;
//	}
//	public double getGpa() {
//		return gpa;
//	}
//	
//}
//public class j04006khaibaosinhvien {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		Sinhvien a=new Sinhvien(sc.nextLine(),sc.next(),sc.next(),sc.nextDouble());
//		System.out.printf("B20DCCN001 %s %s %s %.2f",a.getName(),a.getId(),a.getBirth(),a.getGpa());
//	}
//}
