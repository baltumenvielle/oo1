package ar.edu.unlp.info.oo1.ej25_veterinaria;

import java.time.LocalDate;

public class ConsultaMedica extends Servicio {
	private Medico medico;
	private LocalDate fechaAtencion;
	
	public ConsultaMedica(Mascota mascota, Medico medico) {
		super(mascota);
		this.medico = medico;
		this.fechaAtencion = LocalDate.now();
	}

	public Medico getMedico() {
		return medico;
	}

	public LocalDate getFechaAtencion() {
		return fechaAtencion;
	}

	@Override
	public double costoServicio() {
		double extra = 0;
		if (this.fechaAtencion.getDayOfWeek().getValue() == 7) extra = 200;
		return medico.getHonorarios() + 300 + extra + medico.getAntiguedad() * 100;
	}
}
