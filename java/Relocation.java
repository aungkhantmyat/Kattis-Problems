import java.util.*;

public class relocation {
    public static void main(String[] args) {
          Scanner d=new Scanner(System.in);
           StringBuilder ans=new StringBuilder();
         int n=d.nextInt(); int q=d.nextInt();
          List<Integer> ar = new ArrayList();
         for(int i=0;i<n;i++){
             ar.add(d.nextInt());
         }
         for(int j=0;j<q;j++){
             int a=d.nextInt();
             int c=d.nextInt();
             int x=d.nextInt();
             if(a==1){
               ar.set((c-1), x);
             }else{
                 int temp=Math.abs(ar.get(c-1)-ar.get(x-1));
                 ans.append(temp+"\n");
             }
         }
          ans.setLength(ans.length() - 1);
        System.out.println(ans);
    }
}
