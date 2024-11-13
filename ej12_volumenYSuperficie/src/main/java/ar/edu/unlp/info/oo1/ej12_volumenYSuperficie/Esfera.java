package ar.edu.unlp.info.oo1.ej12_volumenYSuperficie;

public class Esfera extends Pieza {
	private int radio;
	
	public Esfera(String material, String color, int radio) {
		super(material, color);
		this.radio = radio;
	}
	
	public int getRadio() {
		return this.radio;
	}

	@Override
	public double getVolumen() {
		return Math.PI * Math.pow(radio, 3) * 4 / 3;
	}

	@Override
	public double getSuperficie() {
		return 4 * Math.PI * Math.pow(radio, 2);
	}

}
