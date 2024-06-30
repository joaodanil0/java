package br.edu.ufam.icomp.lab_excecoes;

public class Coordenada {
	
	private int posX;
	private int posY;
	private int digito;
	
	public Coordenada(int posX, int posY, int digito) throws CoordenadaNegativaException, CoordenadaForaDosLimitesException, DigitoInvalidoException {
		
		this.setPosX(posX);
		this.setPosY(posY);
		this.setDigito(digito);	
	}
	
	private void checkExceptions(int value) throws CoordenadaNegativaException, CoordenadaForaDosLimitesException{
		if(value < 0) throw new CoordenadaNegativaException();
		else if(value > 30000) throw new CoordenadaForaDosLimitesException();		
	}
	
	public void setPosX(int posX) throws CoordenadaNegativaException, CoordenadaForaDosLimitesException{
		this.checkExceptions(posX);
		this.posX = posX;
		
	}
	
	public void setPosY(int posY) throws CoordenadaNegativaException, CoordenadaForaDosLimitesException{
		this.checkExceptions(posY);
		this.posY = posY;
	}
	
	public void setDigito(int digito) throws DigitoInvalidoException {
		if(((this.getPosX() + this.getPosY()) % 10 != digito)) throw new DigitoInvalidoException(); 
		this.digito = digito;
	}
	
	public int getDigito() {
		return this.digito;
	}
	
	public int getPosX() {
		return this.posX;
	}
	
	public int getPosY() {
		return this.posY;
	}
	
	public double distancia(Coordenada coordenada) {
		return Math.sqrt(
				(coordenada.getPosY() - this.getPosY()) *
				(coordenada.getPosY() - this.getPosY()) +
				(coordenada.getPosX() - this.getPosX()) *
				(coordenada.getPosX() - this.getPosX())				
				);
	}
	
	public String toString() {
		return String.format("%d, %d", this.getPosX(), this.getPosY());
	}
}
