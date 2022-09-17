import java.io.*;
import java.util.*;

public class Bing {

    public static void main(String[] args) {
        String line; String[] split;
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        
        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            line = sc.nextLine();
            split = line.split("");

            if(map.containsKey(line)) line = (map.get(line) + "");
            else line = "0";

            System.out.println(line);

            line = "";
            calculate(map, split, line);
        }
    }

    private static void calculate(Map<String, Integer> map, String[] sp, String l){
        for (int j = 0; j < sp.length; j++) {
            l += sp[j];
            
            if (map.containsKey(l)) {
                map.put(l, map.get(l) + 1);
            }
            else {
                map.put(l, 1);
            }
        }
    }
}