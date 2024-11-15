package ar.edu.unlp.info.oo1.ej24_poolCar;

import java.time.LocalDate;

public class Conductor extends Usuario {
	private Vehiculo vehiculo;
	
	public Conductor(String nombre, double saldo, Vehiculo vehiculo) {
		super(nombre, saldo);
		this.vehiculo = vehiculo;
	}

	public Vehiculo getVehiculo() {
		return this.vehiculo;
	}

	@Override
	protected double calcularBonificacion() {
		return this.vehiculo.getValorMercado() * 0.1;
	}

	@Override
	protected double calcularComision(double monto) {
		if (LocalDate.now().getYear() - vehiculo.getAñoFabricacion() < 5) return monto * 0.01;
		return monto * 0.1;
	}
}
