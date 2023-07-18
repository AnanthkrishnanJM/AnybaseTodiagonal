package anybaseTodecimal;
import java.util.Scanner;
public class decimal {
	
	public static void main(String[] args) {
	
		Scanner b=new Scanner(System.in);
		int a=b.nextInt();
		int n=b.nextInt();
		int sum=0;
		int i=0;
		while(i<4) {
			int c=a%10;
			sum+=c*Math.pow(n, i);
			a=a/10;
			
			i++;
			
		}System.out.println(sum);
		

	}

}