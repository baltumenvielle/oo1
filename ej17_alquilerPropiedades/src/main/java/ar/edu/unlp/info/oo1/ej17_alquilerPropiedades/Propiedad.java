package ar.edu.unlp.info.oo1.ej17_alquilerPropiedades;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;

public class Propiedad {
	private String nombre, direccion;
	private double precioPorNoche;
	private List<Reserva> reservas;
	private PoliticaCancelacion politica;
	
	public Propiedad(String nombre, String direccion, double precioPorNoche, PoliticaCancelacion politica) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.precioPorNoche = precioPorNoche;
		this.politica = politica;
		reservas = new LinkedList<Reserva>();
	}
	
	public void setPoliticaCancelacion(PoliticaCancelacion politica) {
        this.politica = politica;
    }
	
	public String getNombre() {
		return this.nombre;
	}
	
	public String getDireccion() {
		return this.direccion;
	}
	
	public double getPrecioPorNoche() {
		return this.precioPorNoche;
	}
	
	public List<Reserva> getReservas() {
		return this.reservas;
	}
	
	public void hacerReserva(Reserva reserva) {
		this.reservas.add(reserva);
	}
	
	public double cancelarReserva(Reserva reserva) {
		if (!reservas.contains(reserva)) return -1;
		if (reserva.getPeriodo().includesDate(LocalDate.now())) return -1;
		reservas.remove(reserva);
		return politica.calcularReembolso(reserva, this);
	}
	
	public double calcularPrecio(Reserva reserva) {
		if (!reservas.contains(reserva)) return -1;
		return reserva.getDias() * this.getPrecioPorNoche();
	}
	
	public double precioEnPeriodo(DateLapse periodo) {
		return reservas.stream()
				.filter(reserva -> reserva.getPeriodo().overlaps(periodo))
				.mapToDouble(this::calcularPrecio)
				.sum();
	}
}
