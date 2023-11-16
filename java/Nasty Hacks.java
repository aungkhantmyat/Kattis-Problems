import java.util.Scanner;


public class nastyHacks {
    public static void main(String[] args) {
         Scanner d=new Scanner(System.in);
           StringBuilder ans=new StringBuilder();
             int n=d.nextInt();
             for(int i=0;i<n;i++){
                  int r=d.nextInt();
                   int e=d.nextInt();
                    int c =d.nextInt();
                    int rev=e-c;
                    if(rev>r){
                        ans.append("advertise\n");
                    }else if(rev==r){
                         ans.append("does not matter\n");
                    }else{
                         ans.append("do not advertise\n");
                    }
             }
              ans.setLength(ans.length() - 1);
        System.out.println(ans);
    }
}
