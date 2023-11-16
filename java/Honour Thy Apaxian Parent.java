import java.util.Scanner;

public class honourThyApaxianParent {
    public static void main(String[] args) {
         Scanner d=new Scanner(System.in);
           StringBuilder ans=new StringBuilder();
           String y=d.next();
            String p=d.next();
            String out=Apaxian(y,p);
            System.out.println(out);
    }

    private static String Apaxian(String y, String p) {
        char l=y.charAt(y.length()-1);
        String o="";
        if(l=='e'){
           o=o.concat(y+"x"+p);
        }else if(l=='a'|| l=='i'|| l=='o'|| l=='u'){
          y= charRemoveAt(y,(y.length()-1));
           o=o.concat(y+"ex"+p);
        }else if(y.substring((y.length()-2), (y.length())).equals("ex") ){
         o=o.concat(y+p);
        }else{
              o=o.concat(y+"ex"+p);
        }
       return o;
    }
      public static String charRemoveAt(String str, int p) {  
              return str.substring(0, p) + str.substring(p + 1);  
           }  
}
