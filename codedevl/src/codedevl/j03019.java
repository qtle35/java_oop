package codedevl;

import java.util.*;

public class j03019 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        while(s.length() > 0){
            char c = s.charAt(0);
            for (int i = 0; i < s.length(); i++) {
                if(c < s.charAt(i)) c = s.charAt(i);
            }
            int pos = 0;
            for (int i = 0; i < s.length(); i++) {
                if(c == s.charAt(i)){
                    System.out.print(s.charAt(i));
                    pos = i;
                }   
            }
            s = s.substring(pos+1);
        }
    }
}
