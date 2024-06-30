import java.util.ArrayList;
import java.util.Scanner;

public class AreaPoligono {
	
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		float number = 0; // = scan.nextFloat();
		ArrayList<Float> x = new ArrayList<>();
		ArrayList<Float> y = new ArrayList<>();
		float total = 0;
		
		int i = 0;
		
		while(i < 2)
		{
			number = scan.nextFloat();
			
			if(i == 0)
				x.add(number);
			else if(i == 1)
				y.add(number);
			
			if(number == -1)
				i++;
		}
		
		scan.close();
//		System.out.println(x.toString());
//		System.out.println(y.toString());
		
		for(int j = 0; j < x.size() - 2; j++)
		{
			total += (x.get(j + 1) + x.get(j)) * (y.get(j + 1) - y.get(j));
		}
		
		System.out.printf("%.4f", Math.abs(total * 0.5));
	}
}
