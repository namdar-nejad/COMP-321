import java.lang.*;
import java.util.*;


public class Spread{
	public static void main(String[] args){
		int n;
		int a; int b;
		int val1; int val2;
		int cur_spread; int cur_add;
		int print1; int print2;
		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();

		for(int i=0;i<n;i++){
			a = sc.nextInt();
			b = sc.nextInt();

			val1 = (a+b)/2;
        	val2 = a-val1;
        	cur_spread = Math.abs(val1 - val2);
        	cur_add = val1 + val2;

		 	if (val1 >= 0 && val2 >= 0 && cur_spread == b && cur_add == a){
		 		print1 = Math.max(val1, val2);
		 		print2 = Math.min(val1, val2);
		 		System.out.println(print1+" "+print2);
		 	}
        	else{
        		System.out.println("impossible");
        	}
		}
	}
}