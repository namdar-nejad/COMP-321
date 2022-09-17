import java.io.*;
import java.util.*;

public class DVDs {
    public static void main(String[] args) throws IOException {
        int cases; int numDvds; int moves; String input;
        Scanner sc = new Scanner(System.in);

        cases = sc.nextInt();

        for(;cases>0; cases--){
            numDvds = sc.nextInt();
            sc.nextLine();
            input = sc.nextLine();

            /* go time exception on second test with this approach */
            //int[] dvds = new int[numDvds];
            // for(int i = 0; i < numDvds; i++){
            //     dvds[i] = sc.nextInt();
            // }

            System.out.println(minMoves(input, numDvds));
        }
    }
}
