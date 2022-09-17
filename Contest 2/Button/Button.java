import java.io.*;
import java.util.*;

public class Button {
    public static void main(String args[]){
        int cases; int numButtons; int cookingTime; int[] times;
        Queue<Integer> queue; int[] canCook;
        Scanner sc = new Scanner(System.in);

        cases = sc.nextInt();

        for(int i=0;i<cases;i++){
            numButtons = sc.nextInt(); cookingTime = sc.nextInt();
            times = new int[cookingTime];

            for(int j = 0 ; j < numButtons ; j++){
                times[j]=sc.nextInt();
            }

            queue = new LinkedList<>();
            canCook = new int[3601];

            for(int j = 0 ; j < 3601 ; j++){
                canCook[j]=Integer.MAX_VALUE;
            }

            canCook[0] = 0;
            queue.add(0);

            while(!queue.isEmpty()){
                int first = queue.remove();
                int able = canCook[first];
                for(int j=0;j<numButtons;j++){
                    int count = first+times[j];
                    count = Math.max(0, Math.min(3600,count));
                    if(canCook[count]>(able+1)){
                    canCook[count]=able+1;
                        queue.add(count);
                    }
                }
            }

            for(int j=cookingTime;j<=3600;j++){
                if(canCook[j]!=Integer.MAX_VALUE){
                    System.out.println(canCook[j]+" "+ (j-cookingTime));
                    break;
                }
            }
        }
    }
}