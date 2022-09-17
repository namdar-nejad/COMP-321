import java.util.*;

public class temp{
     public static void main(String []args){
        int num = 0;
        int temp = 0;
        Scanner sc=new Scanner(System.in);
        sc.nextInt();
        while (sc.hasNext()) {
            temp =  sc.nextInt();
            if (temp < 0) num++;
        }
        sc.close();
        System.out.println(num+"");
     }
}
