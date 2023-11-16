import java.util.*;

public class blackFriday {
    static  ArrayList<Integer> out = new ArrayList<Integer>();
       static  Set<Integer> dup = new HashSet<Integer>();
    public static void main(String[] args) {
         Scanner d=new Scanner(System.in);
           StringBuilder ans=new StringBuilder();
        int n=d.nextInt();
        
         for(int i=0;i<n;i++){
             int a=d.nextInt();
             if(out.contains(a)){
                 dup.add(a);
             }
             out.add(a);
         }
         int max=0,index=0;
         for(int i=0;i<out.size();i++){
             if(!dup.contains(out.get(i))){
                 max=Math.max(max, out.get(i));
                  index=out.indexOf(max);
             }
            
         }
         if(max!=0){
             System.out.println(index+1);
         }else{
             System.out.println("none");
         }
         
    }
}
