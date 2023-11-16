import java.util.Scanner;

public class drunkVigenre {
    public static void main(String[] args) {
         Scanner d=new Scanner(System.in);
           StringBuilder ans=new StringBuilder();
           String alp="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
           String c=d.next();
           String k=d.next();
           for(int i=0;i<c.length();i++){
              int ci=alp.indexOf(c.charAt(i));
              int ki=alp.indexOf(k.charAt(i));
              int index=0;
               if(!(i%2==0)){
                   if((ci+ki)>25){
                       index=((ci+ki)-25)-1;
                   }else{
                       index=ci+ki;
                   }
               }else{
                   if((ci-ki)<0){
                       index=(25+(ci-ki))+1;
                   }else{
                       index=ci-ki;
                   }
               }
              
              
               ans.append(alp.charAt(index));
           }
           System.out.println(ans);
    }
}
