import java.util.*;


/**
 *
 * @author KAN KAUNG AUNG
 */
public class licenseToLaunch {
    public static void main(String[] args) {
          Scanner d=new Scanner(System.in);
         StringBuilder str = new StringBuilder(); 
         int n=d.nextInt();
       List<Integer> oo=new ArrayList();
         List<Integer> so=new ArrayList();
         for(int i=0;i<n;i++){
            int g=d.nextInt();
            oo.add(g);so.add(g);
         }
     Collections.sort(so);
     int f=so.get(0);
        
            System.out.println(oo.indexOf(f));
        
        
}
}