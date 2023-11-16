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
     int t=d.nextInt();
     for(int i=0;i<t;i++){
         int a=d.nextInt();
          int b=d.nextInt();
           int c=d.nextInt();
           if((add(a,b)==c)||(sub(a,b)==c)||(mul(a,b)==c)||(sub(b,a)==c)||(div(a,b)==(double)c)||(div(b,a)==(double)c)){
               ans.append("Possible");
           }else{
               ans.append("Impossible");
           }
           ans.append("\n");
         
     }
        System.out.println(ans);
      
      
             
     }
    public static int  add(int a,int b){
        return a+b;
    }
    public  static int sub(int a,int b){
        return a-b;
    }
    public static int mul(int a,int b){
        return a*b;
    }
    public static double div(int a,int b){
        
        return (double)a/(double)b;
    }
    
}
