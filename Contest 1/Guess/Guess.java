import java.util.*;

public class Guess {
    public static void main(String[] args) {
        int Lower = 1; int Upper = 1000;
        int x = 0;  String answer;

        Scanner sc = new Scanner(System.in);

        // I'm just doing a binery search on numbers from 1 to 1000
        x = (Upper + Lower) / 2;
        System.out.println(x);

        for(int i=0; i<10; i++){
            answer = sc.nextLine();

            if (answer.equals("lower")){
                Upper = x-1;
                x = (Upper+Lower+1) / 2;
            }
            else if (answer.equals("higher")){
                Lower = x+1;
                x = (Upper+Lower) / 2;
            }
            
            else break;
            
            System.out.println(x);
        }
    }
}