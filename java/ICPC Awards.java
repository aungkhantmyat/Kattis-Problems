import java.util.*;

public class icpcAwards {
    public static void main(String[] args) {
        Scanner d=new Scanner(System.in);
      StringBuilder ans=new StringBuilder();
      int x=Integer.parseInt(d.nextLine());
       ArrayList<String> uni = new ArrayList<String>();
             ArrayList<String> team = new ArrayList<String>();
     for(int i=0;i<x;i++){
         String ss[]=d.nextLine().split(" ");
          
                if (!uni.contains(ss[0])) { 
                   uni.add(ss[0]); 
                  team.add(ss[1]);
                }
                
            }
      
     for(int j=0;j<12;j++){
         System.out.println(uni.get(j)+" "+team.get(j));
         
     }
    }
}
