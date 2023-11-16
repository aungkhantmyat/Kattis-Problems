import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

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
    
  //   int n=Integer.parseInt(d.nextLine());
  String ss[]=d.nextLine().split(" ");
   HashMap<String, Integer> hmap = new HashMap<String, Integer>();
            ArrayList<String> arrlst = new ArrayList<String>();
  for(int i=0;i<ss.length;i++){
     
                   if (!hmap.containsKey(ss[i])) { //if hmap doesn't have animal yet
                    hmap.put(ss[i], 1);       //add 1
                    arrlst.add(ss[i]);
                }
                else {                                            //else add 1
                    int temp = hmap.get(ss[i]);
                    hmap.replace(ss[i], temp + 1);
                }
            }
 boolean flag=true;
           
            for(String s:arrlst){
               if(hmap.get(s)>1){
                   flag=false;
                   break;
            }
  }
  
        System.out.println(flag?"yes":"no");
      
             
     }
   
    
}
