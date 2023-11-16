
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
  
  int count=0;  
      for(int i=0;i<t;i++){
         
        int dd=d.nextInt();
        if(dd<0){
            count++;
        }
      }
     
        System.out.println(count);
       
    }
}
