import java.util.Scanner;

public class billiard {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
           StringBuilder ans=new StringBuilder();
        int width = sc.nextInt();
        int height = sc.nextInt();
        int s = sc.nextInt();
	int bouncesOffVert = sc.nextInt();
        int bouncesOffHor = sc.nextInt();
		while(bouncesOffHor > 0 && bouncesOffVert > 0){
			double angle, totalD;
			if(bouncesOffVert == 0){
				angle = Math.PI / 2;
				totalD = height * bouncesOffHor;
			}
			else{
				angle = Math.atan((bouncesOffHor*1.0 / width) / (bouncesOffVert*1.0 / height));
				double x = height * bouncesOffHor, y = width * bouncesOffVert;
				totalD = Math.sqrt((x * x) + (y * y));
			}
			
                        System.out.printf("%.2f %.2f%n", (angle*180/Math.PI), (totalD*1.0 / s));
			width = sc.nextInt(); height = sc.nextInt(); s = sc.nextInt(); 
				bouncesOffVert = sc.nextInt(); bouncesOffHor = sc.nextInt();
		}
                 
    }
}
