package codedevl;

import java.util.*;

public class j03017loaibo100 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            StringBuilder sb = new StringBuilder(sc.next());
            int find = 0, preFind = -2, count = 1, res = 0;
            while ((find = sb.indexOf("100")) != -1) {
                if (find == preFind || find == preFind - 1 || find == preFind - 2) 
                    count++;
                else 
                    count = 1;
                res = Integer.max(res, count);
                sb = sb.delete(find, find+3);
                preFind = find;
            }
            System.out.println(res*3);
        }
    }
}
