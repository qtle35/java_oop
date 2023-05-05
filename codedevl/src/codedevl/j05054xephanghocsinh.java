package codedevl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class j05054xephanghocsinh {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        ArrayList<HocSinh> list = new ArrayList<>();
        for (int t = 1; t <= test; t++) {
            sc.nextLine();
            HocSinh x = new HocSinh(t, sc.nextLine(), sc.nextFloat());
            list.add(x);
        }
        
        Collections.sort(list, Comparator.comparing(HocSinh::getDiemTB).reversed());
        list.get(0).setXepHang(1);
        
        for (int t = 1; t < test; t++) {
            if (list.get(t).getDiemTB() == list.get(t - 1).getDiemTB())
                list.get(t).setXepHang(list.get(t - 1).getXepHang());
            else
                list.get(t).setXepHang(t + 1);
        }
        
        Collections.sort(list, Comparator.comparing(HocSinh::getId));
        
        for (HocSinh x : list) {
            System.out.println(x);
        }
    }
}
