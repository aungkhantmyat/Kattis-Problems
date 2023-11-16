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
   String out="";
   String str=d.next();
      for(int i=0;i<str.length();i++){
          if(str.charAt(i)>=65 && str.charAt(i)<=90){
              out+=str.charAt(i);
          }
      }
        System.out.println(out);
 
 
    
     
     
     
 
  
  
        
     }

   
    
   
    
}
