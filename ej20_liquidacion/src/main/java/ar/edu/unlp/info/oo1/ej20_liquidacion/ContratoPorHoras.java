package ar.edu.unlp.info.oo1.ej20_liquidacion;

import java.time.LocalDate;

public class ContratoPorHoras extends Contrato {
	private LocalDate fechaFin;
	private double valorHora;
	private int horas;
	
	public ContratoPorHoras(LocalDate fechaInicio, LocalDate fechaFin, double valorHora, int horas) {
		super(fechaInicio);
		this.fechaFin = fechaFin;
		this.valorHora = valorHora;
		this.horas = horas;
	}
	
	@Override
	public boolean estaVigente() {
		return LocalDate.now().isBefore(fechaFin);
	}
	
	@Override
	public double calcularMonto() {
		return this.valorHora * this.horas;
	}
}
