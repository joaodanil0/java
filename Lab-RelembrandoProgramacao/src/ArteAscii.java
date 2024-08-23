public class ArteAscii{
	public static void main(String[] args){
		
		if(args.length == 0) return;

		int quantidade = Integer.valueOf(args[0]);
		
		if (quantidade < 1) return;

		for(int i = quantidade; i > 0; i--){
			for(int j = 0; j < i; j++){
				System.out.print("*");
			}
			System.out.println();
		}

		for(int i = 1; i <= quantidade; i++){
			for(int j = 0; j < i; j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
