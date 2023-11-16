import java.util.*;
import static java.util.Map.*;

public class lostLineup {
    public static void main(String[] args) {
           Scanner d=new Scanner(System.in);
           StringBuilder ans=new StringBuilder();
            Map<Integer,Integer> ma = new HashMap<>();
            int n=d.nextInt();
            for(int i=1;i<n;i++){
                int di=d.nextInt();
                ma.put(di,(i+1));
            }
            ans.append("1 ");
         ma.forEach((k, v) -> {
   ans.append(v+" ");
});
         System.out.println(String.valueOf(ans).trim());

    }
}
