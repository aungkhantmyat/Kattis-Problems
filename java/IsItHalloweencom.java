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
      
    if((x.equals("DEC") && y.equals("25"))||(x.equals("OCT") && y.equals("31"))){
       System.out.println("yup");
        
    }else{
       System.out.println("nope"); 
    }

      
       
       
 
}
}
