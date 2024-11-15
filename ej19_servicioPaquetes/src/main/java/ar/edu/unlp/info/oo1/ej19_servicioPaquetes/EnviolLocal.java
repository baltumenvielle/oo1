package ar.edu.unlp.info.oo1.ej19_servicioPaquetes;

import java.time.LocalDate;

public class EnviolLocal extends Envio {
	private boolean entregaRapida;
	
	public EnviolLocal(LocalDate fechaDespacho, String direccionOrigen, String direccionDestino, double peso, boolean entregaRapida) {
		super(fechaDespacho, direccionOrigen, direccionDestino, peso);
		this.entregaRapida = entregaRapida;
	}

	@Override
	public double montoAPagar() {
		if (entregaRapida) return 1500;
		return 1000;
	}
}
