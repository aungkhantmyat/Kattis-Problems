import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author KAN KAUNG AUNG
 */
public class gerrymandering {
    public static void main(String[] args) {
         Scanner d=new Scanner(System.in);
            DecimalFormat df = new DecimalFormat("0.0000000000");
           StringBuilder ans=new StringBuilder();
           int p=d.nextInt();
            int di=d.nextInt();
            ArrayList<Integer> var = new ArrayList() ;
            ArrayList<Integer> vbr = new ArrayList() ;
            for (int i = 0; i < di; i++) {
  var.add(0);vbr.add(0);
}
        
            int tv=0;
            for(int i=0;i<p;i++){
                int dd=d.nextInt();
                int va=d.nextInt();
                int vb=d.nextInt();
              
                   var.set((dd-1),(var.get(dd-1)+va) );
                   vbr.set((dd-1),(vbr.get(dd-1)+vb) );  
                   
          
                tv+=va+vb;
               
            }
           
            int wa=0,wb=0;
            for(int j=0;j<di;j++){
                if(var.get(j)>vbr.get(j)){
                  
                    int wbb=vbr.get(j);
                    int waa=(int)(var.get(j)-(Math.floor((var.get(j)+vbr.get(j))/2)+1));
                    ans.append("A "+waa+" "+wbb+"\n");
                    wa+=waa;wb+=wbb;
                }else{
                   
                    int waa=var.get(j);
                    int wbb=(int)(vbr.get(j)-(Math.floor((var.get(j)+vbr.get(j))/2)+1));
                    ans.append("B "+waa+" "+wbb+"\n");
                    wa+=waa;wb+=wbb;
                }
            }
          
           double g=Math.abs(Double.valueOf(wa-wb)/Double.valueOf(tv));
           ans.append(df.format(g));
           System.out.println(ans);
    }
}
