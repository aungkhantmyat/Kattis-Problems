import java.util.Scanner;

/**
 *
 * @author KAN KAUNG AUNG
 */
public class volim {
    public static void main(String[] args) {
          Scanner d=new Scanner(System.in);
           StringBuilder ans=new StringBuilder();
           int k=d.nextInt();
           int  n=d.nextInt(),t=0;
           d.nextLine();
           for(int i=0;i<n;i++){
           String tz[]=d.nextLine().split(" ");
           t+=Integer.parseInt(tz[0]);
           if(t>210){
               break;
           }
           if(!tz[1].equals("T")){
               continue;
           }
           k++;
            
           }
           int out=(k%8==0)?8:k%8;
           System.out.println(out);
    }
}
