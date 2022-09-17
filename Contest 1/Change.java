import java.util.*;
import java.lang.*;

public class Change{
	public static void main(String[] args){
		// Couldn't finish on time //

		final int inf = 2147483647;
		int cases; int totalAmount; int numCoins;
		int[] dp; int[] coins;
		Scanner sc = new Scanner(System.in);
		cases = sc.nextInt();

		for(;cases>0; cases--){
			totalAmount = sc.nextInt();
			numCoins = sc.nextInt();
			coins = new int[numCoins];
			for(int i=0; i<numCoins; i++){
				coins[i] = sc.nextInt();
			}

			dp = new int[30001];
			dp[0] = 0;
			for(int i=1; i<3001; i++){
				dp[i] = inf;
			}

			for(int c : coins){
				for(int i = 30001-c-1; i>=0; i--){
					if(dp[i] < inf){
						 dp[i+c] = Math.min(dp[i+c], dp[i]+1);
					}
				}
			}
			int rtn = inf;
			for(int i=0; i<30001; i++){
				if(rtn > dp[i]) rtn = dp[i];
			}

			System.out.println(dp[rtn]+" "+rtn);
		}
	}
}
