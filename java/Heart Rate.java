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
  
 
     StringBuilder str = new StringBuilder(); 
  for(int i=0;i<n;i++){
 double b=d.nextDouble();
 double t=d.nextDouble();
 String pattern = ".0000";
DecimalFormat decimalFormat = new DecimalFormat(pattern);

str.append(decimalFormat.format(((b-1)*60)/t)+" "+decimalFormat.format((b*60)/t)+" "+decimalFormat.format(((b+1)*60)/t)+"\n");
  }
        System.out.println(str.deleteCharAt(str.length()-1));  
     }
}
   
 