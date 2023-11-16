import java.util.Scanner;

/**
 *
 * @author KAN KAUNG AUNG
 */
public class lastFactorialDigit {
    public static void main(String[] args) {
         Scanner d=new Scanner(System.in);
           StringBuilder ans=new StringBuilder();
           int t=d.nextInt();
           for(int i=0;i<t;i++){
               ans.append(lastFactorialD(d.nextInt())+"\n");
           }
           ans.setLength(ans.length() - 1);
            System.out.println(ans);
    }

    private static int lastFactorialD(int n) {
        int f=1;
        for(int i=1;i<=n;i++){
             f=f*i;
             
}
        String ss[]= String.valueOf(f).split("");
       return Integer.valueOf(ss[ss.length-1]);
    }
}
