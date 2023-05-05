package codedevl;

import java.util.Scanner;

class Point3D {
    private int x, y, z;
    
    public Point3D(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    
    public static boolean check(Point3D a, Point3D b, Point3D c, Point3D d){
        int x_ba = b.x - a.x, y_ba = b.y - a.y, z_ba = b.z - a.z;
        int x_ca = c.x - a.x, y_ca = c.y - a.y, z_ca = c.z - a.z;
        int x_da = d.x - a.x, y_da = d.y - a.y, z_da = d.z - a.z;
        int n1 = y_ba * z_ca - z_ba * y_ca;
        int n2 = z_ba * x_ca - x_ba * z_ca;
        int n3 = x_ba * y_ca - y_ba * x_ca;
        return x_da * n1 + y_da * n2 + z_da * n3 == 0;
    }
}
public class j04011bondiemtrenmatphang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
        Point3D p1 = new Point3D(sc.nextInt(),sc.nextInt(),sc.nextInt());
        Point3D p2 = new Point3D(sc.nextInt(),sc.nextInt(),sc.nextInt());
        Point3D p3 = new Point3D(sc.nextInt(),sc.nextInt(),sc.nextInt());
        Point3D p4 = new Point3D(sc.nextInt(),sc.nextInt(),sc.nextInt());
        
        if(Point3D.check(p1,p2,p3,p4)){
            System.out.println("YES");
        } else{
            System.out.println("NO");
        }
        }
    }
}
