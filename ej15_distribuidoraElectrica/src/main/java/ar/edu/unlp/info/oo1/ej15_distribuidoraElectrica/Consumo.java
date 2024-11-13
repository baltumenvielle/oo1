package ar.edu.unlp.info.oo1.ej15_distribuidoraElectrica;

public class Consumo {
	private double energiaReactiva, energiaActiva;
	
	public Consumo(double energiaReactiva, double energiaActiva) {
		this.energiaReactiva = energiaReactiva;
		this.energiaActiva = energiaActiva;
	}

	public double getEnergiaActiva() {
		return this.energiaActiva;
	}
	
	public double getEnergiaReactiva() {
		return this.energiaReactiva;
	}
	
	public double getFPE() {
		return this.energiaActiva / (Math.sqrt(Math.pow(this.energiaActiva, 2) + Math.pow(this.energiaReactiva, 2)));
	}
	
}
