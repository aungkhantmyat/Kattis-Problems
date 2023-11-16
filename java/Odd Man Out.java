import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
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
   int n=d.nextInt();
   StringBuilder ans = new StringBuilder();
   for(int k=0;k<n;k++){
        Queue<Integer> q = new LinkedList<>(); 
        int a=d.nextInt();
        for(int j=0;j<a;j++){
            int aa=d.nextInt();
            if(q.contains(aa)){
                q.remove(aa);
            }else{
                q.add(aa);
            }
           
        }
   ans.append("Case #"+(k+1)+": "+q.peek()+"\n");

        q.clear();
        
   }
        System.out.println(ans);
             
     }
   
    
}
