package br.edu.ufam.icomp.lab_excecoes;

public class RoverCaminhoException extends RoverException{

	private static final long serialVersionUID = 59876967420076778L;
	
	public RoverCaminhoException() {
		this("Exceção geral de caminho do rover");
	}

	public RoverCaminhoException(String string) {
		super(string);
	}
}
