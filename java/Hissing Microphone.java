
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
      
         boolean flag =false;
      String x=d.next();
      for(int i=0;i<x.length()-1;i++){
        
          if(x.substring(i, i+2).equals("ss")){
             flag = true;
             break;
          }
      }
       if(flag){
           System.out.println("hiss"); 
       }else{
           System.out.println("no hiss"); 
       }
       
    

      
       
       
 
}
}
