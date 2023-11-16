import java.text.DecimalFormat;
import java.util.*;


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
  int n=d.nextInt();
  double sum=0,count=0;
 
     StringBuilder str = new StringBuilder(); 
  for(int i=0;i<n;i++){
 double b=d.nextDouble();
 if(b!=-1){
     sum+=b;
     count++;
 }
  }
        System.out.println(sum/count);  
     }
}
   
