package codedevl;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.TreeMap;

public class Th1_D_Sokhonggiam {
	public static Boolean check(int n) {
		if(n<10) return false;
		int a = n%10, b=0;
		n/=10;
		while(n>0) {
			b = n%10;
			if(a<b) return false;
			a=b;
			n/=10;
		}
		return true;
	}
	public static void main(String[] args) throws ClassNotFoundException, IOException {
		ObjectInputStream input1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
		ObjectInputStream input2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
		ArrayList<Integer> l1 = (ArrayList<Integer>) input1.readObject();
		ArrayList<Integer> l2 = (ArrayList<Integer>) input2.readObject();
		TreeMap<Integer, Integer> tm1 = new TreeMap<>();
		TreeMap<Integer, Integer> tm2 = new TreeMap<>();
		for(Integer i : l1) {
			if(check(i)) {
				if(tm1.get(i)==null) tm1.put(i, 0);
				tm1.put(i, tm1.get(i)+1);
			}
		}
		for(Integer i : l2) {
			if(check(i)) {
				if(tm2.get(i)==null) tm2.put(i, 0);
				tm2.put(i, tm2.get(i)+1);
			}
		}
		for(Integer i : tm1.keySet()) {
			if(tm2.get(i)!=null) System.out.println(i + " " + tm1.get(i) + " " +tm2.get(i));
		}
		
	}
}