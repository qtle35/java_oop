package codedevl;

import java.util.Scanner;

public class j01025 {
	static int maxTheoTruc(int a, int b, int c, int d) {
        int x1 = Math.abs(a - b);
        int x2 = Math.abs(c - d);
        int x3 = Math.abs(a - d);
        int x4 = Math.abs(c - b);
        int m1 = Integer.max(x1, x2);
        int m2 = Integer.max(x3, x4);
        return Integer.max(m1, m2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int xTraiDuoi1, yTraiDuoi1, xPhaiTren1, yPhaiTren1;
        int xTraiDuoi2, yTraiDuoi2, xPhaiTren2, yPhaiTren2;
        xTraiDuoi1 = sc.nextInt();
        yTraiDuoi1 = sc.nextInt();
        xPhaiTren1 = sc.nextInt();
        yPhaiTren1 = sc.nextInt();
        xTraiDuoi2 = sc.nextInt();
        yTraiDuoi2 = sc.nextInt();
        xPhaiTren2 = sc.nextInt();
        yPhaiTren2 = sc.nextInt();
        int xMax = maxTheoTruc(xTraiDuoi1, xPhaiTren1, xTraiDuoi2, xPhaiTren2);
        int yMax = maxTheoTruc(yTraiDuoi1, yPhaiTren1, yTraiDuoi2, yPhaiTren2);
        int edge = Integer.max(xMax, yMax);
        System.out.println(edge * edge);
    }
}
