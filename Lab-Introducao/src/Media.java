import java.util.Scanner;

public class Media {
	
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int i = 0;
		float total = 0;
		
		while(i < 3)
		{
			i++;
			total += scan.nextFloat();
		}
		
		System.out.printf("%.2f\n", total/i);
		scan.close();
	}
}
