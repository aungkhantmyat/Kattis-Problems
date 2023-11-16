import java.util.*;

public class kafkaesque {
    public static void main(String[] args) {
         Scanner d=new Scanner(System.in);
           StringBuilder ans=new StringBuilder();
           int k=d.nextInt();
             ArrayList<Integer> ar= new ArrayList();
              ArrayList<Integer> sa= new ArrayList();
           for(int i=0;i<k;i++){
               ar.add(d.nextInt());
           }
           sa.addAll(ar);
           Collections.sort(sa);
           int count=0;
           while(ar.size()!=0){
               for(int j=0;j<k;j++){
                   if(!ar.contains(sa.get(j))){
                       continue;
                   }else if(ar.indexOf(sa.get(j))==0){
                       ar.remove(Integer.valueOf(sa.get(j)));
                   }
               }
             
               count++;
           }
           System.out.println(count);
           
    }
}
