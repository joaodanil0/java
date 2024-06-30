import java.util.ArrayList;

public class Ensalamento {
	
	ArrayList<Sala> salas;
	ArrayList<Turma> turmas;
	ArrayList<TurmaEmSala> ensalamento;
	
	Ensalamento(){
		this.salas = new ArrayList<Sala>();
		this.turmas = new ArrayList<Turma>();
		this.ensalamento = new ArrayList<TurmaEmSala>();
	}
	
	void addSala(Sala sala) {
		this.salas.add(sala);
	}
	
	void addTurma(Turma turma) {
		this.turmas.add(turma);
	}
	
	Sala getSala(Turma turma) {
		Sala sala = null;
		for(TurmaEmSala turmaEmSala : this.ensalamento) {
			if(turmaEmSala.turma.equals(turma)) {
				sala = turmaEmSala.sala;
				break;
			}
		}
		return sala;
	}
	
	boolean salaDisponivel(Sala sala, int horario) {
		
		for(TurmaEmSala turmaEmSala : this.ensalamento) {
			if(turmaEmSala.sala.equals(sala)) {
				for(int _horario : turmaEmSala.turma.horarios) {
					if(_horario == horario) {
						return false;
					}
				}
			}
		}
		return true;
	}
	
	boolean salaDisponivel(Sala sala, ArrayList<Integer> horarios) {
		
		for(int horario : horarios) {
			if(!this.salaDisponivel(sala, horario))
				return false;
		}
		
		return true;
	}
	
	boolean alocar(Turma turma, Sala sala) {
		if(turma.acessivel == sala.acessivel || turma.acessivel == false) {
			if(turma.numAlunos <= sala.capacidade) {
				if(this.salaDisponivel(sala, turma.horarios)) {
					TurmaEmSala novoEnsalamento = new TurmaEmSala(turma, sala);
					this.ensalamento.add(novoEnsalamento);
					return true;
				}
			}
		}
		return false;
	}
	
	void alocarTodas() {
		for(Turma turma : this.turmas) {
			for(Sala sala : this.salas) {
				if(this.alocar(turma, sala))
					break;
			}
		}
	}
	
	int getTotalTurmasAlocadas() {
		int counter = 0;
		for(TurmaEmSala turmaEmSala : this.ensalamento) {
			if(turmaEmSala.sala != null) {
				counter++;
			}
		}	
		return counter;
	}
	
	int getTotalEspacoLivre() {
		int counter = 0;
		for(TurmaEmSala turmaEmSala : this.ensalamento) {
			counter += turmaEmSala.sala.capacidade - turmaEmSala.turma.numAlunos;
		}
		return counter;
	}
	
	String relatorioResumoEnsalamento() {
		return String.format("Total de Salas: %d\nTotal de Turmas: %d\nTurmas Alocadas:%d\nEspaços Livres: %d", 
					this.salas.size(), this.turmas.size(), this.getTotalTurmasAlocadas(), this.getTotalEspacoLivre());
	}
	
	String relatorioTurmasPorSala() {
		String aux = "";
		for(Sala sala : this.salas) {
			aux += String.format("--- %s ---\n\n", sala.getDescricao());
			
			for(TurmaEmSala turmaEmSala : this.ensalamento) {
				if(turmaEmSala.sala.equals(sala)) {
					aux += String.format("%s\n\n", turmaEmSala.turma.getDescricao());
				}
			}
		}
		
		return String.format("%s\n\n%s", 
					this.relatorioResumoEnsalamento(), aux);
	}
	
	String relatorioSalasPorTurma() {
		String aux = "";
		
		for(Turma turma : this.turmas) {
			Sala sala = this.getSala(turma);
			
			if(sala != null) {
				aux += String.format("%s\nSala: %s\n\n", 
						turma.getDescricao(), sala.getDescricao());
			}
			else {
				aux += String.format("%s\nSala: SEM SALA", 
						turma.getDescricao());
			}	
		}
		
		return String.format("%s\n\n%s", 
					this.relatorioResumoEnsalamento(), aux);
	}
}
