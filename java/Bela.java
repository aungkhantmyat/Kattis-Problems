import java.util.*;

public class brla {
    public static void main(String[] args) {
        Scanner d=new Scanner(System.in);
        String al[] = {"A", "K", "Q", "J", "T", "9", "8", "7"};
        Integer dd[] = {11, 4, 3, 20, 10, 14, 0, 0};
        Integer nd[]  = {11, 4, 3, 2, 10, 0, 0, 0};
          List<String> alr = Arrays.asList(al);
           List<Integer> ddr = Arrays.asList(dd);
            List<Integer> ndr = Arrays.asList(nd);
              int n=d.nextInt(); String b=d.next();
              int out=0;
              for(int i=0;i<(n*4);i++){
                  String fc=d.next();
                  String str[]=fc.split("");
                  int index=alr.indexOf(str[0]);
                 
                  if(str[1].equals(b)){
                      out+=ddr.get(index);
                  }else{
                out+=ndr.get(index);
                  }
              }
              System.out.println(out);
            
    }
}
