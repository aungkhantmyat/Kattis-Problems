import java.text.DecimalFormat;
import java.util.*;


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
   
   StringBuilder ans = new StringBuilder();
 
        Stack<String> s = new Stack<String>(); 
  
        String word[]=d.next().split("");
       for(int i=0;i<word.length;i++){
           if(s.empty()){
               s.push(word[i]);
           }else{
               if(s.peek().equals(word[i])){
              
           }else{
               s.push(word[i]);
           }
           }
           
       }
       
     ListIterator<String> it = s.listIterator();
     while (it.hasNext()) { 
                System.out.print(it.next()); 
            } 
      
       
  
        
     }
   
    
}
