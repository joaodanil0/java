import java.util.ArrayList;

public class Turma {
	
	String disciplina;
	int ano;
	int semestre;
	Professor professor;
	ArrayList<Aluno> alunos;

	Turma(String disciplina, int ano, int semestre, Professor professor){
		this.disciplina = disciplina;
		this.ano = ano;
		this.semestre = semestre;
		this.professor = professor;		
		this.alunos  = new ArrayList<Aluno>();
	}
	
	void addAluno(Aluno aluno) {
		
		for(Aluno _aluno : this.alunos) {
			if(_aluno.matricula == aluno.matricula) {
				return;
			}
		}
		this.alunos.add(aluno);
	}
	
	Aluno getAluno(int matricula) {
		Aluno aux = null;
		for(Aluno aluno : this.alunos) {
			if(aluno.matricula == matricula) {
				aux = aluno;
				break;
			}
		}
		return aux;
	}
	
	double getMediaIdade() {
		double idadeMedia = 0;
		int counter = 0;
		
		for(Aluno aluno : this.alunos) {
			idadeMedia += aluno.getIdade();
			counter++;
		}
		return idadeMedia / counter;
	}
	
	String getDescricao() {
		String alunos = "";
		int counter = 0;
		for(Aluno aluno: this.alunos) {
			alunos += String.format("  - Aluno %d: %s\n", ++counter, aluno.getDescricao());
		}
		
		return String.format("Turma %s - %d/%d (%s):\n%s", this.disciplina, this.ano, this.semestre, this.professor.getDescricao(), alunos);
	}
	
	
	
}
