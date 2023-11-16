import java.util.*;

public class luhnChecksumAlgorithm {
    public static void main(String[] args) {
          Scanner d=new Scanner(System.in);
       StringBuilder ans=new StringBuilder();
     int t=d.nextInt();
     for(int i=0;i<t;i++){
         String s=d.next();
         String ar[]=s.split("");
         List<String> l = Arrays.asList(ar);          
         Collections.reverse(l);
         int sum=0;
        
         for(int j=1;j<=l.size();j++){
              int tt=Integer.parseInt(l.get(j-1));
             if(j%2==0){
                 tt*=2;
             }
             if(tt>9){
                 tt=Arrays.stream(Integer.toString(tt).split("")).mapToInt(Integer::parseInt).sum();
             }
             sum+=tt;
         }
         
         if(sum%10==0){
             ans.append("PASS\n");
         }else{
             ans.append("FAIL\n");
         }
     }
      ans.setLength(ans.length() - 1);
        System.out.println(ans);
    }
}
