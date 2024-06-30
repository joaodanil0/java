
public class EnsalamentoMain {
	
	public static void main(String[] args) {
		
		Sala s1 = new Sala(6, 102, 100, true);
		Sala s2 = new Sala(6, 101, 50, true);
		Sala s3 = new Sala(6, 203, 50, false);
		Sala s4 = new Sala(6, 204, 100, false);
//		System.out.println(s1.getDescricao());
		
		Turma t1 = new Turma("Algoritmos e Estrutura de Dados I", "Edleno Silva", 60, false);
		t1.addHorario(1);
		t1.addHorario(15);
		t1.addHorario(29);
		Turma t2 = new Turma("Técnicas de Programação", "Horácio Fernandes", 50, false);
		t2.addHorario(11);
		t2.addHorario(25);
		t2.addHorario(32);
		Turma t3 = new Turma("Laboratório de Programação C", "Edson Nascimento", 25, true);
		t3.addHorario(1);
		t3.addHorario(15);
		t3.addHorario(29);
		Turma t4 = new Turma("Redes de Computadores", "Edjair Souza", 70, true);
		t4.addHorario(2);
		t4.addHorario(16);
//		System.out.println(t1.getHorariosString());
//		System.out.println(t1.getDescricao());
		
		Ensalamento e1 = new Ensalamento();
		e1.addSala(s1);
		e1.addSala(s2);
		e1.addSala(s3);
		e1.addSala(s4);
		e1.addTurma(t1);
		e1.addTurma(t2);
		e1.addTurma(t3);
		e1.addTurma(t4);
		e1.alocar(t1, s1);
		e1.alocar(t2, s2);
		e1.alocar(t3, s2);
		
		System.out.println(e1.relatorioSalasPorTurma());
	}
}
