package ar.edu.unlp.info.oo1.ej14_intervaloTiempo;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DateLapseA implements DateLapse {
	private LocalDate from, to;
	
	public DateLapseA(LocalDate from, LocalDate to) {
		this.from = from;
		this.to = to;
	}
	
	@Override
	public LocalDate getFrom() {
		return this.from;
	}
	
	@Override
	public LocalDate getTo() {
		return this.to;
	}
	
	@Override
	public int sizeInDays() {
		return (int) ChronoUnit.DAYS.between(from, to);
	}
	
	@Override
	public boolean includesDate(LocalDate other) {
		return !other.isBefore(from) && !other.isAfter(to);
	}
}
