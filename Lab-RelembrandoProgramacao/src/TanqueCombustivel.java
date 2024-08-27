import java.util.Scanner;

public class TanqueCombustivel{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int raio = scanner.nextInt();
    int alturaAr = scanner.nextInt();
    int opcao = scanner.nextInt();
    
    double calota = (Math.PI / 3.0) * Math.pow(alturaAr, 2) * (3 * raio - alturaAr);
    double volumeEsfera = (4.0/3.0) * Math.PI * Math.pow(raio, 3);
    double volumeCombustivel = volumeEsfera - calota;

    if(opcao == 1){
      System.out.printf("%.4f\n", calota);  
    }
    else if(opcao == 2){
      System.out.printf("%.4f\n", volumeCombustivel);
    }
  }
}
