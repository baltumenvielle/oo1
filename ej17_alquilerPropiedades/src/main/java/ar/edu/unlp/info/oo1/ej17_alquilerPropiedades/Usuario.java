package ar.edu.unlp.info.oo1.ej17_alquilerPropiedades;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;

public class Usuario {
	private String nombre, direccion;
	private int DNI;
	List<Propiedad> propiedades;
	
	public Usuario(String nombre, String direccion, int DNI) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.DNI = DNI;
		propiedades = new LinkedList<Propiedad>();
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public String getDireccion() {
		return this.direccion;
	}
	
	public int getDNI() {
		return this.DNI;
	}
	
	public List<Propiedad> getPropiedades() {
		return this.propiedades;
	}

	public boolean estaDisponible(Propiedad propiedad, LocalDate fechaInicio, LocalDate fechaFin) {
		if (!propiedades.contains(propiedad)) return false;
		
		return propiedad.getReservas().stream()
				.noneMatch(reserva -> reserva.getPeriodo().overlaps(new DateLapseA(fechaInicio, fechaFin)));
	}
	
	public void crearReserva(Propiedad propiedad, LocalDate fechaInicio, LocalDate fechaFin) {
		if (!this.estaDisponible(propiedad, fechaInicio, fechaFin)) return;
		propiedad.hacerReserva(new Reserva(new DateLapseA(fechaInicio, fechaFin), this.getDNI()));
	}

	public double calcularIngresos(LocalDate fechaInicio, LocalDate fechaFin) {
		return propiedades.stream()
				.mapToDouble(propiedad -> propiedad.precioEnPeriodo(new DateLapseA(fechaInicio, fechaFin)))
				.sum() * 0.75;
	}
}
