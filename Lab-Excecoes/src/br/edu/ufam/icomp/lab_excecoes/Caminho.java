package br.edu.ufam.icomp.lab_excecoes;

public class Caminho {
	private Coordenada[] caminho;
	private int tamanho;
	private int maxTam;
	
	public Caminho(int maxTam) {
		
		this.caminho = new Coordenada[maxTam];
		this.maxTam = maxTam;
	}
	
	public int tamanho() {
		return this.tamanho;
	}
	
	public void addCoordenada(Coordenada coordenada) throws TamanhoMaximoExcedidoException, DistanciaEntrePontosExcedidaException {
		
		if(this.tamanho >= this.maxTam) throw new TamanhoMaximoExcedidoException();
		
		if(this.tamanho > 0)
			if(coordenada.distancia(this.caminho[this.tamanho()-1]) > 15) throw new DistanciaEntrePontosExcedidaException();
		
		this.caminho[this.tamanho] = coordenada;
		this.tamanho++;
	}
	
	public void reset() {
		this.caminho = null;
		this.caminho = new Coordenada[this.maxTam];
		this.tamanho = 0;
	}
	
	public String toString() {
		String aux = "";
		
		for(int i = 0; i < this.tamanho(); i++) {
			aux += String.format("    -> %d, %d\n", this.caminho[i].getPosX(), this.caminho[i].getPosY());
		}
			
		return String.format("Dados do caminho:\n  - Quantidade de pontos: %d\n  - Pontos:\n%s",
				this.tamanho(), aux);
	}
}
