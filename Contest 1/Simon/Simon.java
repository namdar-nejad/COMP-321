import java.util.*;

public class Simon{
  public static void main(String[] args) {
    int i; String pattern = "Simon says "; String line;

    Scanner sc = new Scanner(System.in);
    i = sc.nextInt();
    sc.nextLine();

    for (int j = 0; j < i; j++) {
      line = sc.nextLine();
      if(line.startsWith(pattern)) System.out.println(line.substring(10));
    }
  }
}