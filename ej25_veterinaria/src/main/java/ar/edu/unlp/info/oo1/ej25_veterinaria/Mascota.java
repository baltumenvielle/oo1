package ar.edu.unlp.info.oo1.ej25_veterinaria;

import java.time.LocalDate;
import java.util.List;
import java.util.LinkedList;

public class Mascota {
	private String nombre, especie;
	private LocalDate fechaNacimiento;
	private List<Servicio> serviciosDados;
	
	public Mascota(String nombre, String especie, LocalDate fechaNacimiento) {
		this.nombre = nombre;
		this.especie = especie;
		this.fechaNacimiento = fechaNacimiento;
		serviciosDados = new LinkedList<Servicio>();
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public String getEspecie() {
		return this.especie;
	}

	public LocalDate getFechaNacimiento() {
		return this.fechaNacimiento;
	}

	public List<Servicio> getServiciosDados() {
		return this.serviciosDados;
	}
	
	public LocalDate altaConsulta(Medico medico) {
		ConsultaMedica c = new ConsultaMedica(this, medico);
		serviciosDados.add(c);
		return LocalDate.now();
	}
	
	public LocalDate altaVacunacion(Medico medico, String nombreVacuna, double costoVacuna) {
		Vacunacion v = new Vacunacion(this, medico, nombreVacuna, costoVacuna);
		serviciosDados.add(v);
		return LocalDate.now();
	}
	
	public LocalDate altaGuarderia(int dias) {
		Guarderia g = new Guarderia(this, dias);
		serviciosDados.add(g);
		return LocalDate.now();
	}
	
	public boolean masDe5() {
		return serviciosDados.size() >= 5;
	}

	public double recaudacion(LocalDate fecha) {
		return serviciosDados.stream()
				.filter(servicio -> servicio.getFecha().)
				.mapToDouble(servicio -> servicio.costoServicio())
				.sum();
	}
}
