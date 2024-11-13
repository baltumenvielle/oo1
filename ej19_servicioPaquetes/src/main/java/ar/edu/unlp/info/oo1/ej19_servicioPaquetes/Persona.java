package ar.edu.unlp.info.oo1.ej19_servicioPaquetes;

public class Persona extends Cliente {
	private int DNI;
	
	public Persona(String nombre, String direccion, int DNI) {
		super(nombre, direccion);
		this.DNI = DNI;
	}
}
