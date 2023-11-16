import java.util.Scanner;

/**
 *
 * @author KAN KAUNG AUNG
 */
public class IcpcTesting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      Scanner d=new Scanner(System.in);
      StringBuilder ans=new StringBuilder();
      int x=d.nextInt();
    for(int i=0;i<x;i++){
        int n=d.nextInt();
        if(n%2==0){
            ans.append(n+" is even"+"\n");
        }else{
              ans.append(n+" is odd"+"\n");
        }
         
    }
        System.out.println(ans);
       
 
}
}