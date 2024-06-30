package br.edu.ufam.icomp.lab_excecoes;

public class DistanciaEntrePontosExcedidaException extends RoverCaminhoException{

	private static final long serialVersionUID = -6117571232645903004L;
	
	public DistanciaEntrePontosExcedidaException() {
		this("Distância máxima entre duas coordenadas vizinhas excedida");
	}

	public DistanciaEntrePontosExcedidaException(String string) {
		// TODO Auto-generated constructor stub
		super(string);
	}
}
