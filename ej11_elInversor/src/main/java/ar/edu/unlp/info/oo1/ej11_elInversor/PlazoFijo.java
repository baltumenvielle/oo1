package ar.edu.unlp.info.oo1.ej11_elInversor;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class PlazoFijo extends Inversion {
	
	private LocalDate fechaDeConstitucion;
	private double montoDepositado, porcentajeDeInteresDiario;
	
	public PlazoFijo(double montoDepositado, double porcentajeDeInteresDiario) {
		fechaDeConstitucion = LocalDate.now();
		this.montoDepositado = montoDepositado;
		this.porcentajeDeInteresDiario = porcentajeDeInteresDiario;
	}
	
	public LocalDate getFechaDeConstitucion() {
		return this.fechaDeConstitucion;
	}
	
	public double getMontoDepositado() {
		return this.montoDepositado;
	}
	
	public double getPorcentajeDeInteresDiario() {
		return this.porcentajeDeInteresDiario;
	}
	
	@Override
	public double calcularValor() {
		long dias = ChronoUnit.DAYS.between(fechaDeConstitucion, LocalDate.now());
		double interes = Math.pow(1 + porcentajeDeInteresDiario / 100, dias);
		return montoDepositado * interes;
	}

}
