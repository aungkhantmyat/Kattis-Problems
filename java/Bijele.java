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
      
       
  int k=d.nextInt();
  ans.append((1-k)+" ");
   int q=d.nextInt();
   ans.append((1-q)+" ");
    int r=d.nextInt();
    ans.append((2-r)+" ");
     int b=d.nextInt(); 
     ans.append((2-b)+" ");
     int kn=d.nextInt();
     ans.append((2-kn)+" ");
     int p=d.nextInt(); 
     ans.append((8-p));
        System.out.println(ans);
             
     }
}
