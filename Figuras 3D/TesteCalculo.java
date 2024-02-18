package br.com.fiap;

public class TesteCalculo {

	public static void main(String[] args) {
		Cubo c1 = new Cubo(4.0);
		System.out.println("O volume dese cubo é " + c1.calcularVolume());
		Esfera fera = new Esfera(10.0);
		System.out.println("O volume dessa esfera é " + fera.calcularVolume());
		
	}

}
