package ar.edu.unlp.info.oo1.ej17_alquilerPropiedades;

public class PoliticaFlexible implements PoliticaCancelacion {
	
	@Override
	public double calcularReembolso(Reserva reserva, Propiedad propiedad) {
		return propiedad.calcularPrecio(reserva);
	}
	
}
