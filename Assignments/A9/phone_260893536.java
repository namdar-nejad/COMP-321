import java.util.*;
import java.lang.*;

public class phone{
    public static void main(String[] args) {
        int cases; int numNumbers; ArrayList<String> numberList; boolean correct;

        Scanner sc = new Scanner(System.in);
        cases = sc.nextInt();

        // System.out.println("Cases: " + cases);

        for(int i=0; i<cases; i++){
            numNumbers = sc.nextInt(); correct = true;

            // System.out.println("numNumbers: " + numNumbers);

            numberList = new ArrayList<String>(numNumbers);
            sc.nextLine();
            for (int j = 0; j<numNumbers; j++){
                numberList.add(sc.nextLine());
            }

            // for (int j = 0; j<numNumbers; j++){
            //     System.out.println(j + ": " + numberList.get(j));
            // }

            Collections.sort(numberList);

            // for (int j = 0; j<numNumbers; j++){
            //     System.out.println(j + ": " + numberList.get(j));
            // }  
            
            for (int m=0; m<(numberList.size()-1); m++){
                if ((numberList.get(m+1)).startsWith(numberList.get(m))){
                    correct = false;
                    break;
                }
            }
            
            if (!correct)System.out.println("NO");
            else System.out.println("YES");
        }
    }
}