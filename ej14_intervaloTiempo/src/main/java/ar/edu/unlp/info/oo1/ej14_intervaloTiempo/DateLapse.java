package ar.edu.unlp.info.oo1.ej14_intervaloTiempo;

import java.time.LocalDate;

public interface DateLapse {
	LocalDate getFrom();
	LocalDate getTo();
	int sizeInDays();
	boolean includesDate(LocalDate date);
}
