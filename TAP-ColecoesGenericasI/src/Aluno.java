
import java.util.Calendar;

public class Aluno {
	String nome;
	int matricula;
	int anoNascimento;
	
	Aluno(){
		
	}
	
	Aluno(String nome, int matricula, int anoNascimento){
		this.nome = nome;
		this.matricula = matricula;
		this.anoNascimento = anoNascimento;
	}
	
	int getIdade() {
		int anoAtual = Calendar.getInstance().get(Calendar.YEAR);
		return anoAtual - this.anoNascimento;
	}
	
	String getDescricao() {
		return String.format("%s (mat=%d, idade=%d)", this.nome, this.matricula, this.getIdade());
	}
}
