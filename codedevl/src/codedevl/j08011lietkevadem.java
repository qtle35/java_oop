package codedevl;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class j08011lietkevadem {
	public static HashMap<String, Integer> sortByValue(HashMap<String, Integer> hm)
    {
        List<Map.Entry<String, Integer> > list =
               new LinkedList<Map.Entry<String, Integer> >(hm.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<String, Integer> >() {
            public int compare(Map.Entry<String, Integer> o1, 
                               Map.Entry<String, Integer> o2)
            {
                if (o1.getValue()<o2.getValue()) return 1;
                else if(o1.getValue()>o2.getValue()) return -1;
                else {
                	return o1.getKey().compareTo(o2.getKey());
                }
            }
        });
         
        HashMap<String, Integer> temp = new LinkedHashMap<String, Integer>();
        for (Map.Entry<String, Integer> aa : list) {
            temp.put(aa.getKey(), aa.getValue());
        }
        return temp;
    }
	public static Boolean check(String s) {
		int n = s.length();
		for(int i=1;i<n;i++) {
			if((s.charAt(i)-'0')<(s.charAt(i-1)-'0')) return false;
		}
		return true;
	}
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(System.in);
		HashMap<String, Integer> lkm = new HashMap<>();
		int h=0;
		while(sc.hasNext()) {
			String s = sc.next();
			if(check(s)) {
				if(lkm.get(s)==null) lkm.put(s, 1);
				else lkm.put(s, lkm.get(s)+1);
			}
		}
		lkm = sortByValue(lkm);
		for(String x: lkm.keySet()) {
			System.out.println(x+" "+lkm.get(x));
		}
	}
}
