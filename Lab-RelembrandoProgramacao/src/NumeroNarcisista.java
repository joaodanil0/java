import java.util.Scanner;
import java.util.ArrayList;

public class NumeroNarcisista{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

    int numero = scanner.nextInt();
    int numeroAux = numero;
    ArrayList<Integer> listaNumeros = new ArrayList<Integer>();

    while(numero > 0){
      listaNumeros.add(numero % 10);
      numero /= 10;
    }
    
    int narcisista = 0;
    for(int i = 0; i < listaNumeros.size(); i++){
      narcisista += Math.pow(listaNumeros.get(i), listaNumeros.size());
    }

    if(narcisista == numeroAux)
      System.out.println("SIM");
    else
      System.out.println("NAO");
  }
}
