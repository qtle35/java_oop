package codedevl;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class j07032sothuannghichtrongfile {
	public static Boolean check(Integer s) {
		String n = ""+s;
		if(n.length()<2 || n.length()%2==0) return false;
		for(int i=0;i<=n.length()/2;i++) {
			if(n.charAt(i)%2==0 || n.charAt(i)!=n.charAt(n.length()-i-1)) return false;
		}
		return true;
	}
	
	public static void main(String[] args) throws ClassNotFoundException, IOException {
		ObjectInputStream input1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
		ObjectInputStream input2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
		ArrayList<Integer> l1 = (ArrayList<Integer>) input1.readObject();
		ArrayList<Integer> l2 = (ArrayList<Integer>) input2.readObject();
		int[] a1 =new int[1000005];
		int[] a2 = new int[1000005];
		for(Integer i : l1) {
			if(check(i)) {
				a1[i]++;
			}
		}
		for(Integer i : l2) {
			a2[i]++;
		}
		int dem=0;
		for(int i=10;i<=1000000;i++) {
			if(dem==10) break;
			if(a1[i]>0 && a2[i]>0) { 
				System.out.println(i +" " + (a1[i]+a2[i]));
				dem++;
			}
		}
		
	}

}
