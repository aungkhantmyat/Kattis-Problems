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
  int h=d.nextInt();
  int v=d.nextInt();
  ArrayList arr=new ArrayList();
  arr.add(cube(v,h));
   arr.add(cube(n-v,h));
    arr.add(cube(v,n-h));
     arr.add(cube(n-v,n-h));
Collections.sort(arr);
        System.out.println(arr.get(3));
        
     }

    public static int cube(int v,int h){
       int d=4;
       
        return (h*v*d);
    }
    
   
    
}
