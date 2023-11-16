
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author KAN KAUNG AUNG
 */
public class harshadNumbers {
    public static void main(String[] args) {
        Scanner d=new Scanner(System.in);
           StringBuilder ans=new StringBuilder();
           int dig=d.nextInt();
         for(;harshed(dig);dig++);
         System.out.println(dig);
    }

    private static boolean harshed(int dig) {
        int sum=Arrays.stream(Integer.toString(dig).split("")).mapToInt(Integer::parseInt).sum();
        if(dig%sum==0){
            return false;
        }else{
            return true;
        }
      
    }
}
