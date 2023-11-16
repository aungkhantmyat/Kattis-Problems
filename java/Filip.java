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
      
       
     String x=d.next();
     String y=d.next();
     String x1="",y1="";
      for(int i=x.length()-1;i>=0;i--){
         
         x1+=x.charAt(i);
         y1+=y.charAt(i);
       
      }
      if(Integer.parseInt(x1)>Integer.parseInt(y1)){
          System.out.println(x1);
      }else{
          System.out.println(y1);
      }
        
       
    

      
       
       
 
}
}
