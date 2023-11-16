import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;


public class akm{

   
    public static void main(String[] args) {
        // TODO code application logic here
      Scanner d=new Scanner(System.in);
      StringBuilder ans=new StringBuilder();
     int l=d.nextInt();
     int x=d.nextInt();
       int ng=0,ea=0;
       d.nextLine();
       for(int i=0;i<x;i++){
           String e[]=d.nextLine().split(" ");
           if(e[0].equals("enter")){
               ea+=Integer.parseInt(e[1]);
               if(ea>l){
                   ea-=Integer.parseInt(e[1]);
                   ng++;
               }
               
           }else{
               ea-=Integer.parseInt(e[1]);
           }
       }
        System.out.println(ng);
      
       
  
             
     }
   
    
}
