package ar.edu.unlp.info.oo1.ej12_volumenYSuperficie;

public class PrismaRectangular extends Pieza {

	private int ladoMayor, ladoMenor, altura;

	public PrismaRectangular(String material, String color, int unLado, int otroLado, int altura) {
		super(material, color);
		if (unLado > otroLado) {
			this.ladoMayor = unLado;
			this.ladoMenor = otroLado;
		}
		else {
			this.ladoMayor = otroLado;
			this.ladoMenor = unLado;
		}
		this.altura = altura;
	}
	
	public int getLadoMayor() {
		return this.ladoMayor;
	}
	
	public int getLadoMenor() {
		return this.ladoMenor;
	}
	
	public int getAltura() {
		return this.altura;
	}

	@Override
	public double getVolumen() {
		return ladoMayor * ladoMenor * altura;
	}

	@Override
	public double getSuperficie() {
		return 2 * (ladoMayor * ladoMenor + ladoMayor * altura + ladoMenor * altura);
	}
	
	
}
