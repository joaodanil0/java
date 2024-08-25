import java.util.Scanner;

public class PinturaMuro{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    Float precoPorMetroQuadrado = scanner.nextFloat();
    
    Float metroQuadrado = (12f*3f);
    Float precoMaterialPintura = 100f;

    System.out.printf("%.1f\n", (metroQuadrado * precoPorMetroQuadrado) + precoMaterialPintura);

  }
}
