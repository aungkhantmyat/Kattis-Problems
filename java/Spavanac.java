
import java.util.Scanner;

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
      
      int m=d.nextInt();
        int s=d.nextInt();
        int di=s-45;
        if(di<0){
            if(m==0){
                System.out.println(23+" "+(60+di));
            }else{
                 System.out.println((m-1)+" "+(60+di));
            }
        }else{
             System.out.println(m+" "+di);
        }
    
        
    }
    
}
