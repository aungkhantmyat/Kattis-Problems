import java.util.Scanner;


public class IcpcTesting {

    public static void main(String[] args) {
        // TODO code application logic here
      Scanner d=new Scanner(System.in);
      int x=d.nextInt();
      int n=d.nextInt();
      int total=0;
      for(int i=0;i<n;i++){
          int tmp=d.nextInt();
          total+=x-tmp;
      }
        System.out.println(x+total);
    }
    
}
