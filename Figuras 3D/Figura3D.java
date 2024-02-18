package br.com.fiap;

public class Figura3D {

	private Double volume;
	private Double altura;
	
	public Figura3D() {
		
	}
	
	public Figura3D(Double volume, Double altura) {
		setVolume(volume);
		setAltura(altura);
	
	}
		public Figura3D(Double altura) {
		
	}

	
	
	public void setVolume(Double v ) {
		this.volume = v;
	}
	
	public Double getVolume() {
		return this.volume;
		
	}
	
	public Double getAltura() {
		return altura;
		
	}
	
	public void setAltura(Double altura) {
		this.altura = altura;
	}
	
	public Double calcularVolume() {
		return null;
	}
	
	
	
}


