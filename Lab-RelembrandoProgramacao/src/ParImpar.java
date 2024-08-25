import java.util.Scanner;
import java.util.ArrayList;

public class ParImpar{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int numero = 0;
    ArrayList<Integer> numeros = new ArrayList<Integer>();

    while((numero = scanner.nextInt()) != -1){
      numeros.add(numero);
    }

    for(int i=0; i < numeros.size(); i++){
      if(numeros.get(i) % 2 == 0){
        System.out.println("PAR");
      }
      else {
        System.out.println("IMPAR");
      }
    }
  }
}
