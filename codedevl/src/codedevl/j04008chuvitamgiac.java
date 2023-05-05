package codedevl;

import java.util.Scanner;

class Point1 {
	private double x, y;

	public Point1() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Point1(double x, double y) {
		super();
		this.x = x;
		this.y = y;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public double distance(Point1 b) {
		return Math.sqrt((this.x-b.x)*(this.x-b.x)+(this.y-b.y)*(this.y-b.y));
	}
	public double distance(Point1 a, Point1 b) {
		return Math.sqrt((a.x-b.x)*(a.x-b.x)+(a.y-b.y)*(a.y-b.y));
	}

	@Override
	public String toString() {
		return "Point1 [x=" + x + ", y=" + y + "]";
	}
	
}
public class j04008chuvitamgiac {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			Point1 p1=new Point1(sc.nextDouble(),sc.nextDouble());
			Point1 p2=new Point1(sc.nextDouble(),sc.nextDouble());
			Point1 p3=new Point1(sc.nextDouble(),sc.nextDouble());
			double d1=p1.distance(p2),d2=p1.distance(p3),d3=p2.distance(p3);
			if (d1>=d2+d3 || d2>=d1+d3 || d3>=d1+d2) System.out.println("INVALID");
			else {
				System.out.printf("%.3f\n",(d1+d2+d3));
			}
		}
		
	}
}
