package codedevl;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.TreeMap;
import java.util.TreeSet;

public class j07031capsonguyentotrongfile2 {
	public static Boolean check(int n) {
		if(n<2) return false;
		for(int i=2;i<=Math.sqrt(n);i++) {
			if(n%i==0) return false;
		}
		return true;
	}
	
	public static void main(String[] args) throws ClassNotFoundException, IOException {
		ObjectInputStream input1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
		ObjectInputStream input2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
		ArrayList<Integer> l1 = (ArrayList<Integer>) input1.readObject();
		ArrayList<Integer> l2 = (ArrayList<Integer>) input2.readObject();
		TreeSet<Integer> tm1 = new TreeSet<>();
		int[] a = new int[1000005];
		for(Integer i : l1) {
			if(check(i)) {
				tm1.add(i);
				a[i]=1;
				a[1000000-i]=1;
			}
		}
		for(Integer i : l2) {
			if(check(i)) {
				a[i]=0;
			}
		}
		for(Integer i : tm1) {
			if(i >= 1000000-i) break;
			if(a[i]==1 && tm1.contains(1000000-i) && check(1000000-i) && a[1000000-i]==1) System.out.println(i + " "+(1000000-i));
		}
		
	}

}
