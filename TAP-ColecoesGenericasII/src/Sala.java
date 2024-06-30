
public class Sala {

	int bloco;
	int sala;
	int capacidade;
	boolean acessivel;
	
	Sala(){
		
	}
	
	Sala(int bloco, int sala, int capacidade, boolean acessivel){
		this.bloco = bloco;
		this.sala = sala;
		this.capacidade = capacidade;
		this.acessivel = acessivel;
	}
	
	String getDescricao() {
		return String.format("Bloco %d, Sala %d (%d lugares, %s)", 
					this.bloco, this.sala, this.capacidade, this.acessivel? "acessível" : "não acessível");
	}
}
