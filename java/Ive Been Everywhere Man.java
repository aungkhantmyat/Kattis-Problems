import java.util.ArrayList;
import java.util.Arrays;
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
      int x=d.nextInt();
  ArrayList<String> arr=new ArrayList<String>();
    for(int i=0;i<x;i++){
        int n=d.nextInt();
        
        for(int j=0;j<n;j++){
            arr.add(d.next());
        }
         List<String> gg = arr.stream() 
                                .distinct() 
                                .collect(Collectors.toList()); 
      ans.append(gg.size()+"\n");
             arr.clear();
    }
            
        System.out.println(ans);
       
 
}
}
