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
  float out=0;
  for(int i=0;i<n;i++){
      float q=d.nextFloat();
      float y=d.nextFloat();
      out+=q*y;
     
     
  }
  String pattern = ".###";
DecimalFormat decimalFormat = new DecimalFormat(pattern);
System.out.println(decimalFormat.format(out));
  
  
        
     }

   
    
   
    
}
