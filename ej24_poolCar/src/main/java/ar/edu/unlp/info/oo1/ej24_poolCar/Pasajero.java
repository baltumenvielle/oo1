package ar.edu.unlp.info.oo1.ej24_poolCar;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;

public class Pasajero extends Usuario {
	private List<Viaje> viajes;
	
	public Pasajero(String nombre, double saldo) {
		super(nombre, saldo);
		viajes = new LinkedList<Viaje>();
	}
	
	public List<Viaje> getViajes() {
		return this.viajes;
	}
	
	private void agregarViaje(Viaje viaje) {
		viajes.add(viaje);
	}

	public void registrarseAViaje(Viaje viaje) {
		if (this.saldo > 0) {
			if (viaje.agregarPasajero(this)) this.agregarViaje(viaje);
		}
	}
	
	private boolean hizoViajes() {
		return viajes.size() > 0;
	}
	
	@Override
	protected double calcularBonificacion() {
		if (this.hizoViajes()) return 500;
		return 0;
	}

	@Override
	protected double calcularComision(double monto) {
		Viaje vi = viajes.stream()
		.filter(viaje -> viaje.menos30Dias(LocalDate.now()))
		.findAny().orElse(null);
		
		if (vi == null) return monto * 0.1;
		return 0;
	}
}
