import java.util.*;

public class symmetricOrder {
    public static void main(String[] args) {
        Scanner d=new Scanner(System.in);
           StringBuilder ans=new StringBuilder();
         double n=d.nextDouble();
         int count=0;
           do{
               count++;
                List<String> ar=new ArrayList();
                for(int j=0;j<n;j++){ ar.add("");}
              
                for(int i=0;i<(int)Math.ceil(n/2);i++){
                
                   String s1=d.next();
                   ar.set((0+i),s1 );
                    
                   if(i==(((int)Math.ceil(n/2))-1)&& ar.size()%2!=0){
                       break;
                   }else{
                     String s2=d.next();
                   ar.set((ar.size()-1)-i,s2);
                    
                }
                   
                }
               ans.append("SET "+count+"\n");
                for(int k=0;k<ar.size();k++){
                    ans.append(ar.get(k)+"\n");
                }
               n=d.nextInt();
           }while(n!=0);
            ans.setLength(ans.length() - 1);
        System.out.println(ans);
       
    }
}
