import java.util.Scanner;

public class AreaVolume {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    double r = scanner.nextDouble();

    double areaCirculo = Math.PI * Math.pow(r, 2);
    double volumeEsfera = (4.0/3.0) * Math.PI * Math.pow(r, 3);

    System.out.printf("Um circulo com raio de %.2f centimetros tem uma area de %.2f centimetros quadrados.\n", r, areaCirculo);
    System.out.printf("Uma esfera com raio de %.2f centimetros tem um volume de %.2f centimetros cubicos.\n", r, volumeEsfera);
  }
}
