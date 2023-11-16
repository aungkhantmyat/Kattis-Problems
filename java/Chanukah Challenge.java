import java.util.Scanner;


public class chanukahChallenge {
    public static void main(String[] args) {
         Scanner d=new Scanner(System.in);
       StringBuilder ans=new StringBuilder();
     int p=d.nextInt();
     for(int i=0;i<p;i++){
         int k=d.nextInt();
         int n=d.nextInt();
         int out=0;
         for(int j=1;j<=n;j++){
             out+=j;
         }
         out+=n;
         ans.append(k+" "+out+"\n");
         
     }
      ans.setLength(ans.length() - 1);
        System.out.println(ans);
    }
}
