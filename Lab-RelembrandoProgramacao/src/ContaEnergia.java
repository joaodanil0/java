import java.util.Scanner;

public class ContaEnergia{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int consumoEnergia = scanner.nextInt();
    char tipoInstalacao = scanner.next().charAt(0);
    
    if(consumoEnergia <= 0){
      System.out.printf("%.2f\n", -1.00);
      return;
    }

    if(tipoInstalacao == 'R'){
      if(consumoEnergia <= 500){
        System.out.printf("%.2f\n", consumoEnergia * 0.40);
      }
      else{
        System.out.printf("%.2f\n", consumoEnergia * 0.65);
      }
    }
    else if(tipoInstalacao == 'I'){
      if(consumoEnergia <= 5000){
        System.out.printf("%.2f\n", consumoEnergia * 0.55);
      }
      else{
        System.out.printf("%.2f\n", consumoEnergia * 0.06);
      }
    }
    else if(tipoInstalacao == 'C'){
      if(consumoEnergia <= 1000){
        System.out.printf("%.2f\n", consumoEnergia * 0.55);
      }
      else{
        System.out.printf("%.2f\n", consumoEnergia * 0.60);
      }
    }
    else {
      System.out.printf("%.2f\n", -1.00);
    }
  }

}
