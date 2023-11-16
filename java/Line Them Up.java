import java.util.*;

public class lineThemUp {
    public static void main(String[] args) {
         Scanner d=new Scanner(System.in);
           StringBuilder ans=new StringBuilder();
           int n=d.nextInt(); 
           List<String> org = new ArrayList();
            List<String>inc= new ArrayList();
           List<String> dec = new ArrayList();
            for(int j=0;j<n;j++){
             org.add(d.next());
         }
             inc.addAll(org);
           Collections.sort(inc);
           dec.addAll(inc);
           Collections.reverse(dec);
           if(org.equals(inc)){
              ans.append("INCREASING");
           }else if(org.equals(dec)){
                 ans.append("DECREASING");
           }else{
                 ans.append("NEITHER");
           }
           System.out.println(ans);
    }
}
