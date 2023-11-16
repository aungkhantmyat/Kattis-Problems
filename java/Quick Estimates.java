import java.util.Scanner;

/**
 *
 * @author KAN KAUNG AUNG
 */
public class quickEstimates {
    public static void main(String[] args) {
         Scanner d=new Scanner(System.in);
           StringBuilder ans=new StringBuilder();
            int n=d.nextInt();
            for(int i=0;i<n;i++){
                int di=d.next().split("").length;
                ans.append(di+"\n");
              
            }
             ans.setLength(ans.length() - 1);
            System.out.println(ans);
           
        
    }
}
