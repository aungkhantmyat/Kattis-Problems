import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import static java.util.Map.Entry.comparingByValue;
import java.util.Scanner;
import static java.util.stream.Collectors.toMap;

/**
 *
 * @author KAN KAUNG AUNG
 */
public class stackingCups {
    public static void main(String[] args) {
        Scanner d=new Scanner(System.in);
         StringBuilder str = new StringBuilder(); 
         int n=d.nextInt();
          Map<String, Integer> cup = new HashMap<>();
          d.nextLine();
         for(int i=0;i<n;i++){
             String ss[]=d.nextLine().split(" ");
          if(check(ss[0])){
              cup.put(ss[1], Integer.parseInt(ss[0])); 
              
    }else{
              cup.put(ss[0],(Integer.parseInt(ss[1])*2));
              
          }
         }
          Map<String, Integer> sorted =cup
        .entrySet()
        .stream()
        .sorted(comparingByValue())
        .collect(
            toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e2,
                LinkedHashMap::new));
 
       for (String i : sorted.keySet()) {
  System.out.println(i);
}
 
   
    }

    private static boolean check(String s) {
        
        return s.matches("[+-]?[0-9][0-9]*");
    }
}
