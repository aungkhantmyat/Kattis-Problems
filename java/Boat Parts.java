import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author KAN KAUNG AUNG
 */
public class boatparts {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
    String[] line = sc.nextLine().split(" ");
    int parts = Integer.parseInt(line[0]);
    int days = Integer.parseInt(line[1]);
    HashSet<String> hs = new HashSet<>();
    for (int i = 0; i < days; i++) {
      String currLn = sc.nextLine();
      hs.add(currLn);
      if (hs.size() == parts) {
        System.out.println(i + 1);
        break;
      }
      if(i == days-1){
        System.out.println("paradox avoided");
      }
    }
//    Iterator<String> i = hs.iterator(); 
//        while (i.hasNext()) 
//            System.out.println(i.next()); 
//        System.out.println("size::"+hs.size());
    }
    
}