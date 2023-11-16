import java.util.Scanner;

public class happyPrime {
    public static void main(String[] args) {
         Scanner d=new Scanner(System.in);
           StringBuilder ans=new StringBuilder();
           int p=d.nextInt();
           for(int i=0;i<p;i++){
                int k=d.nextInt();
                 int m=d.nextInt();
                 if(isPrime(m,2)){
                     if(sumSquareDigits(m)){
                          ans.append(k+" "+m+" YES\n");
                     }else{
                         ans.append(k+" "+m+" NO\n");
                     }
                 }else{
                     ans.append(k+" "+m+" NO\n");
                 }
                 
                 
           }
            ans.setLength(ans.length() - 1);
        System.out.println(ans);
    }
    static boolean isPrime(int n, int i) 
    { 
        if (n <= 2) 
            return (n == 2) ? true : false; 
        if (n % i == 0) 
            return false; 
        if (i * i > n) 
            return true; 
        return isPrime(n, i + 1); 
    } 
        public static boolean sumSquareDigits(int n) {
    if(n==1 || n==7){
        return true;
    }else if(String.valueOf(n).length()==1 && n!=1){
        return false;
    }else{
        String[] s=String.valueOf(n).split("");
        int o=0;
        for(int i=0;i<s.length;i++){
        o+=Integer.valueOf(s[i])*Integer.valueOf(s[i]);
        }
   
    return sumSquareDigits(o);
    }
        
    }
}
