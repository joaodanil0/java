import java.util.Scanner;

public class ArteAscii{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int quantidade = scanner.nextInt(); 

		for(int i = quantidade; i > 0; i--){
			for(int j = 0; j < i; j++){
				System.out.print("*");
			}
			System.out.println();
		}

		for(int i = 1; i <= quantidade; i++){
			for(int j = 0; j < i; j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
