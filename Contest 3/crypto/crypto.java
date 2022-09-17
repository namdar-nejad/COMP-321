import java.io.*;
import java.util.*;

public class crypto {
    public static void main(String[] args){
        long maxZeros = 0; long bestBase = 2;
        long innerNum; long innerZeros; long num;
        Scanner sc = new Scanner(System.in);

        num = sc.nextLong();

        for(long base = num; base >= 2; base--) {
            innerNum = num; innerZeros = 0;

            while (innerNum % base == 0) {
                innerNum /= base;
                innerZeros++;
            }
            if (innerZeros >= maxZeros) {
                maxZeros = innerZeros;
                bestBase = base;
            }
        }

        System.out.println(bestBase);
    }
}