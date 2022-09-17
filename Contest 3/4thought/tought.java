import java.io.*;
import java.util.*;

public class thought {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();

        for(int i = 0; i<cases; i++){
            test(sc.nextInt());
        }
    }

    // test all possible permutations of primitive oporations that might result in the desired value
    public static void test(int x){
            if(4+4+4/4==x)System.out.println("4 + 4 + 4 / 4 = "+x);
            else if(4+4+4*4==x)System.out.println("4 + 4 + 4 * 4 = "+x);
            else if(4+4+4+4==x)System.out.println("4 + 4 + 4 + 4 = "+x);
            else if(4+4+4-4==x)System.out.println("4 + 4 + 4 - 4 = "+x);
            else if(4+4-4/4==x)System.out.println("4 + 4 - 4 / 4 = "+x);
            else if(4+4-4*4==x)System.out.println("4 + 4 - 4 * 4 = "+x);
            else if(4+4-4+4==x)System.out.println("4 + 4 - 4 + 4 = "+x);
            else if(4+4-4-4==x)System.out.println("4 + 4 - 4 - 4 = "+x);
            else if(4+4*4/4==x)System.out.println("4 + 4 * 4 / 4 = "+x);
            else if(4+4*4*4==x)System.out.println("4 + 4 * 4 * 4 = "+x);
            else if(4+4*4+4==x)System.out.println("4 + 4 * 4 + 4 = "+x);
            else if(4+4*4-4==x)System.out.println("4 + 4 * 4 - 4 = "+x);
            else if(4+4/4/4==x)System.out.println("4 + 4 / 4 / 4 = "+x);
            else if(4+4/4*4==x)System.out.println("4 + 4 / 4 * 4 = "+x);
            else if(4+4/4+4==x)System.out.println("4 + 4 / 4 + 4 = "+x);
            else if(4+4/4-4==x)System.out.println("4 + 4 / 4 - 4 = "+x);
            
            else if(4-4+4/4==x)System.out.println("4 - 4 + 4 / 4 = "+x);
            else if(4-4+4*4==x)System.out.println("4 - 4 + 4 * 4 = "+x);
            else if(4-4+4+4==x)System.out.println("4 - 4 + 4 + 4 = "+x);
            else if(4-4+4-4==x)System.out.println("4 - 4 + 4 - 4 = "+x);
            else if(4-4-4/4==x)System.out.println("4 - 4 - 4 / 4 = "+x);
            else if(4-4-4*4==x)System.out.println("4 - 4 - 4 * 4 = "+x);
            else if(4-4-4+4==x)System.out.println("4 - 4 - 4 + 4 = "+x);
            else if(4-4-4-4==x)System.out.println("4 - 4 - 4 - 4 = "+x);
            else if(4-4*4/4==x)System.out.println("4 - 4 * 4 / 4 = "+x);
            else if(4-4*4*4==x)System.out.println("4 - 4 * 4 * 4 = "+x);
            else if(4-4*4+4==x)System.out.println("4 - 4 * 4 + 4 = "+x);
            else if(4-4*4-4==x)System.out.println("4 - 4 * 4 - 4 = "+x);
            else if(4-4/4/4==x)System.out.println("4 - 4 / 4 / 4 = "+x);
            else if(4-4/4*4==x)System.out.println("4 - 4 / 4 * 4 = "+x);
            else if(4-4/4+4==x)System.out.println("4 - 4 / 4 + 4 = "+x);
            else if(4-4/4-4==x)System.out.println("4 - 4 / 4 - 4 = "+x);
            
            else if(4*4+4/4==x)System.out.println("4 * 4 + 4 / 4 = "+x);
            else if(4*4+4*4==x)System.out.println("4 * 4 + 4 * 4 = "+x);
            else if(4*4+4+4==x)System.out.println("4 * 4 + 4 + 4 = "+x);
            else if(4*4+4-4==x)System.out.println("4 * 4 + 4 - 4 = "+x);
            else if(4*4-4/4==x)System.out.println("4 * 4 - 4 / 4 = "+x);
            else if(4*4-4*4==x)System.out.println("4 * 4 - 4 * 4 = "+x);
            else if(4*4-4+4==x)System.out.println("4 * 4 - 4 + 4 = "+x);
            else if(4*4-4-4==x)System.out.println("4 * 4 - 4 - 4 = "+x);
            else if(4*4*4/4==x)System.out.println("4 * 4 * 4 / 4 = "+x);
            else if(4*4*4*4==x)System.out.println("4 * 4 * 4 * 4 = "+x);
            else if(4*4*4+4==x)System.out.println("4 * 4 * 4 + 4 = "+x);
            else if(4*4*4-4==x)System.out.println("4 * 4 * 4 - 4 = "+x);
            else if(4*4/4/4==x)System.out.println("4 * 4 / 4 / 4 = "+x);
            else if(4*4/4*4==x)System.out.println("4 * 4 / 4 * 4 = "+x);
            else if(4*4/4+4==x)System.out.println("4 * 4 / 4 + 4 = "+x);
            else if(4*4/4-4==x)System.out.println("4 * 4 / 4 - 4 = "+x);
            
            else if(4/4+4/4==x)System.out.println("4 / 4 + 4 / 4 = "+x);
            else if(4/4+4*4==x)System.out.println("4 / 4 + 4 * 4 = "+x);
            else if(4/4+4+4==x)System.out.println("4 / 4 + 4 + 4 = "+x);
            else if(4/4+4-4==x)System.out.println("4 / 4 + 4 - 4 = "+x);
            else if(4/4-4/4==x)System.out.println("4 / 4 - 4 / 4 = "+x);
            else if(4/4-4*4==x)System.out.println("4 / 4 - 4 * 4 = "+x);
            else if(4/4-4+4==x)System.out.println("4 / 4 - 4 + 4 = "+x);
            else if(4/4-4-4==x)System.out.println("4 / 4 - 4 - 4 = "+x);
            else if(4/4*4/4==x)System.out.println("4 / 4 * 4 / 4 = "+x);
            else if(4/4*4*4==x)System.out.println("4 / 4 * 4 * 4 = "+x);
            else if(4/4*4+4==x)System.out.println("4 / 4 * 4 + 4 = "+x);
            else if(4/4*4-4==x)System.out.println("4 / 4 * 4 - 4 = "+x);
            else if(4/4/4/4==x)System.out.println("4 / 4 / 4 / 4 = "+x);
            else if(4/4/4*4==x)System.out.println("4 / 4 / 4 * 4 = "+x);
            else if(4/4/4+4==x)System.out.println("4 / 4 / 4 + 4 = "+x);
            else if(4/4/4-4==x)System.out.println("4 / 4 / 4 - 4 = "+x);
            
            else System.out.println("no solution");
    }
}

// Attention:
// I have used another source to get all the else if cases between line 16 to 81, the rest is my code.