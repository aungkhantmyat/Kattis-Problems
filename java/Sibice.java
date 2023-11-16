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
  int w=d.nextInt();
  int h=d.nextInt();
  int dia=(int) Math.sqrt(((w*w)+(h*h)));
     StringBuilder str = new StringBuilder(); 
  for(int i=0;i<n;i++){
  if(d.nextInt()<=dia){
      str.append("DA"+"\n");
  }else{
       str.append("NE"+"\n");
  }
  }
        System.out.println(str.deleteCharAt(str.length()-1));  
     }
}
   
 