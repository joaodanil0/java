package br.edu.ufam.icomp.lab_excecoes;

public class TamanhoMaximoExcedidoException extends RoverCaminhoException{

	private static final long serialVersionUID = 5487548090000996412L;
	
	public TamanhoMaximoExcedidoException() {
		this("Quantidade máxima de coordenadas excedida");
	}

	public TamanhoMaximoExcedidoException(String string) {
		// TODO Auto-generated constructor stub
		super(string);
	}
}
