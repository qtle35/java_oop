package codedevl;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.TreeSet;

class WordSet {
	private TreeSet<String> data = new TreeSet<String>();

	public WordSet(String s) {
		StringTokenizer st = new StringTokenizer(s);
		while (st.hasMoreTokens()) {
			data.add(st.nextToken().toLowerCase());
		}
	}

	public TreeSet<String> getData() {
		return data;
	}

	public String union(WordSet a) {
		TreeSet<String> tmp = new TreeSet<>(data);
		for (String i : a.getData()) {
			tmp.add(i);
		}
		String ans = "";
		for (String i : tmp) {
			ans += i + " ";
		}
		return ans;
	}

	public String intersection(WordSet a) {
		String ans = "";
		for (String i : data) {
			if (a.getData().contains(i)) {
				ans += i + " ";
			}
		}
		return ans;
	}

}

public class j04022wordset {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner in = new Scanner(new File("VANBAN.in"));
		WordSet s1 = new WordSet(in.nextLine());
		WordSet s2 = new WordSet(in.nextLine());
		System.out.println(s1.union(s2));
		System.out.println(s1.intersection(s2));
	}
}
