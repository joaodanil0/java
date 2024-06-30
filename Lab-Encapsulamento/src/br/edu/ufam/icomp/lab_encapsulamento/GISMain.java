package br.edu.ufam.icomp.lab_encapsulamento;

public class GISMain {
	public static void main(String[] args) {
		
		Localizavel[] arr = new Localizavel[4];
		
		Celular cel1 = new Celular(1, 20, 10000000);
		Celular cel2 = new Celular(2, 21, 10000001);
		
		CarroLuxuoso carLux1 = new CarroLuxuoso("QZZ8050");
		CarroLuxuoso carLux2 = new CarroLuxuoso("QZZ8051");
		
		arr[0] = cel1;
		arr[1] = cel2;
		arr[2] = carLux1;
		arr[3] = carLux2;
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i].getPosicao());
		}
	}
}
