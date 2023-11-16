import java.util.Scanner;

public class identifyingMapTiles {
    public static void main(String[] args) {
        Scanner d=new Scanner(System.in);
           StringBuilder ans=new StringBuilder();
         String s=d.next();
         int zL = s.length(), length = (int) Math.pow(2, zL);
		int xLower = 0, xUpper = length - 1, yLower = 0, yUpper = length - 1;
		
		for (int i = 0; i < zL; i++) {
			char c = s.charAt(i);
			
			if (c == '0') {
				xUpper = (xLower + xUpper) / 2;
				yUpper = (yLower + yUpper) / 2;
			} else if (c == '1') {
				xLower = (xLower + xUpper) / 2 + 1;
				yUpper = (yLower + yUpper) / 2;
			} else if (c == '2') {
				xUpper = (xLower + xUpper) / 2;
				yLower = (yLower + yUpper) / 2 + 1;
			} else {
				xLower = (xLower + xUpper) / 2 + 1;
				yLower = (yLower + yUpper) / 2 + 1;
			}
		}
                System.out.println(zL+" "+xLower+" "+yLower);
         
    }
}
