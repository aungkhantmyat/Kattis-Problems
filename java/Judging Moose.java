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
   
   StringBuilder ans = new StringBuilder();
   int l=d.nextInt();int r=d.nextInt();
   if(l==0 && r==0){
      ans.append("Not a moose");
  }
 else if(l-r==0){
      ans.append("Even "+(l+r));
  }
  else{
        int m=Math.max(l, r);
       ans.append("Odd "+(m*2));
 
    }
  
        System.out.println(ans);
             
     }
   
    
}
