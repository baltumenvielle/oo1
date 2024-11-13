package ar.edu.unlp.info.oo1.ej15_distribuidoraElectrica;

import java.time.LocalDate;

public class Factura {
	private String usuario;
	private LocalDate fechaEmision;
	private double bonificacion, montoFinal;
	
	public Factura(String usuario, double bonificacion, double montoFinal) {
		this.usuario = usuario;
		this.bonificacion = bonificacion;
		this.montoFinal = montoFinal;
		fechaEmision = LocalDate.now();
	}

	public String getUsuario() {
		return this.usuario;
	}

	public LocalDate getFechaEmision() {
		return this.fechaEmision;
	}

	public double getBonificacion() {
		return this.bonificacion;
	}

	public double getMontoFinal() {
		return this.montoFinal;
	}
	
}
