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
      int x=Integer.parseInt(d.nextLine());
       ArrayList<String> uni = new ArrayList<String>();
             ArrayList<String> team = new ArrayList<String>();
     for(int i=0;i<x;i++){
         String ss[]=d.nextLine().split(" ");
           
                    //read in everything
               
                if (!uni.contains(ss[0])) { //if hmap doesn't have animal yet
                   uni.add(ss[0]);   //add 1
                  team.add(ss[1]);
                }
                
            }
      
     for(int j=0;j<12;j++){
         System.out.println(uni.get(j)+" "+team.get(j));
         
     }
 
      
      
             
     }
}
