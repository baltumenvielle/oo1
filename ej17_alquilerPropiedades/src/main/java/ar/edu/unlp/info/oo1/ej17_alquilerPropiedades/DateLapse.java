package ar.edu.unlp.info.oo1.ej17_alquilerPropiedades;

import java.time.LocalDate;

public interface DateLapse {
	LocalDate getFrom();
	LocalDate getTo();
	int sizeInDays();
	boolean includesDate(LocalDate date);
	public boolean overlaps(DateLapse anotherDateLapse);
}
