import java.util.*;

public class Planina {
    public static void main(String[] args) {
    	int i; int rtn=2;
        Scanner sc = new Scanner(System.in);
        i = sc.nextInt();
        for(;i>0;i--){
        	rtn *= 2;
        	rtn--;
        }
        System.out.println(rtn*rtn);
    }
}