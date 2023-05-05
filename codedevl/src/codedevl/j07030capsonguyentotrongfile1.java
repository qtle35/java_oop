package codedevl;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.TreeMap;
import java.util.TreeSet;

public class j07030capsonguyentotrongfile1 {
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
		TreeMap<Integer, Integer> tm2 = new TreeMap<>();
		for(Integer i : l1) {
			if(check(i)) {
				tm1.add(i);
			}
		}
		for(Integer i : l2) {
			if(check(i)) {
				if(tm2.get(i)==null) tm2.put(i, 1);
				else tm2.put(i, tm2.get(i)+1);
			}
		}
		for(Integer i : tm1) {
			if(i >= 1000000-i) break;
			if(tm2.get(1000000-i)!=null) System.out.println(i + " "+(1000000-i));
		}
		
	}
}
