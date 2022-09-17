import java.io.*;
import java.util.*;

public class Trainpassengers {
    public static void main(String[] args){
    	long capacity; int stations;
    	long left; long entered; long stayed; int numTrains = 0;
    	boolean possible = true;

        Scanner sc = new Scanner(System.in);

        capacity = sc.nextLong(); stations = sc.nextInt();

		for (int i = 0; i < stations; i++) {
			left = sc.nextLong(); entered = sc.nextLong(); stayed = sc.nextLong();
			
			if (left > numTrains){
				possible = false;
				break;
			}
			
			numTrains += entered - left;
			
			if ( (numTrains != capacity && stayed > 0) ||
				(numTrains > capacity) ||
				(numTrains < 0) || 
				(i == stations - 1 && stayed > 0)){
				possible = false;
				break;
			}
		}

		if (numTrains != 0 || !possible){
			System.out.println("impossible");
		}
		else{
			System.out.println("possible");
		}
    }
}