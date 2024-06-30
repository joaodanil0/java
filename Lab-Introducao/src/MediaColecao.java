import java.util.Scanner;

public class MediaColecao {
	
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		float number = scan.nextFloat();
		int i = 0;
		float total = 0;
		
		
		while(number != -1)
		{
						
			total += number;
			i++;
			
			number = scan.nextFloat();
		}
		
		System.out.printf("%.2f", total/i);
		
		scan.close();
		
	}
}
