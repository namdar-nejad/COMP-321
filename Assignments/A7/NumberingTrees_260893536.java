import java.util.*;
import java.lang.*;

public class NumberingTrees {

	public static void main(String[] args){
		int height; String path = "";
		Scanner sc = new Scanner(System.in);
		height = sc.nextInt();

		if (sc.hasNext()) path = sc.next();

		System.out.println(checkTree(height, path));
	}

	private static long checkTree(int height, String path){
		long level = 0; long root;

        root = (long)(Math.pow(2 , height + 1)); root--;
        if(path.equals("") || path == null) return root;
        else{
        	for(char ch: path.toCharArray()){
		        if (ch == 'R') level = (2 * level) + 2;
		        else level = (2 * level) + 1;
        	}
			return (root - level);
		}
	}
}