import java.util.Scanner;

public class Desconto{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    double preco = scanner.nextDouble();
    
    if(preco < 200)
      System.out.printf("%.2f", preco);
    else
      System.out.printf("%.2f\n", preco * (1 - 0.05));
  }
}
