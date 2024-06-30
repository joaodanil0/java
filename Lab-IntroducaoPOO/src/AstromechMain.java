
public class AstromechMain {
	
	public static void main(String[] args)
	{
		Mestre a = new Mestre("Luke Skywalker", 19, "Alianca para Restauracao da Republica,", "Jedi");	
//		System.out.println(a.getDescricao());

		Sensor b = new Sensor("Azul", 512.0, 240);
//		System.out.println(b.getDescricao());
		
		Conexao c = new Conexao("SCOMP Link", 1, 4096000);
//		System.out.println(c.getDescricao());
		
		Astromech d = new Astromech("R2-D2", a, b, c);
		System.out.println(d.getDescricao());
	}
}
