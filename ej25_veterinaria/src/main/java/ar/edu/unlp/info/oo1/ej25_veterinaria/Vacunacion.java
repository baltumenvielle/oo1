package ar.edu.unlp.info.oo1.ej25_veterinaria;

import java.time.LocalDate;

public class Vacunacion extends Servicio {
	private Medico medico;
	private String nombreVacuna;
	private double costoVacuna;
	private LocalDate fechaVacunacion;
	
	public Vacunacion(Mascota mascota, Medico medico, String nombreVacuna, double costoVacuna) {
		super(mascota);
		this.medico = medico;
		this.nombreVacuna = nombreVacuna;
		this.costoVacuna = costoVacuna;
		this.fechaVacunacion = LocalDate.now();
	}

	public Medico getMedico() {
		return this.medico;
	}

	public String getNombreVacuna() {
		return this.nombreVacuna;
	}
	
	public double getCostoVacuna() {
		return this.costoVacuna;
	}

	@Override
	public double costoServicio() {
		double extra = 0;
		if (this.fechaVacunacion.getDayOfWeek().getValue() == 7) extra = 200;
		return this.medico.getHonorarios() + 500 + extra + this.costoVacuna;
	}
	
}
