package codedevl;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class j07012thongketukhacnhautrongfilenhiphan {
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
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		ObjectInputStream input = new ObjectInputStream(new FileInputStream("DATA.in"));
		ArrayList<String> l = (ArrayList<String>) input.readObject();
//		ArrayList<String> l = new ArrayList<>();
//		l.add("PTIT duy tri hoc phi on dinh nam 2019 va khong tang trong nam 2020-2021 va 2021-2022!");
		Pattern p = Pattern.compile("[a-zA-Z0-9]+");
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		for(String x: l) {
			x = x.toLowerCase();
			Matcher m = p.matcher(x);
			while(m.find()) {
				String temp = m.group();
				if(hm.get(temp)==null) hm.put(temp, 1);
				else hm.put(temp, hm.get(temp)+1);
			}
		}
		hm  = sortByValue(hm);
		for(String x:hm.keySet()) System.out.println(x +" "+hm.get(x));
	}
}
