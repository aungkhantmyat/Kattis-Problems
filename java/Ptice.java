import java.util.*;

public class ptice {
    public static void main(String[] args) {
         Scanner d=new Scanner(System.in);
           StringBuilder ans=new StringBuilder();
           int n=d.nextInt();
           String str=d.next();
          List<Integer> ar = new ArrayList();
          String[]name={"Adrian","Bruno", "Goran"};
         for(int i=0;i<3;i++){
             ar.add(makeWord(n,str,i));
         }
      int max=Collections.max(ar);
       ans.append(max+"\n");
      for(int i=0;i<3;i++){
           if(ar.get(i)==max){
               ans.append(name[i]+"\n");
           }
         }
      ans.setLength(ans.length() - 1);
        System.out.println(ans);
      
    }

    private static int makeWord(int n, String str,int index) {
         List<String> ar = new ArrayList();
         ar.add("ABC");ar.add("BABC");ar.add("CCAABB");
        char[] t=ar.get(index).toCharArray();int i=ar.get(index).length();
       
        int count=0;
        for(int j=0;j<n;j++){
            if(t[j%i]==str.charAt(j)){
                count++;
            }
        }
       
      return count;
    }

    
 
}
