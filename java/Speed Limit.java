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
    
  //   int n=Integer.parseInt(d.nextLine());
  int n=0;
  n=d.nextInt();
     while(n!=-1){
        int total=0,tmp=0;
     for(int i=0;i<n;i++){
         int s=d.nextInt();
         int t=d.nextInt();
         if(i==0){
             total+=s*t;
         }else{
             total+=s*(t-tmp);
         }
         tmp=t;
         
    }
     ans.append(total+" miles\n");
      n=d.nextInt();
      
     }
    
      
        System.out.println(ans);
      
             
     }
   
    
}
