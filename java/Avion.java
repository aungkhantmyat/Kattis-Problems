import java.util.Scanner;

/**
 *
 * @author KAN KAUNG AUNG
 */
public class avion {
    public static void main(String[] args) {
        Scanner d=new Scanner(System.in);
         StringBuilder str = new StringBuilder(); 
         boolean alert=true;
         for(int i=0;i<5;i++){
             if(avion(d.next())){
                 str.append((i+1)+" ");
                 alert=false;
             }
         }
         if(alert){
             str.append("HE GOT AWAY!");
         }
        String ans=str.toString();
            System.out.println(ans.trim());
         
    }

    private static boolean avion(String ss) {
        boolean alert=false;
        for(int i=0;i<(ss.length()-2);i++){
            if(ss.substring(i,(i+3)).equals("FBI")){
               alert=true;break;
               
            }
        }
        return alert;
    }
}
