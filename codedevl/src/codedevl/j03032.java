package codedevl;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class j03032 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);     
        int t=sc.nextInt();
        sc.nextLine();
        while(t-->0) {
        	String s=sc.nextLine();
        	String[] s1=s.split(" ");
        	for(int i=0;i<s1.length;i++) {
        		StringBuffer re=new StringBuffer(s1[i]);
        		System.out.print(re.reverse()+" ");
        	}
        	System.out.println();
        }
    }
}
