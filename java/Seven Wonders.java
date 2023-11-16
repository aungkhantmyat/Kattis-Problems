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
      
       
  String k[]=d.next().split("");
     HashMap<String, Integer> hmap = new HashMap<String, Integer>();
            ArrayList<String> arrlst = new ArrayList<String>();
            for (int i = 0; i < k.length; i++) {                 //read in everything
         if (!hmap.containsKey(k[i])) { //if hmap doesn't have animal yet
                    hmap.put(k[i], 1);       //add 1
                    arrlst.add(k[i]);
                }
                else {                                            //else add 1
                    int temp = hmap.get(k[i]);
                    hmap.replace(k[i], temp + 1);
                }
            }
            int anss=0;
             ArrayList<Integer> arrlst1 = new ArrayList<Integer>();
             for(String s:arrlst){
               
                anss+=Math.pow(hmap.get(s),2);
                arrlst1.add(hmap.get(s));
            }
             Collections.sort(arrlst1);
             if(arrlst1.size()<3){
                  anss+=0;
             }else{
                  anss+=arrlst1.get(0)*7;
             }
            
  
        System.out.println(anss);
             
     }
}
