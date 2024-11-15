package ar.edu.unlp.info.oo1.ej24_poolCar;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.LinkedList;
import java.util.List;

public class Viaje {
	private String origen, destino;
	private double costoTotal;
	private Vehiculo vehiculo;
	private LocalDate fechaViaje;
	private List<Usuario> pasajeros;
	
	public Viaje(String origen, String destino, double costoTotal, Vehiculo vehiculo, LocalDate fechaViaje, Conductor conductor) {
		this.origen = origen;
		this.destino = destino;
		this.costoTotal = costoTotal;
		this.vehiculo = vehiculo;
		this.fechaViaje = fechaViaje;
		pasajeros = new LinkedList<Usuario>();
		pasajeros.add(conductor);
	}
	
	public LocalDate getFechaViaje() {
		return this.fechaViaje;
	}
	
	private boolean hayCapacidad() {
		return pasajeros.size() <= vehiculo.getCapacidad();
	}
	
	private boolean sePuedeRealizar() {
		return LocalDate.now().isBefore(fechaViaje.minusDays(2)) && this.hayCapacidad();
	}
	
	public boolean agregarPasajero(Pasajero pasajero) {
		if (this.sePuedeRealizar()) {
			pasajeros.add(pasajero);
			return true;
		}
		return false;
	}
	
	public void procesarViaje() {
		double sueldoADescontar = costoTotal / pasajeros.size();
		pasajeros.stream()
		.forEach(pasajero -> pasajero.descontarSaldo(sueldoADescontar));
	}
	
	public boolean menos30Dias(LocalDate fecha) {
		return ChronoUnit.DAYS.between(fechaViaje, fecha) <= 30;
	}
}
