import java.io.*;
import java.util.*;

public class Moscow {
    public static void main(String[] args){
    	int a; int b; int c; int n;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt(); b = sc.nextInt();
        c = sc.nextInt(); n = sc.nextInt();
        if(a > 0 && b > 0 && c > 0 && n >= 3 && a + b + c >= n) System.out.println("YES");
        else System.out.println("NO");
    }
}