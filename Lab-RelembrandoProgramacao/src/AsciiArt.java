import java.util.Scanner;

public class AsciiArt {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int quantidade = scanner.nextInt();
    for(int i = quantidade; i > 0; i--){
      for(int j = 0; j < i; j++){
        System.out.print("*");
      }
      for(int j = quantidade; j > i; j--){
        System.out.print("  ");
      }
      for(int j = i; j > 0; j--){
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
