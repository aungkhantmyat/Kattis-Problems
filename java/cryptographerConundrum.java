import java.util.Scanner;

public class cryptographerConundrum {
    public static void main(String[] args) {
        
        Scanner d=new Scanner(System.in);
           StringBuilder ans=new StringBuilder();
         String ct=d.next();
        int out=PerName(ct);
        System.out.println(out);
    }

    private static int PerName(String ct) {
        int count=0;
        String name="PER",conc="PER";
        for(int i=0;i<((ct.length()/3)-1);i++){
            name+=conc;
        }
         for(int i=0;i<ct.length();i++){
          if(ct.charAt(i)!=name.charAt(i)){
              count++;
          }
        }
         return count;
    }

   
}
