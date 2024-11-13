package ar.edu.unlp.info.oo1.ej24_poolCar;

import java.time.LocalDate;

public class Conductor extends Usuario {
	private Vehiculo vehiculo;

	@Override
	public void descontarSaldo(double costo) {
		this.saldo -= costo - 0.1 * vehiculo.getValorMercado();
	}

	@Override
	public double calcularComision(double monto) {
		if (LocalDate.now().getYear() - vehiculo.getAñoFabricacion() < 5) return monto * 0.01;
		return monto * 0.1;
	}
}