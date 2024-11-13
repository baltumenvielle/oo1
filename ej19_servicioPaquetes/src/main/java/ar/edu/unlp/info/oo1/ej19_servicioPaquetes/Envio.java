package ar.edu.unlp.info.oo1.ej19_servicioPaquetes;

import java.time.LocalDate;

public abstract class Envio {
	private LocalDate fechaDespacho;
	private String direccionOrigen, direccionDestino;
	protected double peso;
	
	public Envio(LocalDate fechaDespacho, String direccionOrigen, String direccionDestino, double peso) {
		this.fechaDespacho = fechaDespacho;
		this.direccionOrigen = direccionOrigen;
		this.direccionDestino = direccionDestino;
		this.peso = peso;
	}
	
	public LocalDate getFechaDespacho() {
		return this.fechaDespacho;
	}
	
	public abstract double montoAPagar();
}
