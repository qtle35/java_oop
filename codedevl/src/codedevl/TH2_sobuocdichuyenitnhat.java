package codedevl;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class TH2_sobuocdichuyenitnhat {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
			int m =sc.nextInt(), n = sc.nextInt();
			int[][] a = new int[m+5][n+5];
			int[][] kq = new int[m+5][n+5];
			for(int i=1;i<=m;i++) {
				for(int j=1;j<=n;j++) {
					a[i][j] = sc.nextInt();
					kq[i][j] = -1;
				}
			}
			Queue<Pair<Integer, Integer> > q = new LinkedList<>();
			q.add(new Pair<>(1,1));
			kq[1][1]=0;
			while(!q.isEmpty()) {
				int x = q.peek().getFirst();
				int y = q.peek().getSecond();
				q.poll();
				int duoi = Math.abs(a[x+1][y] - a[x][y]), phai = Math.abs(a[x][y+1]-a[x][y]);
				int cheo = Math.abs(a[x+1][y+1]-a[x][y]);
				if(x + duoi <=m && kq[x+duoi][y]==-1) {
					kq[x+duoi][y] = kq[x][y] + 1;
					q.add(new Pair<>(x+duoi,y));
				}
				if(y + phai <=n && kq[x][y+phai]==-1) {
					kq[x][y+phai] = kq[x][y] + 1;
					q.add(new Pair<>(x,y+phai));
				}
				if(x + cheo <=m && y+ cheo <=n && kq[x+cheo][y+cheo]==-1 ) {
					kq[x+cheo][y+ cheo] = kq[x][y] + 1;
					q.add(new Pair<>(x+cheo,y+ cheo));
				}
				if(kq[m][n]!=-1) {
					System.out.println(kq[m][n]);
					break;
				}
			}
			if(kq[m][n]==-1) System.out.println("-1");
		}
	}
}
