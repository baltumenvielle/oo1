package ar.edu.unlp.info.oo1.ej17_alquilerPropiedades;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class PoliticaModerada implements PoliticaCancelacion {

	@Override
	public double calcularReembolso(Reserva reserva, Propiedad propiedad) {
		long diasAntes = ChronoUnit.DAYS.between(LocalDate.now(), reserva.getPeriodo().getFrom());
		if (diasAntes >= 7) return propiedad.calcularPrecio(reserva);
		return propiedad.calcularPrecio(reserva) * 0.5;
	}

}
