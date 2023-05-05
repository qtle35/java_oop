package codedevl;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.TreeMap;

public class j07015songtotrongfilenhiphan {
	public static Boolean check(int n) {
		if(n<2) return false;
		for(int i=2;i<=Math.sqrt(n);i++) {
			if(n%i==0) return false;
		}
		return true;
	}
	public static void main(String[] args) throws ClassNotFoundException, IOException {
		ObjectInputStream input = new ObjectInputStream(new FileInputStream("SONGUYEN.in"));
		ArrayList<Integer> l = (ArrayList<Integer>) input.readObject();
		TreeMap<Integer, Integer> tm = new TreeMap<>();
		for(Integer i : l) {
			if(check(i)) {
				if(tm.get(i)==null) tm.put(i, 1);
				else tm.put(i, tm.get(i)+1);
			}
		}
		for(Integer i : tm.keySet()) {
			System.out.println(i + " " +tm.get(i));
		}
	}
}
