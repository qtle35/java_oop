package codedevl;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class j07085tongchuso {
	public static int tong(String s) {
		int res=0;
		for(int i=0;i<s.length();i++) res+= (s.charAt(i)-'0');
		return res;
	}
	
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		ObjectInputStream input = new ObjectInputStream(new FileInputStream("DATA.in"));
		ArrayList<String> l = (ArrayList<String>) input.readObject();
//		ArrayList<String> l = new ArrayList<>();
//		l.add("Jhsf00dklT12uhf 780   LPPZH   ");
//		l.add("AAAAddd0000000000000000001T   ");
		for(String x:l) {
			x = x.replaceAll("[^0-9]", "");
			while(x.charAt(0)=='0') x=x.substring(1);
			System.out.println(x +" "+ tong(x));
		}
	}
}
