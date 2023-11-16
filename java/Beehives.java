import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author KAN KAUNG AUNG
 */
public class beehives {
    public static void main(String[] args) {
        Scanner d=new Scanner(System.in);
           StringBuilder ans=new StringBuilder();
          double dd=d.nextDouble();
           int n=d.nextInt();
          do{
             
          ArrayList<Double> x=new ArrayList();
            ArrayList<Double> y=new ArrayList();
                    ArrayList<Integer> v=new ArrayList();
           for(int i=0;i<n;i++){
               x.add(d.nextDouble());
               y.add(d.nextDouble());
               v.add(i);
           }
           int sw=n,so=0;
          for(int j=0;j<n;j++){
               for(int k=j+1;k<n;k++){
                 double dis=Math. sqrt((x.get(k)-x.get(j))*(x.get(k)-x.get(j)) + (y.get(k)-y.get(j))*(y.get(k)-y.get(j)));
                 if(dis<dd){
                     if(v.contains(k)) v.remove(new Integer(k));
                   if(v.contains(j)) v.remove(new Integer(j));
                   }
           }
            }
          sw=v.size();so=n-sw;
           ans.append(so+" sour, "+sw+" sweet\n");
          dd=d.nextDouble();
            n=d.nextInt();
    }while(dd!=0 && n!=0);
            
        ans.setLength(ans.length() - 1);
        System.out.println(ans);
      
}
}
