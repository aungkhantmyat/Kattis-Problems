
import java.util.Scanner;

public class diceCup {
    public static void main(String[] args) {
         Scanner d=new Scanner(System.in);
           StringBuilder ans=new StringBuilder();
     int N=d.nextInt();
    int M=d.nextInt();
    int[] nums = new int[ N + M + 1 ];
		
		for (int i = 1; i <= N; i++){
                    for (int j = 1; j <= M; j++){
                        nums[i + j]++;
                    }
				
                }
            int maxIdx = 0;
		for (int i = 0; i < nums.length; i++){
                    if (nums[i] > nums[maxIdx]){
                        maxIdx = i;
                    }
				
                }
                for (int i = 0; i < nums.length; i++)
                {
                    if (nums[i] == nums[maxIdx]){
                        ans.append(i+"\n");
                    }
                }
			
		ans.setLength(ans.length() - 1);
        System.out.println(ans);		
		
		
	}
    }

