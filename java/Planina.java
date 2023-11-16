import java.util.Scanner;

public class planina {
    public static void main(String[] args) {
         Scanner d=new Scanner(System.in);
           StringBuilder ans=new StringBuilder();
           int n=d.nextInt();
           int a=1,b=2,o=0;
           if(n==1){
               int t=a+b;
               o=t*t;
           }else{
               for(int i=1;i<n;i++){
                   a=a+b;b=(int)Math.pow(2, i);
                   int t=a+b;
               o=t*t;
                 
               }
           }
           System.out.println(o);
    }
}
