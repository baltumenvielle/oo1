package ar.edu.unlp.info.oo1.ej19_servicioPaquetes;

import java.time.LocalDate;

public class EnvioInternacional extends Envio {

	public EnvioInternacional(LocalDate fechaDespacho, String direccionOrigen, String direccionDestino, double peso) {
		super(fechaDespacho, direccionOrigen, direccionDestino, peso);
	}

	@Override
	public double montoAPagar() {
		double precioPeso = 10;
		if (peso > 1) precioPeso = 12; 
		return 5000 + precioPeso * this.peso;
	}

}
