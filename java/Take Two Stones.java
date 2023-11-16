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
      int x=d.nextInt();
     if(x%2==0){
         System.out.println("Bob");
     }else{
          System.out.println("Alice");
     }
        
    }
    
}
