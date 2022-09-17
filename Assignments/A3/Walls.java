import java.util.*;
import java.lang.*;


public class Walls{
	public static void main(String[] args) {
		double l; double w; int n; double r; int max = 0;
		double[] a = new double[2]; double[] b = new double[2];
		double[] c = new double[2]; double[] d = new double[2];
		double[][] locs; int[][] chart;

		Scanner sc=new Scanner(System.in);
		l = sc.nextInt();w = sc.nextInt();
		n = sc.nextInt();r = sc.nextInt();

		//System.out.println("l: "+l +" w: "+w+" n: "+n+" r: "+r);

		locs = new double[n][2];

		for(int i=0; i<n; i++){
			locs[i][0] = sc.nextInt();
			locs[i][1] = sc.nextInt();
		}

		// for(int i=0; i<n; i++){
		// 	System.out.println(locs[i][0] + " " + locs[i][1]);
		// }
		
		a[0] = -l/2; a[1] = 0;
		b[0] = l/2; b[1] = 0;
		c[0] = 0; c[1] = -w/2;
		d[0] = 0; d[1] = w/2;

		chart = new int[5][n+1];

		for(int i=0; i<n+1; i++){
			for(int j=0; j<5; j++) chart[j][i]=0;
		}

		for(int i=0; i<n; i++){
			if(distance(c, locs[i])<=r)
	        {
	            chart[2][i]=1;chart[4][i]++;chart[2][n]++;
	        }
			if(distance(a, locs[i])<=r){
				chart[0][i]=1;chart[4][i]++;chart[0][n]++;
			}
	        if(distance(d, locs[i])<=r)
	        {
	        	chart[3][i]=1;chart[4][i]++;chart[3][n]++;
	        }
	        if(distance(b, locs[i])<=r)
	        {
	            chart[1][i]=1;chart[4][i]++;chart[1][n]++;
	        }
	        if (chart[4][i]>max)max = chart[4][i];
	    }

    	for(int i=0; i<4; i++){
    		if(chart[i][n]==0)
	        {
	            System.out.println("Impossible");
	            System.exit(0);
	        }
    	}

    	if(max==4||max==3||max==1){
	        System.out.println(5-max);
	        System.exit(0);
	    }else{
        for(int i=0; i<n; i++){
            if(chart[4][i]==2){
            	for(int j=i+1; j<n; j++){
                    if(chart[0][i]+chart[0][j]!=0 && chart[1][i]+chart[1][j]!=0 &&
                       chart[2][i]+chart[2][j]!=0 &&chart[3][i]+chart[3][j]!=0)
                    {
                        System.out.println("2");
                        System.exit(0);
                    }
                }
            }
        }
    }
    System.out.println("3");
	}

	private static double distance(double[] a, double[] b){
		return Math.sqrt(Math.pow((a[0]-b[0]), 2)+Math.pow((a[1]-b[1]), 2));
	}
}