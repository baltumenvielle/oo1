package ar.edu.unlp.info.oo1.ej19_servicioPaquetes;

import java.time.LocalDate;

public class EnvioInterurbano extends Envio {
	private double distancia;

	public EnvioInterurbano(LocalDate fechaDespacho, String direccionOrigen, String direccionDestino, double peso, double distancia) {
		super(fechaDespacho, direccionOrigen, direccionDestino, peso);
		this.distancia = distancia;
	}

	@Override
	public double montoAPagar() {
		double precioDistancia = 20;
		if (distancia > 100 && distancia < 500) precioDistancia = 25;
		else if (distancia > 500) precioDistancia = 30;
		return precioDistancia * this.peso;
	}

}
