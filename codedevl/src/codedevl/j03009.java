package codedevl;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class j03009 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t=sc.nextInt();
		sc.nextLine();
		while(t-->0) {
			String s1=sc.nextLine();
			String s2=sc.nextLine();
			Map<String, Integer> map = new HashMap<String, Integer>();
			String[] s=s1.split("\\s+");
			Arrays.sort(s);
			for(int i=0;i<s.length;i++) {
				if(!s2.contains(s[i])&&map.get(s[i])==null) {
					map.put(s[i], 1);
					System.out.print(s[i]+" ");
				}
			}
			System.out.println();
		}
	}
}
