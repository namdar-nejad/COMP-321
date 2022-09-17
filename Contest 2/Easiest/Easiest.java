import java.io.*;
import java.util.*;

public class Easiest {
    public static void main(String[] args) {
        char[] digits; int sum; int tempSum = 0;
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();

        while(!(line.equals("0"))){

            sum = getSum(line);
            int x = 11;

            while(true){
                int num = x * Integer.parseInt(line);
                tempSum = getSum(Integer.toString(num));
                if (tempSum == sum) break;
                x++;
            }

            System.out.println(x);
            line = sc.nextLine();
        }
    }

    private static int getSum(String line){
        int sum = 0;
        char[] digits = line.toCharArray();
        for (char c : digits){
            sum += Integer.parseInt(Character.toString(c));
        }
        return sum;
    }
}