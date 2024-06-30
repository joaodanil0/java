package br.edu.ufam.icomp.lab_excecoes;

public class CoordenadaNegativaException extends RoverCoordenadaException{

	private static final long serialVersionUID = 3606644026167479383L;
	
	public CoordenadaNegativaException() {
		this("Coordenada com valor negativo");
	}
	
	public CoordenadaNegativaException(String s) {
		super(s);
	}
}
