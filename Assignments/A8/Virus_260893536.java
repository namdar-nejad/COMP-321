import java.util.*;
import java.lang.*;

public class Virus{
	public static void main(String args[]){
		String first; String second;
		int start = 0; int end = 0; int i; int j;

		Scanner sc = new Scanner(System.in);
		first = sc.nextLine();
		second = sc.nextLine();

		//System.out.println("First = " + first + "   Second = " + second);

		// Advance from the start of the first string until the point
		// where two chars are diffrent, or the second string ends
		i = 0;
		while(i<first.length() && i < second.length()){
			if(first.charAt(i) != second.charAt(i)){
				start = i;
				break;
			}
			i++;
		}

		j = second.length() - 1;
		i = first.length() - 1;

		// Advance from the end of the first string until the point
		// where two chars are diffrent, or reach the second strings start
		while(i >= 0 && j >= 0){
			if (first.charAt(i) != second.charAt(j)) {
				j--;
				end = j + 1;
				break;
			}
			j--;
			i--;
		}

		// Now start holds the value of the index where the two strings start to differ
		// and end holds the value of the index where the two strings end the diffrance
		if (end - start < 0) System.out.println(0);
		else if (end == 0 && start == 0) System.out.println(Math.max(second.length() - first.length(), 0));
		else System.out.println(end - start + 1);
	}
}