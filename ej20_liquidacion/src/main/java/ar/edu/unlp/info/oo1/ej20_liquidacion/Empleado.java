package ar.edu.unlp.info.oo1.ej20_liquidacion;

import java.time.LocalDate;
import java.util.List;

public class Empleado {
	private String nombre, apellido;
	private int CUIL;
	private LocalDate fechaNacimiento;
	private boolean hijosACargo;
	List<Contrato> contratos;
	
	public String getNombre() {
		return nombre;
	}
	
	public String getApellido() {
		return apellido;
	}
	
	public int getCUIL() {
		return CUIL;
	}
	
	public int getAntiguedad() {
		return contratos.stream()
				.
	}
	
	public Contrato getContratoVigente() {
		return contratos.stream()
					.filter(contrato -> contrato.estaVigente())
					.findFirst()
					.orElse(null);
	}
	
	public double calcularMonto() {
		Contrato contrato = this.getContratoVigente();
		int antiguedad = this.getAntiguedad();
		if (antiguedad < 5) return contrato.calcularMonto();
		else if (antiguedad > 5 && antiguedad < 10) return contrato.calcularMonto() * 1.3;
		else if (antiguedad > 10 && antiguedad < 15) return contrato.calcularMonto() * 1.5;
		else if (antiguedad > 15 && antiguedad < 20) return contrato.calcularMonto() * 1.7;
		else return contrato.calcularMonto() * 2;
	}
	
}
