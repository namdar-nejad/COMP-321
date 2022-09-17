import java.util.*;
import java.lang.*;

public class galary {

	public static void main(String[] args) {

		Scanner stdin = new Scanner(System.in);
		int n = stdin.nextInt();
		int k = stdin.nextInt();
		//System.out.println("n: " + n + " k: "+ k);
		int sum = 0;
		int[][] rooms = new int[n][2];
		int[][][] dp = new int[k+1][n][2];
		initDp(dp, k, n);

		for(int i=0; i<n; i++){
			int a = stdin.nextInt();
			int b = stdin.nextInt();
			
			sum = sum+a+b;
			//System.out.println("a: " + a + " b: "+ b + " sum: "+ sum);
			rooms[n-i-1][0]= a;
			rooms[n-i-1][1]= b;
		}

		int opt = solve(k, n-1, rooms, dp);
		System.out.println(sum - opt);
	}

	public static int solve(int k, int r, int[][] room, int[][][] dp){
		return Math.min(opt(k, r, 0, dp, room),opt(k, r, 1, dp, room));
	}

	public static int opt(int k, int r, int c, int[][][] dp, int[][] room){
		if(k==0) return 0;
		if(r<0) return 1000000;
		if(dp[k][r][c] != -1) return dp[k][r][c];
		int val = room[r][c];
		dp[k][r][c] = Math.min(opt(k-1,r-1,c, dp, room)+val,
			Math.min (opt(k,r-1,0, dp, room),
			opt(k,r-1,1, dp, room)));
		return dp[k][r][c];
	}

	public static void initDp(int[][][] dp, int k, int n){
		for(int i=0;i<k+1;i++){
			for(int j=0;j<n;j++){
				for(int m=0;m<2;m++){
					dp[i][j][m] = -1;
				}
			}
		}
	}
}