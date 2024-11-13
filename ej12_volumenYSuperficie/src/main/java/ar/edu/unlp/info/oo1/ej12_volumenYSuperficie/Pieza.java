package ar.edu.unlp.info.oo1.ej12_volumenYSuperficie;

public abstract class Pieza {
	private String material, color;
	
	public Pieza(String material, String color) {
		this.material = material;
		this.color = color;
	}
	
	public String getMaterial() {
		return this.material;
	}
	
	public String getColor() {
		return this.color;
	}
	
	public abstract double getVolumen();
	public abstract double getSuperficie();
}
