import java.io.*;
import java.util.*;

public class Soda {
    public static void main(String[] args) {
        int emptyStart; int emptyDuring; int reqBottels;
        int totalBottles; int rtn = 0; int bottelsLeft;
        Scanner sc = new Scanner(System.in);

        emptyStart = sc.nextInt();
        emptyDuring = sc.nextInt();
        reqBottels = sc.nextInt();
        
        totalBottles = emptyDuring + emptyStart;
        bottelsLeft = totalBottles - reqBottels;

        while(bottelsLeft >= 0) {
            totalBottles -= reqBottels;
            totalBottles++; rtn++;
            bottelsLeft = totalBottles - reqBottels;
        }

        System.out.println(rtn);
    }
}