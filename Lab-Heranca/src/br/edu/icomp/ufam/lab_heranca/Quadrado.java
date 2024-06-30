package br.edu.icomp.ufam.lab_heranca;

public class Quadrado extends Retangulo {
	
	public double lado;
	
	public Quadrado(int posX, int posY, double lado)
	{
		super(posX, posY, lado, lado);
		
	}
	
	public String toString()
	{
		return String.format("Quadrado na posição (%d, %d) com lado de %.1fcm (área=%.1fcm2, perímetro=%.1fcm)", 
								this.posX, this.posY, this.altura, this.getArea(), this.getPerimetro());
	}
}
