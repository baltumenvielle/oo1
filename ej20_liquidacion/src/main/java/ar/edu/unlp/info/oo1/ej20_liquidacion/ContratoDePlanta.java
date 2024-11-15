package ar.edu.unlp.info.oo1.ej20_liquidacion;

import java.time.LocalDate;

public class ContratoDePlanta extends Contrato {
	private double sueldo, montoConyuge, montoHijos;
	
	public ContratoDePlanta(LocalDate fechaInicio, double sueldo) {
		super(fechaInicio);
		this.sueldo = sueldo;
	}
	
	public void setMontoConyuge(double montoConyuge) {
		this.montoConyuge = montoConyuge;
	}

	public void setMontoHijos(double montoHijos) {
		this.montoHijos = montoHijos;
	}

	@Override
	public boolean estaVigente() {
		return true;
	}
	
	@Override
	public double calcularMonto() {
		return this.sueldo + this.montoConyuge + this.montoHijos;
	}
}
