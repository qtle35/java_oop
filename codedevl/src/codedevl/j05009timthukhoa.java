package codedevl;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

class Thisinh{
	private String name,birth,ma;
	private double d1,d2,d3,sum;
	public Thisinh() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Thisinh(String name, String birth, double d1, double d2, double d3) {
		super();
		this.name = name;
		this.birth = birth;
		this.d1 = d1;
		this.d2 = d2;
		this.d3 = d3;
	}
	public double getD1() {
		return d1;
	}
	public double getD2() {
		return d2;
	}
	public double getD3() {
		return d3;
	}
	public String getMa() {
		return ma;
	}
	
	public void setMa(String ma) {
		this.ma = ma;
	}
	public void setSum(double sum) {
		this.sum = sum;
	}
	
	public double getSum() {
		return sum;
	}
	@Override
	public String toString() {
		return ma+" "+name+" "+birth+" "+sum;
	}
	
	
}
public class j05009timthukhoa {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double max=0;
		ArrayList<Thisinh> l = new ArrayList<Thisinh>();
		int n=Integer.parseInt(sc.nextLine());
		for(int i=1;i<=n;i++) {
			Thisinh a=new Thisinh(sc.nextLine(),sc.nextLine(),
				Double.parseDouble(sc.nextLine()),Double.parseDouble(sc.nextLine()),Double.parseDouble(sc.nextLine()));
			a.setSum(a.getD1()+a.getD2()+a.getD3());
			a.setMa(""+i);
			if(a.getSum()>max) max=a.getSum();
			l.add(a);
		}
		l.sort(Comparator.comparing(Thisinh::getMa));
		for(Thisinh x:l) {
			if(x.getSum()==max) System.out.println(x);
		}
	}
}

