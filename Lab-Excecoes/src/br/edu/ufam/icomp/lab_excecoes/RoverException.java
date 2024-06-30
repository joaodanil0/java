package br.edu.ufam.icomp.lab_excecoes;

public class RoverException extends Exception{

	private static final long serialVersionUID = -7377540747965363063L;
	
	public RoverException() {
		this("Exceção geral do rover");
	}

	public RoverException(String string) {
		super(string);
	}
}
