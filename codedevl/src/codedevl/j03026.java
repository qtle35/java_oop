package codedevl;

import java.util.Scanner;

public class j03026 {
	static int xauKhacNhauDaiNhat(String a, String b) {
        if (a.equals(b)) return -1;
        return Integer.max(a.length(), b.length());
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);     
        int t = sc.nextInt();
        while (t-->0) {
            String s1 = sc.next();
            String s2 = sc.next();
            System.out.println(xauKhacNhauDaiNhat(s1, s2));
        }
    }
}
