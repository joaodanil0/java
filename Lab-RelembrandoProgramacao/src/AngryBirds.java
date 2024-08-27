import java.util.Scanner;

public class AngryBirds{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int velocidadeInicial = scanner.nextInt();
    int angulo = scanner.nextInt();
    double distancia = scanner.nextDouble();

    double a = (Math.pow(Math.abs(velocidadeInicial), 2) * Math.sin(2*Math.toRadians(angulo))) / 9.8;
    if(Math.abs(a - distancia) <= 0.1){
      System.out.println("1");
    }
    else{
      System.out.println("0");
    }
  }
}
