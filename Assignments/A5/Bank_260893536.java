import java.util.*;
import java.lang.*;

public class Bank {
	public static void main(String[] args){
		int total_time; int num_ppl; int cur_time; int cur_money;
		ArrayList<ArrayList<Integer>> ppl;
		Scanner sc = new Scanner(System.in);

		num_ppl = sc.nextInt();
		total_time = sc.nextInt();

		ppl = new ArrayList<ArrayList<Integer>>(total_time);
		for(int i=0;i<total_time;i++) ppl.add(i, new ArrayList<Integer>());

		for(int i=0; i<num_ppl; i++){
			cur_money = sc.nextInt();
			cur_time = sc.nextInt();
			(ppl.get(cur_time)).add(cur_money);
		}
		System.out.println(getOpt(ppl));
	}

	private static int getOpt(ArrayList<ArrayList<Integer>> ppl){
		int final_money = 0; int max;
        ArrayList<Integer> cur_list = new ArrayList<Integer>(ppl.size());
		for(int i=ppl.size()-1; i>= 0; i--){
			max = 0; int k=-1; int j=0;
			for(Integer e : ppl.get(i)){
				cur_list.add(e);
				k=0;
			}
			
			for(Integer e : cur_list){
				if(e > max){
					max = e;
					k = j;
				}
				j++;
			}

			if(k!=-1) cur_list.remove(k);
			final_money += max;
		}
		return final_money;
	}
}