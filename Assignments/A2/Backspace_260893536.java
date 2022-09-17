import java.util.*;

public class Back{
	public static void main(String[] args){
		char c;
		Scanner sc = new Scanner(System.in);
		ArrayList<Character> list = new ArrayList<Character>();
		int a = 0;
		String line = sc.nextLine();

		for(int i=0; i<line.length();i++){
			c = line.charAt(i);
			if(c == '<'){
				a--;
				list.remove(a);
			}
			else{
				list.add(a, c);
				a++;
			}
		}
		StringBuilder builder = new StringBuilder(list.size());
    	for(Character ch: list)
    	{
        	builder.append(ch);
    	}
    	System.out.print(builder.toString());
	}
}