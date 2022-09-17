import java.util.*;

public class erase{
     public static void main(String []args){
        String a, b;
        char first, second;
        int num = 0;
        boolean fail = false;
        
	    Scanner sc = new Scanner(System.in);
	    
	    num = sc.nextInt();
	    num = num % 2;
        a = sc.next();
        b = sc.next();
        sc.close();
        
        if(num == 0){   // if num=0, N is even, then the bits have to match
            if (a.equals(b)) System.out.println("Deletion succeeded");
            else System.out.println("Deletion failed");
        }
        else{           // if num=1, N is odd, then the bits have to be the opposite
            for(int i=0; i<a.length(); i++){
            first = a.charAt(i);
            second = b.charAt(i);
            if(first == second){
                fail = true;
                break;
                }
            }
            if(fail) System.out.println("Deletion failed");
            else System.out.println("Deletion succeeded");
        }
     }
}