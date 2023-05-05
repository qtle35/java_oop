package codedevl;

import java.util.ArrayList;
import java.util.Scanner;

public class TH2_capbantot {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		ArrayList<String> l = new ArrayList<String>();
		for(int i=0;i<n;i++) l.add(sc.next());
		int res=0;
		for(int i=0;i<l.size()-1;i++) {
			for(int j=1;j<=k;j++) {
				if(i+j>=l.size()) break;
				if(l.get(i).length()==l.get(i+j).length()) res++;
			}
		}
		System.out.println(res);
	}
}