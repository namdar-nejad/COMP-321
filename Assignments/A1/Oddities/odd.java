import java.util.*;

public class odd{
     public static void main(String []args){
        int num = 0;
        Scanner sc=new Scanner(System.in);
        sc.nextInt();
        while (sc.hasNext()) {
            num = sc.nextInt(); 
        if((num % 2) == 0) System.out.println(num + " is even");
                else System.out.println(num + " is odd");
        }
        sc.close();
     }
}
