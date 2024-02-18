package br.com.fiap;

public class Cubo {

	private Double lado;
	
	public Cubo() {
		
	}

	public Cubo(Double lado) {
		this.lado = lado;
	}


	public Double getLado() {
		return lado;
	}

	public void setLado(Double lado) {
		this.lado = lado;
	}
	
	public Double calcularVolume() {
		Double volume = Math.pow(lado, 3);
		return volume;
	}
	
}
