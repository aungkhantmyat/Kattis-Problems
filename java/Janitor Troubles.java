import java.util.Scanner;

public class janitorTroubles {
    public static void main(String[] args) {
            Scanner d=new Scanner(System.in);
           StringBuilder ans=new StringBuilder();
        double s1=d.nextDouble();
        double s2=d.nextDouble();
        double s3=d.nextDouble();
        double s4=d.nextDouble();
         double out=janitor(s1,s2,s3,s4);  
         System.out.println(out);
        
    }

    private static double janitor(double a, double b, double c, double d) {
        double sp=(a+b+c+d)/2;
        double out=Math.sqrt((sp-a)*(sp-b)*(sp-c)*(sp-d));
       return out;
    }
}
