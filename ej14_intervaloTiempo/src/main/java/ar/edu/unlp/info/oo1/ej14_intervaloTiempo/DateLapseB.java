package ar.edu.unlp.info.oo1.ej14_intervaloTiempo;

import java.time.LocalDate;

public class DateLapseB implements DateLapse {
	private LocalDate from;
	private int sizeInDays;
	
	public DateLapseB(LocalDate from, int sizeInDays) {
		this.from = from;
		this.sizeInDays = sizeInDays;
	}
	
	@Override
	public LocalDate getFrom() {
		return this.from;
	}

	@Override
	public LocalDate getTo() {
		return this.from.plusDays(sizeInDays);
	}

	@Override
	public int sizeInDays() {
		return this.sizeInDays;
	}

	@Override
	public boolean includesDate(LocalDate date) {
        return !date.isBefore(from) && !date.isAfter(getTo());
	}
	
	
}
