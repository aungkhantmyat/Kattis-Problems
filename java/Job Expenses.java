import java.util.Scanner;

/**
 *
 * @author KAN KAUNG AUNG
 */
public class jobExpense {
    public static void main(String[] args) {
         Scanner d=new Scanner(System.in);
           StringBuilder ans=new StringBuilder();
           int n=d.nextInt(),ex=0;
           for(int i=0;i<n;i++){
               int k=d.nextInt();
               if(k<0){
                 ex+=Math.abs(k);
               }
           }
           System.out.println(ex);
    }
}
