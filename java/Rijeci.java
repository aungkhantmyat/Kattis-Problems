import java.util.Scanner;

public class rijeci {
    public static void main(String[] args) {
          Scanner d=new Scanner(System.in);
       StringBuilder ans=new StringBuilder();
     int k=d.nextInt();
     int a=0,b=1;
    
         for(int i=0;i<(k-1);i++){
             int tt=a;
             a=b;
             b+=tt;
       
     }
        System.out.println(a+" "+b);
    }
}
