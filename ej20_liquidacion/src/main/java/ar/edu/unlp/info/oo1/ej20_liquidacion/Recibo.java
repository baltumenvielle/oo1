package ar.edu.unlp.info.oo1.ej20_liquidacion;

import java.time.LocalDate;

public class Recibo {
	private String nombre, apellido;
	private int CUIL, antiguedad;
	private LocalDate fechaGeneracion;
	private double montoTotal;
	
	public Recibo(String nombre, String apellido, int CUIL, int antiguedad, double montoTotal) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.CUIL = CUIL;
		this.antiguedad = antiguedad;
		this.montoTotal = montoTotal;
		this.fechaGeneracion = LocalDate.now();
	}
}
