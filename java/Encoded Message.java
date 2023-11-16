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
    
     int n=Integer.parseInt(d.nextLine());
     for(int i=0;i<n;i++){
         String ss[]=d.nextLine().split("");
         int si=(int) Math.sqrt(ss.length);
         String o[][]=new String[si][si];
          String ne[][]=new String[si][si];
          int count = 0;
          for(int j=0;j<si;j++){
              for(int k=0;k<si;k++){
                  o[j][k]=ss[count];
                  count++;
                  
              }
          }
          for(int j=0;j<si;j++){
              for(int k=0;k<si;k++){
                  ne[si-k-1][j]=o[j][k];
              }
          }
       
          for(int j=0;j<si;j++){
              for(int k=0;k<si;k++){
                  ans.append(ne[j][k]);
                 
              }
          }
          //
          ans.append("\n");
    }
    
      
        System.out.println(ans);
      
             
     }
   
    
}
