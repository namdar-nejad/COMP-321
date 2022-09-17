import java.io.*;
import java.util.*;

public class Peragrams {
    public static void main(String[] args) {
        String input; String curSubstring;
        ArrayList<String> buffer = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        input = sc.next();

        for(int i=0;i<input.length(); i++){
            curSubstring = input.substring(i , i + 1);
            if(! buffer.contains(curSubstring)){
                buffer.add(curSubstring);
            }
            else{
                buffer.remove(buffer.indexOf(curSubstring));
            }
        }

        if(buffer.size() != 0) System.out.println(buffer.size() - 1);
        else System.out.println(0);
    }
}