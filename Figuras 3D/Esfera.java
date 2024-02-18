package br.com.fiap;

public class Esfera extends Figura3D {
	
	private Double raio;
	
	public Esfera() {}
	
	public Esfera(Double raio) {
		this.raio = raio;
	}
	
	public Double getRaio( ) {
		return raio;
	}

	public void settRaio(Double raio ) {
		this.raio = raio;
	}
	
	public Double calcularVolume() {
		Double volume = (3.14 * Math.pow(raio, 3)) * (4/3);
		return volume;
	}
	
	
}
