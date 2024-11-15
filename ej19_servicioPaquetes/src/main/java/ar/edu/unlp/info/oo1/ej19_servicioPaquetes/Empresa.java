package ar.edu.unlp.info.oo1.ej19_servicioPaquetes;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;

public class Empresa {
	private List<Cliente> clientes;
	
	public Empresa() {
		clientes = new LinkedList<Cliente>();
	}
	
	public void agregarEnvio(Cliente cliente, Envio envio) {
		clientes.stream()
			.filter(cli -> cli == cliente)
			.findFirst()
			.ifPresent(cli -> cli.agregarEnvio(envio));
	}
	
	public double montoAPagar(Cliente cliente, LocalDate fechaInicio, LocalDate fechaFin) {
		List<Envio> envios = cliente.devolverEnvios(fechaInicio, fechaFin);
		double monto = envios.stream()
									.mapToDouble(envio -> envio.montoAPagar())
									.sum();
		if (cliente instanceof Persona) return monto * 0.9;
		return monto;
	}
}
