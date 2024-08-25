import java.util.Scanner;

public class AreaTriangulo{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int ladoA = scanner.nextInt();
    int ladoB = scanner.nextInt();
    int ladoC = scanner.nextInt();
    if(ladoA < 0 || ladoB < 0 || ladoC < 0){
      System.out.println("Triangulo invalido");
    }
    
    if(((ladoA + ladoB) <= ladoC) || ((ladoB + ladoC) <= ladoA ) || ((ladoA + ladoC) <= ladoB )){
      System.out.println("Triangulo invalido");
      return;
    }
    double s = (ladoA + ladoB + ladoC) / 2;
    double area = Math.sqrt(s * (s - ladoA) * (s - ladoB) * (s - ladoC));

    System.out.printf("%.2f\n", area);
  }
}
