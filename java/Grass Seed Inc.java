import java.text.DecimalFormat;
import java.util.Scanner;


public class grassSeedInc {
    public static void main(String[] args) {
        
         Scanner d=new Scanner(System.in);
           StringBuilder ans=new StringBuilder();
             DecimalFormat df = new DecimalFormat("#.0000000");
        double c=d.nextDouble();
          int l=d.nextInt();
          double out=0;
          for(int i=0;i<l;i++){
              double w=d.nextDouble();
                double h=d.nextDouble();
                out+=(w*h)*c;
          }
          System.out.println(df.format(out));
    }
}
