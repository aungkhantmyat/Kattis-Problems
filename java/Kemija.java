import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 *
 * @author KAN KAUNG AUNG
 */
public class IcpcTesting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      Scanner d=new Scanner(System.in);
      StringBuilder ans=new StringBuilder();
      String x[]=d.nextLine().split("");
      List ss=Arrays.asList(x);
     ArrayList s=new ArrayList();
     s.addAll(ss);
      ArrayList data=new ArrayList();
      data.add("a");data.add("e");data.add("i");data.add("o");data.add("u");
      for(int i=0;i<s.size();i++){
          if(data.contains(s.get(i))&& i!=s.size()-1){
             s.set(i+1, "#");
              s.set(i+2, "#");
             
          }
         
      }
      for(Object f:s){
          if(!f.equals("#")){
              ans.append(f);
          }
      }
      
        System.out.println(ans);
      
      
             
     }
}
