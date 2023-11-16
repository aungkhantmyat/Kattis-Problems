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
      
    int x=Integer.parseInt(d.nextLine());
    int ans=0;
     for(int i=0;i<x;i++){
         String aa=d.next();
         double p=Integer.parseInt(aa.substring(aa.length()-1));
         double n=Integer.parseInt(aa.substring(0,aa.length()-1));
        
         ans+=(int)Math.pow(n, p);
     } 
        System.out.println(ans);
 
}
}
