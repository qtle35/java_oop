package codedevl;

import java.util.*;

public class j05067quanlykhoxangdau {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        ArrayList<GiaVaThue> list = new ArrayList<>();
//        sc.nextLine();
        for (int t = 1; t <= test; t++) {
//            sc.nextLine();
            GiaVaThue x = new GiaVaThue(sc.next(), sc.nextInt());
            list.add(x);
        }
        list.sort(Comparator.comparing(GiaVaThue::getThanhTien).reversed());
        for (GiaVaThue x : list) {
            System.out.println(x);
        }
    }
}