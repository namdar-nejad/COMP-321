import java.util.*;
import java.lang.*;

public class Doorman{
	public static void main(String[] args){
		int max; String line; boolean pass;
		int ppl_in = 0; int men = 0; int women = 0;
		Scanner sc = new Scanner(System.in);

		max = sc.nextInt();
		line = sc.next();

		//System.out.println(max + "\n" + line);

        if(line.length() > 0 && line.charAt(0) == 'M'){
        	line = line.substring(1);
        	ppl_in++;men++;
        }
        else if(line.length() > 0 && line.charAt(0) == 'W'){
			line = line.substring(1);
			ppl_in++;women++;
		}

		while(line.length() > 0){
			pass = false;
			if(Math.abs(men-women+1)<=max){
				if(line.charAt(0) == 'M'){
					line = line.substring(1);
					ppl_in++; men++; pass = true;
				}
				else if(line.length() > 1 && line.charAt(1) == 'M'){
					line = 'W' + line.substring(2);
					ppl_in++; men++; pass = true;
				}
        	}
        	if(!pass && Math.abs(men-women-1)<=max){
        		if(line.charAt(0) == 'W'){
        			line = line.substring(1);
					ppl_in++; women++; pass = true;
        		}
        		else if(line.length() > 1 && line.charAt(1) == 'W'){
        			line = 'M' + line.substring(2);
					ppl_in++; women++; pass = true;
        		}
        	}
        	if(!pass) break;
		}

		System.out.println(ppl_in);
	}
}

