import java.util.*;

public class freefood {
    public static void main(String[] args) {
        Scanner d=new Scanner(System.in);
           StringBuilder ans=new StringBuilder();
             List<Boolean> days = new ArrayList();
             for(int k=0;k<365;k++){
                 days.add(false);
             }
      
        int n=d.nextInt();
        for(int i=0;i<n;i++){
            int s=d.nextInt();
            int t=d.nextInt();
            for(int j=(s-1);j<=(t-1);j++){
                days.set(j,true);
            }
        }
        System.out.println(Collections.frequency(days,true));
    }
}
