package br.edu.ufam.icomp.lab_excecoes;

public class RoverCoordenadaException extends RoverException{

	private static final long serialVersionUID = -8650125912639603839L;
	
	public RoverCoordenadaException() {
		this("Exceção geral de coordenada do rover");
	}

	public RoverCoordenadaException(String string) {
		super(string);
	}
}
