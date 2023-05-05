package codedevl;

import java.util.Scanner;

class Point4 {
	private double x, y;

	public Point4() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Point4(double x, double y) {
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

	public double distance(Point4 b) {
		return Math.sqrt((this.x-b.x)*(this.x-b.x)+(this.y-b.y)*(this.y-b.y));
	}
	public double distance(Point4 a, Point4 b) {
		return Math.sqrt((a.x-b.x)*(a.x-b.x)+(a.y-b.y)*(a.y-b.y));
	}

	@Override
	public String toString() {
		return "Point4 [x=" + x + ", y=" + y + "]";
	}
	
}

public class j04001khaibaolopPoint4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t= sc.nextInt();
		while(t-->0) {
			Point4 p1=new Point4(sc.nextDouble(),sc.nextDouble());
			Point4 p2=new Point4(sc.nextDouble(),sc.nextDouble());
			System.out.printf("%.4f\n",p1.distance(p2));
		}
	}
}
