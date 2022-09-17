import java.util.*;

public class Trik{
    public static void main(String[] args) {
        int rtn = 1; String chars;
        Scanner sc = new Scanner(System.in);
        chars= sc.next();

        for (int i = 0; i < chars.length(); i++){
            if (chars.charAt(i) == 'A'){
                if(rtn == 1) rtn = 2;
                else if(rtn == 2) rtn = 1;
            }
            if (chars.charAt(i) == 'B'){
                if(rtn == 2) rtn = 3;
                else if(rtn == 3) rtn = 2;
            }
        
            if (chars.charAt(i) == 'C'){
                if(rtn == 1) rtn = 3;
                else if(rtn == 3) rtn = 1;
            }
        }
        
        System.out.println(rtn);
    }
}