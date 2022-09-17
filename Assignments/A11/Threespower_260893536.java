import java.lang.*;
import java.util.*;
import java.math.*;

public class Threepowers {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger cur_val; ArrayList<BigInteger> powers;
        powers = new ArrayList<>();
        initPowers(powers);

        cur_val = new BigInteger(sc.next());

        while (! cur_val.equals(BigInteger.ZERO)){
            cur_val = cur_val.subtract(BigInteger.ONE);
            String str = toBin(cur_val);
            if (cur_val.equals(BigInteger.ZERO)) str = "";

            printPowers(powers, str);
            cur_val = new BigInteger(sc.next());
        }
    }

    public static void printPowers(ArrayList<BigInteger> powers, String str){
        System.out.print("{ ");
        for (int i = str.length() - 1; i >= 0; i--){
            if (str.charAt(i) == '1'){
                if (i == 0) System.out.print(powers.get(str.length() - i - 1));
                else System.out.print(powers.get(str.length() - i - 1) + ", ");
            }
        }
        System.out.println(" }");
    }

    public static void initPowers(ArrayList<BigInteger> powers){
        BigInteger per = BigInteger.ONE;
        powers.add(BigInteger.ONE);
        for (int i = 1; i < 65; i++) {
            per = powers.get(i - 1);
            powers.add(per.multiply(new BigInteger("3")));
        }
    }

    public static String toBin(BigInteger num) {
        return num.toString(2);
    }
}

