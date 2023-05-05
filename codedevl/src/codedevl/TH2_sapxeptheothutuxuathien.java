package codedevl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class TH2_sapxeptheothutuxuathien {
	public static <T> void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			int n = sc.nextInt();
			LinkedHashMap<String,Integer> hm = new LinkedHashMap<>();
			for(int i=0;i<n;i++) {
				String k = sc.next();
				if(hm.get(k)==null) hm.put(k, 1);
				else hm.put(k, hm.get(k)+1);
			}
			ArrayList<Map.Entry<String, Integer> > list = new ArrayList<Map.Entry<String, Integer>>(hm.entrySet());
			Collections.sort(list,new Comparator<Map.Entry<String, Integer> >() {

				@Override
				public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
					// TODO Auto-generated method stub
					return o2.getValue() - o1.getValue();
				}
			});
			for(Map.Entry<String, Integer> l:list) {
				for(int i=0;i<l.getValue();i++) System.out.print(l.getKey()+" ");
			}
			System.out.println();
		}
	}
}
