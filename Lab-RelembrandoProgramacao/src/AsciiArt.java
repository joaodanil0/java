public class AsciiArt {
  public static void main(String[] args){
    if(args.length == 0) return;
    int quantidade = Integer.valueOf(args[0]);
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
