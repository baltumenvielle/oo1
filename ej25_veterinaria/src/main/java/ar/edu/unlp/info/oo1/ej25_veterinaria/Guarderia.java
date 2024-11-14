package ar.edu.unlp.info.oo1.ej25_veterinaria;

public class Guarderia extends Servicio {
	private int dias;
	
	public Guarderia(Mascota mascota, int dias) {
		super(mascota);
		this.dias = dias;
	}

	public int getDias() {
		return dias;
	}

	@Override
	public double costoServicio() {
		double descuento = 0;
		if (this.mascota.masDe5()) descuento = 500 * dias * 0.1;
		return 500 * dias - descuento;
	}
	
}
