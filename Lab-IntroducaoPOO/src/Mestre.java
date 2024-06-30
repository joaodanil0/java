
public class Mestre {
	
	String nome;
	int anoNascimento;
	String afiliacao;
	String posto;
	
	Mestre()
	{
	}

	Mestre(String nome, int anoNascimento, String afiliacao, String posto)
	{
		this.nome = nome;
		this.anoNascimento = anoNascimento;
		this.afiliacao = afiliacao;
		this.posto = posto;
	}
	
	int getIdade(int anoReferenica)
	{
		return  anoReferenica - this.anoNascimento ;
	}
	
	boolean possuiForca()
	{
		return this.posto.equals("Jedi") || this.posto.equals("Sith") ? true : false;
	}
	
	String getAnoNascimentoString()
	{
		return Integer.toString(Math.abs(this.anoNascimento)) + (this.anoNascimento < 0 ? "ABY" : "DBY");
	}
	
	String getDescricao()
	{
		return String.format("Mestre: nome=%s, anoNascimento=%s, afiliacao=%s, posto=%s, possuiForca=%b.",
							  this.nome, this.getAnoNascimentoString(), this.afiliacao, this.posto, this.possuiForca());
	}
	
}
