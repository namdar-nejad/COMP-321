import java.util.*;

public class EngWords{
	public static void main(String[] args){
		Hashtable<String, String> ht = new Hashtable<>();
		Scanner sc = new Scanner(System.in);
		int i = 0;
		while(sc.hasNext()){
			String line = sc.nextLine();
			String[] words = line.split(" ");
			for(String a: words){
				String st = a.toLowerCase();
				if(ht.get(st) == null){
 					ht.put(st, st);
 					if (i == 0){
 						i++;
 						System.out.print(a);
 					}
 					else{
 						System.out.print(" "+a);
 					}
 				}
 				else{
 					if (i == 0){
 						i++;
 						System.out.print(".");
 					}
 					else{
 						System.out.print(" .");
 					}
 				}
			}
		}
	}
}