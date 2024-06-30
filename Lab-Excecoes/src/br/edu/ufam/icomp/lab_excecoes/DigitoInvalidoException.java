package br.edu.ufam.icomp.lab_excecoes;

public class DigitoInvalidoException extends RoverCoordenadaException{

	private static final long serialVersionUID = 4295693681096710890L;
	
	public DigitoInvalidoException() {
		this("Digito da coordenada inválido");
	}

	public DigitoInvalidoException(String string) {
		super(string);
	}
}
