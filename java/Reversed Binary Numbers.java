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
      int x=d.nextInt();
      String binaryStr=Integer.toBinaryString(x);
      
       String dd[]=binaryStr.split("");
   
       List ss = Arrays.asList(dd);
       Collections.reverse(ss);
       String ww="";
       for(Object q:ss){
           ww+=q;
       }
 
      
        System.out.println(Integer.parseInt(ww, 2));
             
     }
}
