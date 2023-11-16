import java.util.*;

public class synchronizingLists {
    public static void main(String[] args) {
        Scanner d=new Scanner(System.in);
           StringBuilder ans=new StringBuilder();
           int n=d.nextInt();
           do{
                List<Integer> n1=new ArrayList();
         List<Integer> n2=new ArrayList();
          List<Integer> sn1=new ArrayList();
         List<Integer> sn2=new ArrayList();
               for(int i=0;i<(2*n);i++){
                   int x=0;
                   if(i<n){
                     x=d.nextInt();
                     n1.add(x);sn1.add(x);
                   }else{
                        x=d.nextInt();
                     n2.add(x);sn2.add(x);
                   }
               }
               Collections.sort(sn1); Collections.sort(sn2);
               for(int j=0;j<n1.size();j++){
                   ans.append(sn2.get(sn1.indexOf(n1.get(j)))+"\n");
               }
               ans.append("\n");
               n=d.nextInt();
           }while(n!=0);
           ans.setLength(ans.length() - 1); ans.setLength(ans.length() - 1);
        System.out.println(ans);
    }
}
