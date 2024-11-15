package ar.edu.unlp.info.oo1.ej19_servicioPaquetes;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public abstract class Cliente {
	private String nombre, direccion;
	List<Envio> envios;
	
	public Cliente(String nombre, String direccion) {
		this.nombre = nombre;
		this.direccion = direccion;
		envios = new LinkedList<Envio>();
	}

	public void agregarEnvio(Envio envio) {
		envios.add(envio);
	}
	
	public List<Envio> devolverEnvios(LocalDate fechaInicio, LocalDate fechaFin) {
		return envios.stream()
				.filter(envio -> envio.getFechaDespacho().isAfter(fechaInicio) && envio.getFechaDespacho().isBefore(fechaFin))
				.collect(Collectors.toList());
	}
}
