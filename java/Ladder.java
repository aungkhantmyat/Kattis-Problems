import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

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
      StringBuilder ans=new StringBuilder();
      int x=d.nextInt();
    int y=d.nextInt();
    int anss=(int)Math.ceil(x/Math.sin(y*Math.PI/180));
            
        System.out.println(anss);
       
 
}
}
