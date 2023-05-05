package codedevl;

import java.util.Scanner;

class Point2 {
	private double x, y;

	public Point2(double x, double y) {
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

	public double distance(Point2 a) {
		return Math.sqrt((this.x - a.getX()) * (this.x - a.getX()) + (this.y - a.getY()) * (this.y - a.getY()));
	}

	public static double square(double a, double b, double c) {
		double ans = (a + b + c) * (a + b - c) * (a - b + c) * (-a + b + c);
		ans = Math.sqrt(ans);
		return ans / 4;
	}

}
public class j04008dientichtamgiac {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			Point2 a = new Point2(sc.nextDouble(), sc.nextDouble());
			Point2 b = new Point2(sc.nextDouble(), sc.nextDouble());
			Point2 c = new Point2(sc.nextDouble(), sc.nextDouble());
			double ab = a.distance(b);
			double bc = b.distance(c);
			double ca = c.distance(a);
			if (ab + bc <= ca || ab + ca <= bc || bc + ca <= ab) {
				System.out.println("INVALID");
			} else
				System.out.println(String.format("%.2f", Point2.square(ab, bc, ca)));
		}
		sc.close();
	}
}
