package ar.edu.unlp.info.oo1.balanzaElectronica;

public class Producto {
	
	private double peso, precioPorKilo;
	private String descripcion;
	
	public double getPrecio() {
		return peso * precioPorKilo;
	}
	public double getPeso() {
		return peso;
	}
	
	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	public double getPrecioPorKilo() {
		return precioPorKilo;
	}

	public void setPrecioPorKilo(double pesoPorKilo) {
		this.precioPorKilo = pesoPorKilo;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	public String getDescripcion() {
		return descripcion;
	}
	
}
