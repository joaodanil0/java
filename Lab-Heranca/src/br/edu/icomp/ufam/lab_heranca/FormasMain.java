package br.edu.icomp.ufam.lab_heranca;

public class FormasMain {
	public static void main(String[] args)
	{
		Circulo c1 = new Circulo(4, 5, 8);
//		System.out.println(c1.toString());
		
		Retangulo c2 = new Retangulo(12, 65, 2, 7);
//		System.out.println(c2.toString());
		
		Quadrado c3 = new Quadrado(45, 39, 6);
		System.out.println(c3.toString());
	}
}
