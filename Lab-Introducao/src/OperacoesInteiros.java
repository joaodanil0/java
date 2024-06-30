import java.util.ArrayList;
import java.util.Scanner;

public class OperacoesInteiros {
	
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		ArrayList<Integer> array = new ArrayList<>();
		boolean stop = false;
		int lastInput = number;
		int amountOfElements = 0;
		int amountOfEven = 0;
		int amountOfOdd = 0;
		int totalSum = 0;
		int biggestNumber = Integer.MIN_VALUE;
		int lowestNumber = Integer.MAX_VALUE;
		
		while(!stop)
		{
			array.add(number);
//			System.out.println(number);
			number = scan.nextInt();
			if(lastInput == -1 && number == -1) stop = true;
			lastInput = number;
		}
		array.add(-1);
		scan.close();
				
		for(int i = 0; i < array.size(); i++)
		{
			if(array.get(i) == -1 && array.get(i-1) != -1)
			{
				System.out.println(amountOfElements);
				System.out.println(amountOfEven);
				System.out.println(amountOfOdd);
				System.out.println(totalSum);
				System.out.printf("%.2f\n", (float) totalSum/amountOfElements);
				System.out.println(biggestNumber);
				System.out.println(lowestNumber);
				amountOfElements = 0;
				amountOfEven = 0;
				amountOfOdd = 0;
				totalSum = 0;
				biggestNumber = -10000;
				lowestNumber = 10000;
				continue;
				
			}
			
			amountOfElements++;
			
			if(array.get(i) % 2 == 0) amountOfEven++;
			else amountOfOdd++;
			
			totalSum += array.get(i);
			
			if(array.get(i) > biggestNumber) biggestNumber = array.get(i);
			if(array.get(i) < lowestNumber) lowestNumber = array.get(i);
		}
	}
}
