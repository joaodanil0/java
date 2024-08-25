import java.util.Scanner;

public class PontoReta {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    double pontoX = scanner.nextDouble();
    double pontoY = scanner.nextDouble();

    double equacao = 2 * pontoX + pontoY;

    if(equacao == 3)
//      System.out.printf("Ponto (%.1f, %.1f) pertence a reta 2x + y = 3.\n", pontoX, pontoY);
      System.out.println("Ponto (" + pontoX + ", " + pontoY + ") pertence a reta 2x + y = 3.");
    else
//      System.out.printf("Ponto (%.1f, %.1f) não pertence a reta 2x + y = 3.\n", pontoX, pontoY);
      System.out.println("Ponto (" + pontoX + ", " + pontoY + ") nao pertence a reta 2x + y = 3.");
  }
}
