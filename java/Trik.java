import java.util.Scanner;

public class trik {
    
      private static int ball = 1;
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        String[] moves = sc.nextLine().split("");
        for(String move: moves)
            swap(move);
        System.out.println(ball);
    }
       static void swap(String move){
        if(ball == 1)
            switch (move){
                case "A": ball = 2; break;
                case "C": ball = 3; break;
            }
        else if(ball == 2)
            switch (move){
                case "A": ball = 1; break;
                case "B": ball = 3; break;
            }
        else
            switch (move){
                case "B": ball = 2; break;
                case "C": ball = 1; break;
            }
    }
}
