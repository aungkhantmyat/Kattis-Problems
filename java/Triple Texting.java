import java.util.*;

public class tripleTexting {
    public static void main(String[] args) {
     Scanner d=new Scanner(System.in);
       StringBuilder ans=new StringBuilder();
      String s=d.next();
      int sl=s.length()/3;
        List<String> ar=new ArrayList();
      for(int i=0;i<s.length();i+=sl){
          ar.add(s.substring(i, (i+sl)));
         
      }
      boolean alert=false;
        for(int j=0;j<3;j++){
            for(int k=j+1;k<3;k++){
                if(ar.get(j).equals(ar.get(k))){
                    ans.append(ar.get(j));
                    alert=true;
                    break; 
                 
                }
            }
            if(alert){break;}
        }
        System.out.println(ans);
    }
}
