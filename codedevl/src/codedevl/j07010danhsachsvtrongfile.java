package codedevl;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//class SV{
//	private String name,birth,lop,id;
//	private double gpa;
//	public SV() {
//		super();
//		// TODO Auto-generated constructor stub
//	}
//	public SV(String name, String lop, String birth, double gpa) {
//		super();
//		this.name = name;
//		this.birth = birth;
//		this.lop = lop;
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
//		birth=s;
//		return s;
//	}
//	public String getlop() {
//		return lop;
//	}
//	public double getGpa() {
//		return gpa;
//	}
//	public String getId() {
//		return id;
//	}
//	public void setId(String id) {
//		this.id = id;
//	}
//	@Override
//	public String toString() {
//		return id+ " " + name + " "+lop+" "+this.getBirth()+" "+String.format("%.2f",gpa);
//	}
//	
//}
public class j07010danhsachsvtrongfile {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("SV.in"));
		List<SV> l = new ArrayList<SV>();
		int n=Integer.parseInt(sc.next());
		for(int i=1;i<=n;i++) {
			sc.nextLine();
			SV a = new SV(sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextDouble());
			
			if(i>=10) a.setId("B20DCCN0"+i);
			else a.setId("B20DCCN00"+i);
			l.add(a);
		}
		for(SV x:l) {
			System.out.println(x.toString());
		}
	}
}
