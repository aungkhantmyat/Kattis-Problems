import java.util.Scanner;

public class electricalOutlets {
    public static void main(String[] args) {
          Scanner d=new Scanner(System.in);
           StringBuilder ans=new StringBuilder();
             int n=d.nextInt();
             for(int i=0;i<n;i++){
                 int k=d.nextInt();
                 int out=0;
                 for(int j=0;j<k;j++){
                     if(j==(k-1)){
                         out+=d.nextInt();
                     }else{
                         out+=(d.nextInt())-1;
                     }
                     
                 }
                 ans.append(out+"\n");
             }
              ans.setLength(ans.length() - 1);
        System.out.println(ans);
    }
   
 }

