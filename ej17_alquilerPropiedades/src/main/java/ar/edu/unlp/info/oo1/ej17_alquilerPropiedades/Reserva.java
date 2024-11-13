package ar.edu.unlp.info.oo1.ej17_alquilerPropiedades;

public class Reserva {
	private DateLapse periodo;
	private int DNI;
	
	public Reserva(DateLapse periodo, int DNI) {
		this.DNI = DNI;
		this.periodo = periodo;
	}
	
	public DateLapse getPeriodo() {
		return this.periodo;
	}
	
	public double getDNI() {
		return this.DNI;
	}
	
	public int getDias() {
		return this.periodo.sizeInDays();
	}

}