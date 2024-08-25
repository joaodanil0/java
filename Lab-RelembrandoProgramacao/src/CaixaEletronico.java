import java.util.Scanner;

public class CaixaEletronico{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

    int notas50 = 0;
    int notas10 = 0;
    int notas2 = 0;
    
    int value = scanner.nextInt();
    if(value < 0 || (value % 2) != 0){
      System.out.println("Valor Invalido");
      return;
    }
    int restoValor = value % 50;
    notas50 = (value - restoValor) / 50;
    
    value = restoValor;
    restoValor = value % 10;
    notas10 = (value - restoValor) / 10; 

    notas2 = restoValor / 2;

    String str = String.format("%d notas de R$50, %d notas de R$10 e %d notas de R$2", notas50, notas10, notas2);
    System.out.println(str);
  }
}
