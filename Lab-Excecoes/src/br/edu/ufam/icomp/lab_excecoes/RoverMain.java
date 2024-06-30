package br.edu.ufam.icomp.lab_excecoes;

public class RoverMain {
	public static void main(String[] args) {
		try {
			Coordenada c1 = new Coordenada(5, 13, 8);
			Coordenada c2 = new Coordenada(9, 8, 7);
		} catch (CoordenadaNegativaException | CoordenadaForaDosLimitesException | DigitoInvalidoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		Caminho c = new Caminho(6);

		try {
			Coordenada r1 = new Coordenada(23, 55, 8);
			c.addCoordenada(r1);
			Coordenada r2 = new Coordenada(27, 65, 2);
			c.addCoordenada(r2);
		} catch (CoordenadaNegativaException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (CoordenadaForaDosLimitesException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (DigitoInvalidoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (TamanhoMaximoExcedidoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (DistanciaEntrePontosExcedidaException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
