import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author KAN KAUNG AUNG
 */
public class cevrta {
    public static void main(String[] args) {
         Scanner d=new Scanner(System.in);
        int x1=d.nextInt();int y1=d.nextInt();
        int x2=d.nextInt();int y2=d.nextInt();
        int x3=d.nextInt();int y3=d.nextInt();
        int x4=0;
        if(x1==x2){
            x4=x3;
        }else if(x1==x3){
             x4=x2;
        }else if(x2==x3){
             x4=x1;
        }
        else{
             x4=x1;
        }
         int y4=0;
          if(y1==y2){
            y4=y3;
        }else if(y1==y3){
             y4=y2;
        }else if(y2==y3){
             y4=y1;
        }
        else{
             y4=y1;
        }
         
        System.out.println(x4+" "+y4);

      
                  
    }

   
}
