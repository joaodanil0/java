import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Turma {
	final String[] dias = new String[] {"segunda", "terça", "quarta", "quinta", "sexta"};
	final String[] horarios_string = new String[] {"8", "10", "12", "14", "16", "18", "20"};
	
	String nome;
	String professor;
	int numAlunos;
	boolean acessivel;
	ArrayList<Integer> horarios;

	Map<Integer,String> diasHorarios;
	
	Turma(){
		
	}
	
	Turma(String nome, String professor, int numAlunos, boolean acessivel){
		this.nome = nome;
		this.professor = professor;
		this.numAlunos = numAlunos;
		this.acessivel = acessivel;
		this.horarios = new ArrayList<Integer>();
		this.diasHorarios = new HashMap<Integer,String>();
		this.populateTable();
	}
	
	void addHorario(int horario) {
		
		for(int _horario : this.horarios) {
			if(_horario == horario) {
				return;
			}
		}
		
		this.horarios.add(horario);
	}
	
	String getHorariosString() {
		
		String aux = "";
		int i;
		for(i = 0; i < this.horarios.size() - 1; i++) {
			aux += String.format("%s, ", this.diasHorarios.get(this.horarios.get(i)));
		}
		
		aux += String.format("%s", this.diasHorarios.get(this.horarios.get(i)));
		
		return aux;
	}
	
	String getDescricao() {
		return String.format("Turma: %s\nProfessor: %s\nNúmero de Alunos: %d\nHorário: %s\nAcessível: %s", 
				this.nome, this.professor, this.numAlunos, this.getHorariosString(), this.acessivel ? "sim": "não");
	}
	
	void populateTable() {
		int counterHour = 0;
		int counterDays = 0;
		
		for(int i = 1; i <= 35; i++) {
			
			String aux = String.format("%s %shs", this.dias[counterDays], this.horarios_string[counterHour]);
			diasHorarios.put(i, aux);
			
			if(i % 7 == 0) {
				counterHour = -1;
				counterDays++;
			}
			
			counterHour++;

		}
	}
}
