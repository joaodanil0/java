import java.util.Scanner;

public class Desconto{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    double preco = scanner.nextDouble();

    System.out.printf("%.2f\n", preco * (1 - 0.05));
  }
}
