package ar.edu.unlp.info.oo1.ej25_veterinaria;

public abstract class Servicio {
	protected Mascota mascota;
	
	public Servicio(Mascota mascota) {
		this.mascota = mascota;
	}
	
	public abstract double costoServicio();
}
