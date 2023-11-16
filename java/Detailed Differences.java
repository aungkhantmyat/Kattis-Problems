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
      
       
  int t=d.nextInt();
     String x1="",y1="";
    
      for(int i=0;i<t;i++){
         
          String x=d.next();
             String y=d.next();
             ans.append(x+"\n"+y+"\n");
             for(int j=0;j<y.length();j++){
                 char q = x.charAt(j);
                 char w = y.charAt(j);
                 
                 if(Character.toString(q).equals(Character.toString(w))){
                     ans.append(".");
                 }else{
                     ans.append("*");
                 }
                 
             }
             ans.append("\n\n");
       
      }
     
        System.out.println(ans);
       
    }
}
