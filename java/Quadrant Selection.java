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
      int y=Integer.parseInt(d.nextLine());
         if(x>=0 && y>=0){
             System.out.println("1");
         }else if(x<0 && y>=0){
              System.out.println("2");
         }else if(x>=0 && y<0){
              System.out.println("4");
         }else{
              System.out.println("3");
         }
    }
 
}
